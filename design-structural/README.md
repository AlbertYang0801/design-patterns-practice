# 结构型模式

## 代理模式


### 介绍
代理模式是属于结构型的设计模式,指客户端的请求到达真正的对象之前，做一些额外的操作。

### 静态代理模式


以 AspectJ 为代表。指代理类在编译期生成的，与动态代理相比，效率会很高，但是会生成大量代理类。



### 动态代理模式

以 SpringAOP 为代表为代表，代理类是动态生成的。虽然会效率会低一点，但是大大简化了代码和开发量。

- JDK 动态代理
- CGlib 动态代理





## 装饰器模式



![装饰器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20210420-decorator-1-decorator-decorator.svg)

通过生成装饰器类，来对类进行功能上的扩展。使用了组合的原理，将需要被扩展的类作为对象组合到装饰类中。

再通过装饰类对待扩展的类进行扩展。

- 待扩展接口类

  ```java
  public interface Robot {
  
      void name();
  
      void work();
  
  }
  ```

- 接口实现类

  ```java
  public class AlertRobot implements Robot {
  
      @Override
      public void name() {
          System.out.println("这是告警机器人");
      }
  
      @Override
      public void work() {
          System.out.println("可以发出告警");
      }
  
  
  }
  ```

- 装饰器类

  ```java
  public abstract class DecoratorRobot implements Robot {
  
      //接口类采用组合方式注入
      protected Robot decoratorRobot;
  
      public DecoratorRobot(Robot decoratorRobot) {
          this.decoratorRobot = decoratorRobot;
      }
  
      @Override
      public void name() {
          decoratorRobot.name();
      }
  
      @Override
      public void work() {
          decoratorRobot.work();
      }
  
  }
  ```

- 装饰类的实现类（扩展功能）

  ```java
  public class WeatherDecoratorRobot extends DecoratorRobot {
  
      public WeatherDecoratorRobot(Robot decoratorRobot) {
          super(decoratorRobot);
      }
  
      @Override
      public void name() {
          super.name();
          String nameType = nameType();
          System.out.println(nameType);
      }
  
      @Override
      public void work() {
          super.work();
          //扩展功能，对功能进行装饰
          weather();
      }
  
      private String nameType(){
          if(decoratorRobot instanceof AlertRobot){
              return "告警";
          }
          if(decoratorRobot instanceof MusicRobot){
              return "音乐";
          }
          return "类型不详细";
      }
  
      private void weather(){
          System.out.println("可以进行天气预报");
      }
  
  
  
  ```

  

## 适配器模式

![适配器模式的 UML 图](https://www.runoob.com/wp-content/uploads/2014/08/20210223-adapter.png)

适配器模式在调用原有接口不兼容的情况下，增加适配类对原有接口进行转换，达到兼容的目的。

创建一个适配器类，通过继承或组合的关系将原有接口注入，然后实现想要的目标接口

- 原有功能类-说话

  ```java
  public class Speaker {
  
      public String speak(){
         return "China No.1";
      }
  
  
  }
  ```

- 适配器接口-翻译

  ```java
  public interface Translator {
  
      /**
       * 翻译
       * @return
       */
      String translate();
  
  
  }
  
  ```

- 适配器实现类-实现翻译

  ```java
  public class TranslatorAdapter implements Translator {
  
      /**
       * 通过注入的方式将待转换的类注入（也可以通过继承）
       */
      private Speaker speaker;
  
      public TranslatorAdapter(Speaker speaker) {
          this.speaker = speaker;
      }
  
      @Override
      public String translate() {
          return speaker.speak();
      }
  
  }
  ```

- 调用

  ```java
  public class TestAdapter {
  
      public static void main(String[] args) {
          //通过adapter对speaker类进行适配
          String translate = new TranslatorAdapter(new Speaker()).translate();
          System.out.println(translate);
      }
  
  
  }
  ```

**通过适配器类，将原有接口或类注入进来，然后将其转换为目标接口。**

### 适配器模式和装饰器模式的不同

- 目的不同
  - 适配器模式只是转换接口类，达到兼容的目的。
  - 装饰器模式是为了扩展原有类的功能。







































































































































































































































































































































































































































































































































































































































































































































































