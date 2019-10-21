package pakage2;

//java只支持单继承，一个类只能extends一个父类，但是可以同时实现多个接口，也能达到多继承类似的效果
//继承表达的含义是 is - a，而接口表达的含义是具有xxx特性
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying {
    void fly();
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}

//接口可以继承一个接口，达到复用的效果，使用extends关键字
//两栖动物，既能跑又能游
interface IAmphibious extends IRunning, ISwimming {
    void eat();
}

class Frog2 extends Animal implements IAmphibious {
    public Frog2(String name) {
        super(name);
    }

    public void run() {

    }
    public void swim() {

    }
    public void eat() {

    }

}

class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + "正在跑步");
    }
}

class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + "正在跑步");
    }

    @Override
    public void swim() {
        System.out.println(name + "正在游泳");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Cat cat = new Cat("小猫");
        walk(cat);
        Frog frog = new Frog("小青蛙");
        walk(frog);
        IRunning runn = new Cat("猫");
        walk(runn);
    }

    //传参不必考虑哪种动物，只要会跑步就行
    public static void walk(IRunning running) {
        System.out.println("我带着伙伴散步");
        running.run();
    }
}
