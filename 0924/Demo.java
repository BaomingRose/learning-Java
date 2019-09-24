import java.util.Scanner;

public class Demo {
    /*//break
    public static void main(String[] args) {
        int num = 100;
        while (num <= 200) {
            if(num % 3 == 0) {
                System.out.println(num);
                break; 
            }
            num++;
        }
    }
    */

    /*//continue
    public static void main(String[] args) {
        int num = 100;
        while (num <= 200) {
            if (num % 3 != 0) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
    */
    
    /*//for循环
    public static void main(String[] args) {
        //打印1-10
        for(int num = 1; num <= 10; num++) {
            System.out.println(num);
        }
    }
    */

    /*
    public static void main(String[] args) {
       //计算1-100的和
       int sum = 0;
       for (int num = 1; num <= 100; num++) {
            sum += num;
        }
        System.out.println(sum);
    }
    */

    /*
    public static void main(String[] args) {
        //5的阶乘
        int result = 1;
        for (int num = 1; num <= 5; num++) {
            result *= num;
        }
        System.out.println(result);
    }
    */
    
    /*
    public static void main(String[] args) {
        //1!+2!+3!+4!+5!
        int result = 0;
        for (int i = 1; i <= 5; i++) {
            int factorResult = 1;
            for(int j = 1; j <= i; j++) {
                factorResult *= j;
            }
            result += factorResult;
        }
        System.out.println(result);
    }
    */

    /*
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("hello" + a + b);    //hello1020
        System.out.println(a + "hello" + b);    //10hello20
        System.out.println("hello" + (a + b));  //hello30
        System.out.printf("%d %d", a, b);
        //System.out.printf("%d %d", a);      //编译不报错,报异常
        
        //从键盘输入主要使用的是Scanner这个类
        //Scanner是一个类,需要先创建这个类对应的变量,在进一步使用
        //System.in 表示从键盘读
        Scanner scanner = new Scanner(System.in);
        //使用scanner中的一些方法来读取数据
        System.out.println("请输入您的姓名：");
        String name = scanner.nextLine();           //读一行内容
        System.out.println("您的姓名是：" + name);

        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();
        System.out.println("您的年龄是：" + age);
        
        System.out.println("请输入您的工资：");
        double salary = scanner.nextDouble();
        System.out.println("您的工资是：" + salary);
    }
    */


    public static void main(String[] args) {
        //ctrl + z 在Windows表示eof(文件结束标记)
        //scanner遇到eof时会认为next没有数据了
        //ctrl + d在mac/Linux表示eof
        //需要导入util包
        Scanner scanner = new Scanner(System.in);
        //循环读N个数字(不知道N是多少)
        while (scanner.hasNextInt()) {
            int tmp = scanner.nextInt();
            System.out.println(tmp);
        }
        scanner.close();
    }
}