public class Factor {
    /*
    public static int factor(int n) {
        int i, j, res = 1, sum = 0;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; ++j) {
                res *= j;
            }
            sum += res;
            res = 1;
        }
        return sum;
    }*/

    //递归版
    public static int factor(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factor(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factor(5));
    }
}