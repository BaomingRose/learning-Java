package package2;

import package1.Animal;

//继承不同包中的类，不同包中的子类可以访问父类的protected
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void Name() {
        //name在另一个包中的类中为protected，可以直接访问
        System.out.println(name);
    }
}
