public class Test {
    public static void main(String[] args) {
        String s = "abcdedbca";
        System.out.println("s = " + s);
        String s2 = new String("hello world");
        System.out.println("s2 = " + s2);

        char[] charArray = new char[] { 'H', 'E', 'L', 'L', 'O' };
        String s3 = new String(charArray);
        System.out.println("s3 = " + s3);
        System.out.println("s的第4个字符为" + s.charAt(3));
        System.out.println("字符c第一次出现的位置" + s.indexOf('c'));
        System.out.println("字符c最后一次出现的位置" + s.lastIndexOf('c'));
        System.out.println("子字符串第一次出现的位置" + s.indexOf("bc"));
        System.out.println("子字符串最后一次出现的位置" + s.lastIndexOf("bc"));

        char[] charArr = s.toCharArray();//字符串转换为字符数组
        for (int i = 0; i < charArr.length; i++) {
            if (i != charArr.length - 1) {
                System.out.print(charArr[i] + ",");
            } else {
                System.out.println(charArr[i]);
            }
        }

        System.out.println("将int转为String结果为：" + String.valueOf(100));
        System.out.println("将字符串转换成大写结果为：" + s.toUpperCase());

        System.out.println("将bc换成www.xy的结果为:" + s.replace("bc", "www.xy"));
        String str = "    i t c a s t   ";
        System.out.println("str = " + str);
        System.out.println("去除字符串两端空格的结果：" + s.trim());
        System.out.println("去除字符串所有空格的结果为:" + str.replace(" ", ""));

        System.out.println("判断字符串是否以ab开头：" + s.startsWith("ab"));
        System.out.println("判断字符串是否以ca结尾：" + s.endsWith("ca"));
        System.out.println("判断是否包含字符串ded：" + s.contains("ded"));
        System.out.println("判断字符串是否为空：" + s.isEmpty());
        //equals（）方法用于比较两个字符串中的字符是否相等
        //==方法用于比较两个字符串对象的地址是否相等
        System.out.println("判断两个字符串是否相等：" + s.equals(s2));

        //equals（）方法用于比较两个字符串中的字符是否相等
        //==方法用于比较两个字符串对象的地址是否相等
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);   //false
        System.out.println(str1.equals(str2));  //true

        String str3 = new String("羽毛球-篮球-乒乓球");
        System.out.println("从第5个字符截取到末尾的结果:" + str3.substring(4));
        System.out.println("从第5个字符截取到第六个字符的结果：" + str3.substring(4, 6));

        System.out.println("分割后的字符串数组中的元素依次为：");
        String[] strArray = str3.split("-");
        for (int i = 0; i < strArray.length; i++) {
            if (i != strArray.length - 1) {
                System.out.print(strArray[i] + ",");
            } else {
                System.out.println(strArray[i]);
            }
        }


    }
}
