

# 行为型模式

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
双亲委派模型里的层级委派就使用了责任链模式。

2. 拦截器（待研究）


## 策略模式

思维导图见：design-strategy/策略模式思维导图思维导图.png

参考链接：https://juejin.cn/post/6844903842748841991


### 使用工厂模式和策略模式消灭if-else

#### 需求

>1、外卖平台上的某家店铺为了促销，设置了多种会员优惠，其中包含超级会员折扣8折、普通会员折扣9折和普通用户没有折扣三种。
>2、希望用户在付款的时候，根据用户的会员等级，就可以知道用户符合哪种折扣策略，进而进行打折，计算出应付金额。
>3、随着业务发展，新的需求要求专属会员要在店铺下单金额大于30元的时候才可以享受优惠。
>4、接着，又有一个变态的需求，如果用户的超级会员已经到期了，并且到期时间在一周内，那么就对用户的单笔订单按照超级会员进行折扣，并在收银台进行强提醒，引导用户再次开通会员，而且折扣只进行一次。



作者：漫话编程</br>
链接：https://juejin.cn/post/6844903974525468680
来源：掘金
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。





## 模板方法

模板是规定了固定步骤的方法，来实现预期的功能。

![模板模式的 UML 图](https://s2.loli.net/2022/07/27/erd8TSWmDx6fbLi.jpg)

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



## 观察者模式

在一对多的情况下，当一个对象被修改时，通知它所依赖的多个对象，这种就是观察者模式，类似**发布-订阅模式**。

![观察者模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/observer_pattern_uml_diagram.jpg)

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

  
