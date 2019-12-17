package File;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        FileOutputStream out = new FileOutputStream("example.txt");
        String str = "宝明 罗斯";
        byte[] b = str.getBytes();      //※※※
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        out.close();
    }

    //通过字节流方式拷贝文件※，这将是自己觉得最习惯使用的方法      0毫秒
    public static void main1(String[] args) throws Exception {
        InputStream in = new FileInputStream("src/易班.png");
        OutputStream out = new FileOutputStream("out/易班.jpg");
        byte[] buff = new byte[200000];

        int len;
        long beginTime = System.currentTimeMillis();
        while ((len = in.read(buff)) != -1) {
            out.write(buff, 0, len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("拷贝文件所需时间为：" + (endTime - beginTime) + "毫秒");

        out.close();
        in.close();
    }

    //单字节拷贝方式       1377毫秒
    public static void main2(String[] args) throws Exception {
        InputStream in = new FileInputStream("src/易班.PNG");
        OutputStream out = new FileOutputStream("out/易班字节拷贝.jpg");
        int len;
        long beginTime = System.currentTimeMillis();
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("拷贝文件所需时间为：" + (endTime - beginTime) + "毫秒");

        out.close();
        in.close();
    }

    //字节缓冲流拷贝文件     97毫秒
    public static void main3(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/易班.PNG"));
        //这两个流内部定义了一个大小为8192的字节数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("out/易班字节缓冲流拷贝.jpg"));

        int len;
        long beginTime = System.currentTimeMillis();
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("拷贝文件所需时间为：" + (endTime - beginTime) + "毫秒");
        bis.close();
        bos.close();
    }
}
