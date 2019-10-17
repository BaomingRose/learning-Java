package package2;

import package1.Animal;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + "正在飞");
    }

    //方法重写注解
    //让代码更清楚理解
    //做出一些编译期的检查，万一手误比如写错参数，这时没有按照预期构成重写，编译器就能检查出来
    @Override
    public void eat(String food) {
        System.out.println("我是一只小鸟");
        System.out.println(name + "正在吃" + food);
    }

    //方法重载
     public void eat(String food, int i) {  //多写一个参数
        System.out.println("我是一只小鸟");
        System.out.println(name + "正在吃" + food);
    }
}
