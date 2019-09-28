public class PrintSingle {
    public static void main(String[] args) {
        int num = 1234;
        printNum(num);
        System.out.println(sum(num));
    }

    //递归打印数位
    public static void printNum(int num) {
        //如果num是一个一位数,那么直接打印
        //如果num是一个超过一位的数字,那就num/10递归
        if (num > 9) {
            //不是一位数
            printNum(num / 10);
        }
        System.out.println(num % 10);
    }

    //数位加和
    //sum(1729) = 9 + sum(172)
    public static int sum(int num) {
        if (num < 10) {
            return num;
        }
        return num % 10 + sum(num / 10);
    }
}