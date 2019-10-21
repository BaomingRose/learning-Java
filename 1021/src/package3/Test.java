package package3;

import java.util.Arrays;

//让Student类实现Comparable接口，并实现其中的compareTo方法
//sort方法中会自动调用compareTo方法
//compareTo的参数是Object，其实传入的就是Student类型的对象
/*如果当前对象应排在参数对象之前，返回小于0的数字
 *如果当前对象应排在参数对象之后，返回大于0的数字
 * 如果当前对象和参数对象不分先后，返回0
 */
class Student implements Comparable{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "[" + this.name + ":" + this.score + "]";
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        if (this.score > s.score) {
            return -1;
        } else if (this.score < s.score) {
            return 1;
        } else {
            return 0;
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("张三", 95),
                new Student("李四", 96),
                new Student("王五", 97),
                new Student("赵六", 92),
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
