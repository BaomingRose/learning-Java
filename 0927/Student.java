import java.util.*;

public class Student {
    String name;
    String major;
    String sex;
    Student(String name, String major, String sex) {
        this.name = name;
        this.major = major;
        this.sex = sex;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String searchMajor = scn.next();
        Student[] list = {new Student("翠芬", "math", "girl"), new Student("翠花", "math", "girl"), 
                    new Student("狗蛋", "english", "boy"), new Student("坤坤", "math", "boy"), 
                    new Student("碧萝", "english", "girl"), new Student("美娟", "math", "girl")};
        int girlNum = 0, boyNum = 0;
        for(Student i : list) {
            if(searchMajor.equals(i.major)) {
                if(i.sex == "boy") {
                    boyNum++;
                } else {
                    girlNum++;
                }
            }
        }
        System.out.println("boy: " + boyNum + '\n' + "girl: " + girlNum);
    }
} 