package package3;

/**使用多态的好处：
 * 1.类调用者对类的使用成本进一步降低
 * 2.能够降低代码的 "圈复杂度", 避免使用大量的 if - else
 * (圈复杂度是一种描述一段代码复杂程度的方式. 一段代码如果平铺直叙, 那么就比较简单容易理解.
 * 而如果有很多的条件分支或者循环语句, 就认为理解起来更复杂.
 * 因此我们可以简单粗暴的计算一段代码中条件语句和循环语句出现的个数, 这个个数就称为 "圈复杂度".
 * 如果一个方法的圈复杂度太高, 就需要考虑重构)
 * 3.可扩展能力更强.
 * 如果要新增一种新的形状, 使用多态的方式代码改动成本也比较低.
 */
public class Test {
    public static void main(String[] args) {
        /*当类的调用者在编写 drawMap 这个方法的时候, 参数类型为 Shape (父类),
        此时在该方法内部并不知道, 也不关注当前的 shape 引用指向的是哪个类型(哪个子类)的实例.
        此时 shape 这个引用调用 draw 方法可能会有多种不同的表现(和 shape 对应的实例相关),
        这种行为就称为 多态*/
        Shape shape1 = new Flower();
        Shape shape2 = new Cycle();
        Shape shape3 = new Rest();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
    }
    // 打印单个图形
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    //如果不使用多态,会使用过多的if else
    public static void drawShapes1() {
        Rest rect = new Rest();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();
        String[] shapes = {"cycle", "rect", "cycle", "rect", "flower"};
        for (String shape : shapes) {
            if (shape.equals("cycle")) {
                cycle.draw();
            } else if (shape.equals("rect")) {
                rect.draw();
            } else if (shape.equals("flower")) {
                flower.draw();
            }
        }
    }

    //使用多态
    public static void drawShapes2() {
        // 我们创建了一个 Shape 对象的数组.
        Shape[] shapes = {new Cycle(), new Rest(), new Cycle(),
                new Rest(), new Flower()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}
