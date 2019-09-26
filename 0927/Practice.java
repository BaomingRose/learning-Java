import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 7};
        System.out.println(arrToString(arr));   //自己实现的函数

        System.out.println(Arrays.toString(arr));

        int[] arr2 = copy(arr);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOf(arr, 7);     //arr4 有7个元素,后面会自动补0
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = new int[5];        //全为0
        System.out.println(Arrays.toString(arr5));

        int maxValue = max(arr);
        System.out.println("maxValue = " + maxValue);

        double avgValue = avg(arr);
        System.out.println("avgValue = " + avgValue);

        int toFind = 3;
        int pos = find(arr, toFind);
        System.out.println("pos = " + pos);

        //二分查找前提,数组有序
        toFind = 2;
        int pos2 = binaryFind(arr, toFind);
        System.out.println("pos = " + pos2);

        System.out.println(isSorted(arr));

        int[] arr6 = new int[]{9, 5, 2, 7};
        System.out.println(isSorted(arr6));
        bubbleSort(arr6);
        System.out.println(Arrays.toString(arr6));

        reverse(arr2);
        System.out.println(Arrays.toString(arr2));
        transform(arr2);
        System.out.println(Arrays.toString(arr2));

        int[][] arr7 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 10}
        };
        for (int row = 0; row < arr7.length; row++) {
            for (int col = 0; col < arr7[row].length; col++) {
                System.out.printf("%d\t", arr7[row][col]);
            }
            System.out.println();
        }

    }

    //将数组转字符串
    public static String arrToString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i != arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    //复制一份数组
    public static int[] copy(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static int max(int[] arr) {
        int maxValue = arr[0];
        for (int x : arr) {
            if (x > maxValue) {
                maxValue = x;
            }
        }
        return maxValue;
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double)sum / (double)arr.length;
    }

    public static int find(int[] arr, int toFind) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //二分查找
    public static int binaryFind(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {     //<=
            int mid = (left + right) / 2;
            if(arr[mid] < toFind) {
                left = mid + 1;         //+1
            } else if (arr[mid] > toFind) {
                right = mid - 1;        //-1
            } else {
                return mid;
            }
        }
        return -1;
    }

    //判断是否有序
    public static boolean isSorted(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        //每次找最小元素,从后往前比较
        //第一重循环,负责找N次
        //[0,bound)已排区间
        //[bound,length)待排区间
        //每次循环完成一次,就让排序区间多了个元素
        //待排区间就少了个元素
        for (int bound = 0; bound < arr.length; bound++) {
            //第二重循环,要找到当前待排序区间中的最小值
            //并且放到合适的位置上
            for (int cur = arr.length - 1; cur > bound; cur--) {
                if (arr[cur - 1] > arr[cur]) {
                    int tmp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = tmp;
                }   
            }
        }
    }

    //逆序
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    //所有偶数在前,所有奇数在后
    //left从前往后找到第一个奇数
    //right从后往前找到第一个偶数
    //交换left和right
    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}