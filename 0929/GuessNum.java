import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        //1.先生成一个随机数字(1 - 100)
        //2.提示用户输入一个数字
        //3.拿用户输入的数字和系统生成的数字进行对比
        //4.根据对比的结果提示用户猜的高低
        //5.循环2
        Random random = new Random();   //默认种子就是系统时间
        //nextInt 得到的数字范围是[0, bound)
        int toGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("请输入一个数字(1-100):");
            int num = scanner.nextInt();
        
            if (num < toGuess) {
                System.out.println("低了");
            } else if (num > toGuess) {
                System.out.println("高了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
        scanner.close();
    }
}