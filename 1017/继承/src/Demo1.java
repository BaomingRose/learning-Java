//不太推荐
//用谁导入谁
//import java.util.*;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.Math.*;
public class Demo1 {
    //java.util.Date date = new java.util.Date();
    public static void main(String[] args) {
        Date date = new Date();
        out.println("hello");
        double x = 10.0;
        double y = 20.0;
        double result = sqrt(pow(x, 2) + pow(y, 2));
        out.println(result);
    }

}
