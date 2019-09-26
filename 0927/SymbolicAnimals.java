public class SymbolicAnimals {
    public static String symbolicAnimals(int year) {
        String res = " ";
        switch((year - 3) % 12) {
        case 1 :
            res = "鼠";
            break;
        case 2 :
            res = "牛";
            break;
        case 3 :
            res = "虎";
            break;
        case 4 :
            res = "兔";
            break;
        case 5 :
            res = "龙";
            break;
        case 6 :
            res = "蛇";
            break;
        case 7 :
            res = "马";
            break;
        case 8 :
            res = "羊";
            break;
        case 9 :
            res = "候";
            break;
        case 10 :
            res = "鸡";
            break;
        case 11 :
            res = "狗";
            break;
        case 0 :
            res = "猪";
            break;
        }
        return res;
    }
    public static void main(String[] args) {
        int year = 2019;
        System.out.println(symbolicAnimals(year));
    }
}