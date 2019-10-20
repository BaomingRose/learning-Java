package package1;

public class Bird extends Animal{
    Bird(String name) {
        //调用父类的构造
        super(name);
    }

    public void fly() {
        System.out.println(super.getName() + "正在飞");
    }

}
