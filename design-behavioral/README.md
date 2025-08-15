# 行为型

## 责任链模式

责任链模式——某个请求需要多个对象进行处理，从而避免请求的发送者和接收之间的耦合关系。将这些对象连成一条链子，并沿着这条链子传递该请求，直到有对象处理它为止。主要涉及两个角色：


- 抽象处理者角色（Handler）：定义出一个处理请求的接口。这个接口通常由接口或抽象类来实现。
- 具体处理者角色（ConcreteHandler）：具体处理者接受到请求后，可以选择将该请求处理掉，或者将请求传给下一个处理者。因此，每个具体处理者需要保存下一个处理者的引用，以便把请求传递下去。

### 优缺点比较

**优点**

- 降低耦合度。它将请求的发送者和接收者解耦 
- 简化了对象，使得对象不需要知道链的结构 
- 增强给对象指派职责的灵活性，允许动态地新增或者删除责任链 
- 增加新的请求处理类方便

**缺点**

- 不能保证请求一定被接收； 
- 当链条过长时，系统性能将受到一定影响，调试时不方便，可能会造成循环调用


### 源码中的应用

1. JDK的ClassLoader加载类`Launcher`。
   - 双亲委派模型里的层级委派就使用了责任链模式。
2. Spring中的拦截器



## 观察者模式

当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知依赖它的对象。观察者模式属于行为型模式。

- 主题（Subject）：也称为被观察者或可观察者，它是具有状态的对象，并维护着一个观察者列表。主题提供了添加、删除和通知观察者的方法。
- 观察者（Observer）：观察者是接收主题通知的对象。观察者需要实现一个更新方法，当收到主题的通知时，调用该方法进行更新操作。
- 具体主题（Concrete Subject）：具体主题是主题的具体实现类。它维护着观察者列表，并在状态发生改变时通知观察者。
- 具体观察者（Concrete Observer）：具体观察者是观察者的具体实现类。它实现了更新方法，定义了在收到主题通知时需要执行的具体操作。

在一对多的情况下，当一个对象被修改时，通知它所依赖的多个对象，这种就是观察者模式，类似**发布-订阅模式**。

![observer_pattern_uml_diagram](https://s2.loli.net/2025/08/15/fBn3rxIWHvGcPJ7.jpg)





### 源码中的应用

- K8s中的 `list- watch`
- JDK中监听文件变化的 watch-service

```java
    /**
     * 需要观察的状态
     *
     * @param state
     */
    public void setState(int state) {
        this.state = state;
        //更改状态时，通知所有观察者
        notifyAllObservers();
    }
```



### 测试代码

核心就是当被观察者修改时，通知观察者。

- 被观察者

  ```java
  public class Subject {
  
      /**
       * 观察者列表
       */
      private final List<Observer> observerList=new ArrayList<>();
  
      private int state;
  
      public int getState() {
          return state;
      }
  
      public void setState(int state) {
          this.state = state;
          //更改状态时，通知所有观察者
          notifyAllObservers();
      }
  
      public void attach(Observer observer){
          observerList.add(observer);
      }
  
      //通知所有观察者
      public void notifyAllObservers(){
          observerList.forEach(Observer::update);
      }
  
  }
  
  ```

- 观察者

  ```java
  public abstract class Observer {
  
      protected Subject subject;
  
      public abstract void update();
  
  }
  
  public class BinaryObserver extends Observer {
      public BinaryObserver(Subject subject){
          this.subject=subject;
          //添加观察者
          this.subject.attach(this);
      }
  
      @Override
      public void update() {
          System.out.println("Binary Info:"+Integer.toBinaryString(subject.getState()).toLowerCase());
      }
  }
  ```

- 测试类

  ```java
  public class TestObserver {
  
      public static void main(String[] args) {
          //被观察者
          Subject subject = new Subject();
  
          //观察者
          new BinaryObserver(subject);
          new HexaObserver(subject);
          new OctalObserver(subject);
  
          System.out.println("-----------------2--------------------");
          subject.setState(2);
  
          System.out.println("-----------------10------------------");
          subject.setState(10);
      }
  
  }
  ```







## 策略模式

在策略模式（Strategy Pattern）中一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。

在策略模式定义了一系列算法或策略，并将每个算法封装在独立的类中，使得它们可以互相替换。通过使用策略模式，可以在运行时根据需要选择不同的算法，而不需要修改客户端代码。

![策略模式的 UML 图](https://s2.loli.net/2025/08/15/LzKdjf1iSHtAv5U.jpg)

- Factory：策略工厂，维护策略类。根据不同类型获取不同策略。
- 抽象策略：定义了策略对象的公共接口或抽象类，规定了具体策略类必须实现的方法。
- 具体策略：实现了抽象策略定义的接口或抽象类，包含了具体的算法实现。





### 参考链接

使用工厂模式和策略模式消灭if-else

1. 外卖平台上的某家店铺为了促销，设置了多种会员优惠，其中包含超级会员折扣8折、普通会员折扣9折和普通用户没有折扣三种。
2. 希望用户在付款的时候，根据用户的会员等级，就可以知道用户符合哪种折扣策略，进而进行打折，计算出应付金额。
3. 随着业务发展，新的需求要求专属会员要在店铺下单金额大于30元的时候才可以享受优惠。
4. 接着，又有一个变态的需求，如果用户的超级会员已经到期了，并且到期时间在一周内，那么就对用户的单笔订单按照超级会员进行折扣，并在收银台进行强提醒，引导用户再次开通会员，而且折扣只进行一次。

![](https://s2.loli.net/2025/05/29/NAtik6vYrSUe7PE.png)

作者：漫话编程</br>
链接：https://juejin.cn/post/6844903974525468680
来源：掘金
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。





## 状态模式

**类的行为基于状态改变，**即为状态模式。

![](https://s2.loli.net/2025/05/29/uWt5AXijxarS8PU.png)

### 解决问题

> 允许一个对象在内部状态改变时改变其行为，看起来就像改变了其类一样。
> 

当代码中存在大量条件语句，并且条件跟状态有关时。可以使用状态模式。

内部不需要写大量 if-else，根据传入的状态执行对应的行为即可。（使用时只需要关注状态，状态对应的事件不需要关注）

### 实现

- 状态接口 - State
- 具体状态类 - State Impl
  
    不同状态实现不同的行为。负责处理该状态相关的行为。
    
- 上下文 - Context
  
    包含对状态对象的引用，在状态改变时改变其行为。
    

[状态模式 | 菜鸟教程](https://www.runoob.com/design-pattern/state-pattern.html)



## 模板模式

模板是规定了固定步骤的方法，来实现预期的功能。

解决在多个子类中重复实现相同的方法的问题，通过将通用方法抽象到父类中来避免代码重复。

[模板方法模式_赵sir来了的博客-CSDN博客](https://blog.csdn.net/qq_43389371/article/details/102533980)

![模板模式的 UML 图](https://s2.loli.net/2022/07/27/erd8TSWmDx6fbLi.jpg)

### 模板类

由抽象类（父类）约定有哪几个步骤，并提供模板方法来将步骤组合。

比如：

```java
setp1();
setp2();

main(){
    dosomething();
    setp1();
    setp2();
}
```

**不可变部分（dosomething) 由父类实现，可变部分 (setp1,setp2) 等由子类实现。**

```java
//抽象类
public abstract class AbstractRoom {

    public abstract Integer chooseRoomType(int roomType);

    public abstract void payment(int money);

    /**
     * 提高外部调用的方法
     * 规定了方法步骤，类似模板。
     * 子类去实现模板中的各个步骤。
     * 可变部分由子类去实现，不可变部分抽象类实现。
     */
    public final void getRoom(){
        System.out.println("欢迎光临");
        Integer money = chooseRoomType(1);
        payment(money);
        System.out.println("谢谢惠顾");
    }

}

//子类1
public class LowerRoom extends AbstractRoom {
    @Override
    public Integer chooseRoomType(int roomType) {
        System.out.println("房费固定50");
        return 50;
    }

    @Override
    public void payment(int money) {
        System.out.println("支付：" + money);
    }


}

//子类2
public class StarLevelRoom extends AbstractRoom {
    @Override
    public Integer chooseRoomType(int roomType) {
        System.out.println("房费不定");
        switch (roomType){
            case 1:
                return 300;
            case 2:
                return 500;
            case 3:
                return 1000;
            default:
               return 0;
        }
    }

    @Override
    public void payment(int money) {
        System.out.println("支付："+money);
    }


}

//测试类
public class TestRoom {

    public static void main(String[] args) {
        System.out.println("------1.入住星级酒店----------");
        AbstractRoom starLevelRoom = new StarLevelRoom();
        starLevelRoom.getRoom();
        System.out.println("------2.入住低端酒店----------");
        AbstractRoom lowerRoom = new LowerRoom();
        lowerRoom.getRoom();
    }


}
```







### redis数据前缀-模版方法

不同模块需要有自己的前缀，但是存 redis 的过程有很多共同之处。所以使用抽象类提供公共构建方法，而各个实现类提供各个模块的前缀和其它细节，接口类约定前缀和其它细节的方法。

**模版模式**

接口 -> 抽象类 -> 实现类

- 接口提供规定方法。
- 抽象类实现共有方法。
- 实现类实现特殊方法。

#### 代码实现

- 接口类
  
    ```java
    public interface KeyPrefix {
    
        /**
         * 约定key的失效时间
         * @return 缓存key的失效时间
         */
        int expireSeconds();
    
        /**
         * 约定key的前缀
         * @return 缓存key的前缀
         */
        String getPrefix();
    
    }
    ```
    
- 抽象类
  
    ```java
    public abstract class BasePrefix implements KeyPrefix {
    
        /**
         * 失效时间
         */
        private final int expireSeconds;
    
        /**
         * key值前缀
         */
        private final String prefix;
    
        public BasePrefix(String prefix) {
            //0代表永不过期
            this(0, prefix);
        }
    
        public BasePrefix(int expireSeconds, String prefix) {
            this.expireSeconds = expireSeconds;
            this.prefix = prefix;
        }
    
        @Override
        public int expireSeconds() {
            //默认0代表永不过期
            return expireSeconds;
        }
    
        @Override
        public String getPrefix() {
            String className = getClass().getSimpleName();
            return className + ":" + prefix + ":";
        }
    
    }
    ```
    
- 实现类
  
    ```java
    public class OrderKey extends BasePrefix {
    
        public OrderKey(String prefix) {
            super(prefix);
        }
    
        public OrderKey(int expireSeconds, String prefix) {
            super(expireSeconds, prefix);
        }
    
        public static OrderKey getMiaoshaOrderByUidGid = new OrderKey("miaoshaorder");
    
        public static String getMiaoshaOrderKey(long goodsId,long userId){
            return String.valueOf(goodsId) + userId;
        }
    
    }
    ```
    

## 命令模式

命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。

**请求以命令的形式包裹在对象中，并传给调用对象**。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。

它将请求（命令）封装成对象，使得可以用不同的请求对客户端进行参数化，具体的请求可以在运行时更改、排队或记录，它将发出者和接收者解耦（顺序：**发出者–>命令–>接收者**）

### 角色

- 抽象命令 - Command
- 具体命令 - Concrete Command
- 接收者 - Receiver
  
    实际执行命令的类。
    
- 调用者 - Invoker
  
    访问命令对象执行相关请求。
    

### 优点

1. 解耦合。将发出者和调用者解耦合。
2. 可扩展性。可以很方便的添加新的命令类和接受者类。

### 缺点

1. 类膨胀。
2. 额外开销。

### JDK中场景

1. Runnable接口
   
    典型的命令模式，Runnable接口封装了需要执行的任务，然后交给线程去执行。
    
    - Runnable是命令。
    - Runnable里面的方法是实际执行者。
2. Statement接口
   
    将SQL命令封装为 Statement对象，然后再由数据库驱动执行SQL命令。
    

## 解释器模式

解释器模式（Interpreter pattern）是一种行为型(Behavioral Pattern)的设计模式，用于定义语言的语法规则表示，并提供解释器来处理句子中的语法。该模式将句子表示为一个抽象语法树，每个节点代表一个语法规则，通过递归地解释这些节点来实现对句子的解释。

支持解析固定的表达式，并且支持扩展表达式。

比如数据表达式 加减乘除。

```java
"2 + 3 * 4 / 2"
```

![](https://s2.loli.net/2025/05/29/zmdWJeyhTs6Lxwc.png)



## 迭代器模式

迭代器模式提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。

**Java中的Iterator**：Java集合框架中的迭代器用于遍历集合元素。

![](https://s2.loli.net/2025/05/29/p7TB6cd1qU2exyu.png)

```java
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        Iterator<String> iterator = repository.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
```



## 中介者模式

通过引入一个中介者对象来封装和协调多个对象之间的交互，从而降低对象间的耦合度。

比如原本一对多的同事类关系，改变为一对一。

```java
     A
    /  \
   B -- C
  引入中介者改为
        A
        |   B -- D  -- C
```

- **WTO**：中国加入WTO后，各国通过WTO进行贸易，简化了双边关系。

- **聊天室**：用户之间聊天不是一对一，而是通过聊天室。





## 备忘录模式

备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象，备忘录模式属于行为型模式。

备忘录模式允许在不破坏封装性的前提下，捕获和恢复对象的内部状态。

- **游戏存档**：保存游戏进度，允许玩家加载之前的存档。
- **数据库事务管理**：通过事务日志保存状态，实现回滚。

![](https://s2.loli.net/2025/05/29/f5tkzTrcMp8ov1X.png)

- **备忘录（Memento）**：负责存储原发器对象的内部状态。备忘录可以保持原发器的状态的一部分或全部信息。
- **原发器（Originator）**：创建一个备忘录对象，并且可以使用备忘录对象恢复自身的内部状态。原发器通常会在需要保存状态的时候创建备忘录对象，并在需要恢复状态的时候使用备忘录对象。
- **负责人（Caretaker）**：负责保存备忘录对象，但是不对备忘录对象进行操作或检查。负责人只能将备忘录传递给其他对象。

## 访问者模式

提供一个作用于某对象结构中的各元素的操作表示，它使我们可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

访问者模式包含**访问者**和**被访问元素**两个主要组成部分。

该模式的核心在于将一个对象的集合与作用于这些对象上的操作分离，这样可以在不修改原有对象结构的情况下，增加新的操作。

比如处方单中的各种药品信息就是**被访问的元素**，而划价人员和药房工作人员就是**访问者**，被访问的元素通常具有不同的类型，且不同的访问者可以对它们进行不同的访问操作。

![](https://s2.loli.net/2025/05/29/EMC6nxzbYm54vaq.png)

1. Visitor（访问者）：为对象结构中每一个具体元素类（ConcreteElement）声明一个访问操作接口。这个接口使得该访问者可以访问每一个元素，并且可以不通过访问者接口的访问来修改元素的类。
2. ConcreteVisitor（具体访问者）：实现Visitor接口，它给每个ConcreteElement一个访问操作。这个操作根据需要，可能会修改访问者状态，并导向对结构中元素的访问。
3. Element（元素）：定义一个接受访问者的元素接口。
4. ConcreteElement（具体元素）：实现Element接口，存储或定义元素的数据。它包含一个接受访问者对象的操作，这个操作通过调用访问者的访问方法来增加新的操作。
5. ObjectStructure（对象结构）：这是一个元素的集合，能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素。