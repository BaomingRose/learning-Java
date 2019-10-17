package package2;

import package1.Animal;

/**多态：一种思想方法，多态落实到代码上具体的体现形式，就是通过以下三点来体现的
 * 1.向上转型
 * 2.动态绑定
 * 3.方法重写
 */

//向上转型的三种常见体现形式
//1.直接赋值
//2.作为方法的参数
//3.作为方法的返回值

//子类也有eat，父类也有eat，方法的覆写/重写(override)
//1.方法名相同
//2.参数必须完全形同（个数和类型都相同）
//3.返回值没啥要求，一般让返回值一样
//4.子类的方法访问权限控制不应该比父类的小（一般设定成一样的）
//重载（overload）
public class Test {
    public static void main(String[] args) {
        /*直接赋值
        Bird bird = new Bird("小鸟");
        //向上转型，类型转换
        //一个子类的对象，可以使用一个父类的引用表示
        //强转可有可无
        Animal animal = (Animal)bird;
        bird.eat("谷子");
        animal.eat("小米");

        //可以直接写成下面这样方式
        Animal animal1 = new Bird("鸟鸟");
        */

        /*方法参数
        Bird bird = new Bird("鸟鸟");
        //参数为Animal 传入的Bird类向上转型
        feed(bird);
        */

        //Animal animal = findMyAnimal();

        //父类和子类可能会包含名字相同，逻辑不同的方法
        //调用这个方法的时候，到底执行时父类方法还是子类方法，是在程序运行※※※中确定的
        //（而不是程序编译过程中）
        //动态绑定  "动态" 指的是"运行"时而不是"编译"期
        Animal animal = new Animal("鸟鸟");
        //使用Animal方法
        animal.eat("谷子");

        Bird bird = new Bird("袅袅");
        //使用Bird类的方法
        bird.eat("谷子");

        Animal animal2 = new Bird("小鸟");
        //使用Bird类的方法
        animal2.eat("谷子");
    }

    public static void feed(Animal animal) {
        animal.eat("谷子");
    }

    //返回类型是Animal，实际返回Bird类型，向上转型
    public static Animal findMyAnimal() {
        Bird bird = new Bird("鸟鸟");
        return bird;
    }
}
