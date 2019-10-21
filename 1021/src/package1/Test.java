package package1;

//抽象类最大意义就是为了继承
//父类的draw并没有什么实际工作，主要绘制图形都是各子类draw方法完成，可以设计一个抽象方法
//包含抽象方法的类称为抽象类
abstract class Shape {
    abstract public void draw();

    void func() {
        System.out.println("func");
    }
}
//在draw方法前加上abstract关键字，表示这是一个抽象方法，同时抽象方法体
//对于包含抽象方法的类，必须加上abstract关键字表示一个抽象类

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("□");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}
/*注：
 *抽象类不能直接实例化，只能创建给类抽象类的子类
 * 抽象方法不能private
 * 抽象类中可以包含其他的非抽象方法，也可以包含字段，这个非抽象方法和普通方法的规则都是一样的，可以重写，也可以被子类调用
 * 使用抽象类相当于多了一重编译器的校验
 */

public class Test {
    public static void main(String[] args) {
        Shape shape = new Rect();
        shape.draw();
        shape.func();
    }
}
