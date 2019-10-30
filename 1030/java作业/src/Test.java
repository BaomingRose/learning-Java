import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        try {
            InputStreamReader fr = new InputStreamReader(new FileInputStream("Books.txt"), "GB2312");
            //FileReader fr = new FileReader("Books.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            while (str != null) {
                String[] strl = str.split(",");
                Book book = new Book();
                book.setISBN(strl[0]);
                book.setName(strl[1]);
                book.setWriter(strl[2]);
                book.setPublishing(strl[3]);
                book.setPrice(Integer.parseInt(strl[4]));
                book.setPages(Integer.parseInt(strl[5]));
                list.add(book);
                str = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(list.toString());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要查找的书籍名字：");
            String scanString = scanner.nextLine();
            findBook(list, scanString);
        }
    }

    public static void findBook(ArrayList<Book> list, String tofind) {
        boolean flag = false;
        for (Book i : list) {
            if (i.getName().equals(tofind)) {
                flag = true;
                System.out.println(i.toString());
            }
        }
        if (!flag) {
            System.out.println("没有此书籍");
        }
    }
}