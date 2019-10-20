package package1;

public class Test {
    public static void main(String[] args) {
        //向上转型
        Animal animal = new Bird("小鸟");
        animal.eat("虫子");

        //向下转型
        Bird bird = (Bird)animal;
        bird.fly();

        /*
        //下面的向下转型是不可靠的，会抛出异常
        Animal animal2 = new Cat("小猫");
        Bird bird2 = (Bird)animal;
        bird.fly();
        */

        Animal animal3 = new Cat("小猫");
        //instanceof 可以判定一个引用是否是某个类的实例.
        // 如果是, 则返回 true. 这时再进行向下转型就比较安全了
        if (animal instanceof Bird) {
            Bird bird3 = (Bird)animal;
            bird.fly();
        }


    }
}
