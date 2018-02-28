# DesignPattern

常用设计模式的总结与实现

├── adapter // 适配器模式
│   ├── Adapter.java
│   ├── ChinaPower.java
│   ├── package-info.java
│   └── Power.java
├── bridge  // 桥接模式
│   ├── BlodPaint.java
│   ├── Circle.java
│   ├── GreenPaint.java
│   ├── Oval.java
│   ├── package-info.java
│   ├── Paint.java
│   ├── RedPaint.java
│   ├── Shape.java
│   └── Square.java
├── chain // 责任链模式
│   ├── ChainTest.java
│   ├── IChain.java
│   ├── ILeadTask.java
│   ├── impl
│   │   ├── Boss.java
│   │   ├── GroupLeader.java
│   │   ├── Programmer.java
│   │   └── ProjectManager.java
│   ├── Leader.java
│   └── Person.java
├── composite // 组合模式
│   ├── package-info.java
│   ├── ViewGroup.java
│   └── View.java
├── decorator // 装饰者模式
│   ├── Egg.java
│   ├── Hamburger.java
│   ├── HotDog.java
│   ├── KFC.java
│   ├── Lettuce.java
│   ├── Material.java
│   ├── package-info.java
│   └── Spicy.java
├── entity
│   ├── Circle.java
│   ├── Oval.java
│   ├── Shape.java
│   └── Square.java
├── facade  //  外观模式
│   ├── Computer.java
│   └── package-info.java
├── factory //  工厂模式
│   └── ShapeFactory.java
├── fly_weight
│   ├── package-info.java
│   └── ShapePool.java
├── Main.java
├── observer  //  观察者模式
│   ├── Observable.java
│   ├── Observer.java
│   └── package-info.java
├── proxy //  代理模式
│   ├── Foo.java
│   ├── ImageHandler.java
│   ├── Image.java
│   ├── ImageProxy.java
│   ├── package-info.java
│   └── RealImage.java
├── responsibility_chain  // 责任链模式
│   ├── BossIntercept.java
│   ├── HandleChain.java
│   ├── Interceptor.java
│   ├── LeaderIntercept.java
│   ├── package-info.java
│   ├── TestInterceptor.java
│   └── WorkIntercept.java
├── singleton // 单例模式
│   └── Foo.java
└── test
    ├── AdapterTest.java
    ├── BridgeTest.java
    ├── CompositeTest.java
    ├── DecoratorTest.java
    ├── FacadeTest.java
    ├── FactoryTest.java
    ├── FlyWeightTest.java
    ├── ObserverTest.java
    ├── ProxyTest.java
    └── SingletonTest.java

