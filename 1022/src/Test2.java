public class Test2 {
    public static void main(String[] args) {
        //str1 和 str2 是指向同一个对象的.
        // 此时如 "Hello" 这样的字符串常量是在 字符串常量池 中
        String str1 = "hello";
        String str2 = str1;     //str2、str1指向同一块空间
        // str1 = "world" 这样的代码并不算 "修改" 字符串,
        // 而是让 str1 这个引用指向了一个新的 String 对象，str2仍然是hello
        str1 = "world";
        System.out.println(str2);   //hello

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3 == str4);   //true

        //通过  String str1 = new String("Hello");
        // 这样的方式创建的String对象相当于再堆上另外开辟了空间来存储
        //"Hello" 的内容, 也就是内存中存在两份 "Hello"
        String str5 = new String("hello");
        String str6 = new String("hello");
        //String 使用 == 比较并不是在比较字符串内容, 而是比较两个引用是否是指向同一个对象
        //在大部分编程语言中 == 是用来比较比较值的. 但是 Java 中的 == 是用来比较身份的
        System.out.println(str5 == str6);   //false
        System.out.println(str5.equals(str6));  //true

        //更推荐写下面第二种，方式一如果str5为null会抛异常，而方式二不会
        System.out.println(str5.equals("hello"));
        System.out.println("hello".equals(str5));
    }
}
