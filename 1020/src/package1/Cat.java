package package1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {
        System.out.println("我是一只小猫");
        System.out.println(super.getName() + "正在吃" + food);
    }
}
