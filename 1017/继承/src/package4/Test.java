package package4;

//多态：是一种代码编写方式
//一个引用可以表示成不同的形态
//Flower Rect Cycle 这些类“类的实现者”编写的
//Test这个类(drawShape方法)“类的调用者”编写的
//类的调用者不必关心当前这个类是啥类，就让类的调用者对于类的实现细节就知道的更少
//封装的更近一步，是为了让类的调用者不需要知道类的实现细节（要知道是哪个类）
//多态这里类的调用者都不需要知道这个类是啥具体类型，只需要知道这个类有一个draw方法就可以了
public class Test {
    public static void main(String[] args) {
        Shape s1 = new Cycle();
        Shape s2 = new Rect();
        Shape s3 = new Flower();
        drawShape(s1);
        drawShape(s2);
        drawShape(s3);
    }

    public static void drawShape(Shape s) {
        s.draw();
    }
}
