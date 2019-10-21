package pakage2;

//接口是抽象类的更进一步，抽象类中还可以包含非抽象方法，和字段，而接口中包含的方法都是抽象方法，字段只能包含静态常量
interface IShape {
    void draw();    //可省略abstract public
    public static final int num = 10;   //可省略public static final
}

//implements不再是扩展，而是实现
//接口命名一般以“I”开头，形容词性
class Cycle implements IShape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

public class Test1 {
    public static void main(String[] args) {
        //调用时可以创建一个接口的引用，对应一个子类的实例
        IShape shape = new Cycle();
        shape.draw();
    }
}
