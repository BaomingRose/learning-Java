public class Person {
    //IDEA提供了自动生成getter setter方法    alt + insert
    private String name = "";
    private String sex = "女";
    private int age = 18;
    private final int size = 10;     //这个常量也在堆空间

    public static int num  = 0;
    public static final int count = 10;     //这个静态常量在方法区上

    static {
        //只能初始化静态的成员
        num = 10;
        System.out.println("这是静态代码块");
    }

    //new对象的时候,先执行代码块内容,再执行构造方法.这个顺序和代码的书写顺序无关
    {
        num = 20;
        name = "";
        sex = "女";
        age = 18;
        System.out.println("这是代码块");
    }

    //java 如果没写构造方法,会自动生成一个无参的构造方法  构造方法支持重载
    //多个构造方法之间可以相互调用
    public Person(String name) {
        this(name, "女", 18);        //this调用构造
        System.out.println("这是构造方法");
    }

    //构造方法如果是private,就意味着这个类通过常规方法无法创建出对象
    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    //toString名字固定
    //toString默认的是得到类的类型和身份
    //toString是一个Object这样类的方法,所有的类都是直接或间接"继承"自Object
    //注解
    @Override
    public String toString() {
        return this.name + " " + this.sex + " " + this.age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void func() {
        System.out.println("这是一个静态方法");
    }

    public void eat() {
        System.out.println(this.name + "正在吃饭");
    }

    public void sleep() {
        System.out.println(this.name + "正在睡觉");
    }
}
