//继承：目的为了代码重用 公共的代码，放在一个单独类之中，让其他的类继承这个单独的类
//单独的这个类里面包含的属性和方法，都自动被新的类支持进去了
//新的类还可以做出一些根据自己特色的扩展

//Animal 称为父类，基类，超类
//Cat/Bird 称为子类，派生类
//子类会继承父类所有的属性和方法
//父类和子类的关系叫做“is-a”
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(name + "正在吃"+food);
    }

    public String getName() {
        return name;
    }
}

//一个子类只能继承一个父类
class Cat extends  Animal {
    public Cat(String name) {
        //父类的private的字段和方法，子类无法访问
        //使用super关键字得到父类实例的引用
        //super与this类似，this指我的，super指我父类的
        super(name);
    }
}

class Bird extends Animal{
    public Bird(String name) {
       super(name);
    }

    public void fly() {
        //System.out.println(getName() + "正在飞");
        //将name由private改为protected
        System.out.println(name + "正在飞");
        System.out.println(super.name + "正在飞");
    }
}
public class Test {
   public static void main(String[] args)  {
       Cat cat = new Cat("小猫");
       cat.eat("鱼");

       Bird bird = new Bird("小鸟");
       bird.eat("谷子");
       bird.fly();

       Animal animal = new Animal("小动物");
       System.out.println(animal.name);
   }
}

//访问控制权限使用的原则：尽可能的进行封装
//多层继承：语法上是允许类的层数无限的继承下去，但是实际工程中一般不会这么做
//一般推荐3-4层

//final 修饰一个变量，表示这是一个常量
//final 修饰一个类，表示这个类不能被继续继承

//组合 has - a
//要根据实际场景看看要表示的类到底是哪种语义
//优先考虑组合(组合:继承 => 8 : 2)