import java.util.Properties;
import java.util.Set;

//获取当前系统属性的功能
//getProperties()方法用于获取当前系统的全部属性，返回一个Properties，其中封装了系统的所有属性
public class Test {
    /*
    //System类定义了一些与系统相关的属性和方法，所提供的属性和方法都是静态的
    public static void main(String[] args) {
        //获取当前系统属性
        Properties properties = System.getProperties();
        System.out.println(properties);
        //获取所有系统属性的key（属性名），返回Set对象
        Set<String> propertyNames = properties.stringPropertyNames();
        for (String key : propertyNames) {
            //获取当前键key（属性名）所对应的值（属性值）
            String value = System.getProperty(key);
            System.out.println(key + "---->" + value);
        }
    }
    */

    /*
    //currenttTimeMillis()方法返回一个long类型的值，该值表示当前时间与1970年1月1日0点0分0秒之间的时间差，单位毫秒，
    //该值称为时间戳
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//循环开始时的当前时间
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();//循环结束后的当前时间
        System.out.println("程序运行时间为：" + (endTime - startTime) + "毫秒");
    }
    */

    //arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    //该方法用于将一个数组的元素快速拷贝到另一个数组
    public static void main(String[] args) {
        int[] fromArray = { 101, 102, 103, 104, 105, 106 };//源数组
        int[] toArray = { 201, 202, 203, 204, 205, 206, 207 };  //目标数组
        //把fromArray数组下标为2开始4个元素拷到toArray下标为3的位置
        System.arraycopy(fromArray, 2, toArray, 3, 4);
        //打印
        for (int i = 0; i < toArray.length; i++) {
            System.out.println(i + ": " + toArray[i]);
        }
    }
}
