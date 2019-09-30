/**static   (静态变量保存在方法区中)
 * 1.修饰一个成员变量   和对象无关,和类相关,不论这个类存在多少个对象,静态成员变量只存在一份（类属性）,在普通方法中也能访问
 * 2.修饰一个方法       这个方法就和类相关,和具体对象不相关,静态方法不能使用this
 * 3.修饰一个代码块     静态代码块会最先执行,    不管new多少个对象,静态代码块只执行一次
 * 4.修饰一个类
 */
public class Test {

    public static void main(String[] args) {
        Person xiaoli = new Person("小丽");
        xiaoli.num = 100;
        //System.out.println(xiaoli.num);
        xiaoli.eat();
        xiaoli.func();
        Person.func();
        System.out.println(xiaoli);     //调用toString

        System.out.println(new Person("xiaohua"));      //创建匿名对象
        new Person("xiaoli").eat();                     //匿名对象调用方法

        Person xiaohua = new Person("小花");
        System.out.println(xiaohua.num);

        System.out.println(Person.num);
    }


}
