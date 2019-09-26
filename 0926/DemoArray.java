public class DemoArray {
    public static void main(String[] args) {
        int arr[] = { 9, 5, 2, 7 };
        int[] arr2 = { 9, 5, 2, 7 };
        //new在java中特别重要,出场率极高的关键字
        //表示创建一个对象
        int[] arr3 = new int[]{ 9, 5, 2, 7 };

        //java中的null表示一个"空引用",这个引用谁都不指向
        //null和C语言中的0号地址没有关联关系
        //对于null进行访问,就会抛出NullPointerException异常
        int[] arr4 = null;
        arr4 = new int[]{1, 2, 3, 4};

        //以下代码也OK,没有触发内存泄漏
        //java中有垃圾回收机制
        int[] arr5 = new int[]{9, 5, 2, 7};
        arr5 = new int[]{1, 2, 3, 4, 5, 6};
        //JVM发现之前的数组空间已经没有引用指向它了,说明代码已经无法使用这个数组了
        //JVM就会把之前的数组空间判成垃圾空间,JVM会自动把这块垃圾回收
        //引用存在JVM stack     数组空间存在heap
        //堆上的内存声明周期和代码块无关,主要看垃圾回收机制认为它啥时候是垃圾
        //Heap对于一个JVM来说只有一份,JVM stack可能有多份,每个thread(线程)有一份
        //线程就是一个代码的执行流
        /*Native Method Stack放的也是方法的调用关系,这里的方法叫native方法(本地方法)
        C++写的代码,java也有一些特殊手段可以调用C++代码(JNI)*/
        //方法区:放的是方法,也是把class文件中的二进制指令加载到内存中,就放到一个转门的空间里

        System.out.println(arr[0]);
        //下标的有效范围[0, length)
        System.out.println(arr.length);

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] a = arr;  //并没有创建一个数组空间,而是创建一个引用存储的是数组的地址※※※
        a[0] = 101;     //也修改了arr[0]

        System.out.println();
        //func(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
        
        int[] result = transform(arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    //数组名是一个引用(低配指针),一个引用也存了一个地址
    public static void func(int[] a) {
        a[0] = 100;
    }

    //都修改成原来的一倍 (不修改原数组,产生一个新的数组)
    public static int[] transform(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = 2 * a[i];
        }
        return result;
    }
}