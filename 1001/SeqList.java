import java.util.Arrays;

//顺序表擅长随机访问
//链表擅长插入和删除
public class SeqList {
    //创建一个类,一般先考虑这个类要支持哪些操作
    //结合这些操作来考虑要保存什么样的数据

    //这个数组的最大容量是10,初始情况下
    //这10个元素并不都是有效元素
    //执行插入操作之后,被插入的元素才是有效元素
    private int[] data = new int[10];
    //size表示当前数组中有多少个有效元素
    private int size = 0;

    public void display() {
        //System.out.println(Arrays.toString(data));
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if(i != size - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public void add(int pos, int elem) {
        //pos == size也允许插入,此时相当于尾插
        if (pos < 0 || pos > size) {
            //pos位置无效
            return;
        }
        if (this.size >= this.data.length) {
            //当前容量不够,需要扩容
            //申请一块更大的空间,把原有数据拷贝过去
            realloc();
        }
        if (pos == size) {
            //尾插的情况,直接把新元素放到size下标的位置上
            this.data[pos] = elem;
            this.size++;
            return;
        }
        //处理插入在中间位置的情况,进行搬运,把后面的元素一次往后移动
        for (int i = this.size; i > pos; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[pos] = elem;
        this.size++;
    }

    private void realloc() {
        //扩容策略很灵活,根据实际问题场景的特点
        //原则是是比较大的开销,尽量应该根据实际场景让扩容次数尽量少
        int[] newData = new int[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    public boolean contains(int toFind) {
        //return this.search(toFind) != -1;
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    public int search(int toFind) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public int getPos(int pos) {
        return this.data[pos];
    }

    public void setPos(int pos, int elem) {
        this.data[pos] = elem;
    }

    //按置删除  [1 2 2 2 3 4]
    //删除第一次出现的值
    public void remove(int toRemove) {
        int pos = search(toRemove);
        if (pos == -1) {
            //这个值不存在
            return;
        }
        if (pos == this.size - 1) {
            //删除最后一个元素
            this.size--;
            return;
        }
        for (int i = pos; i < size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.size--;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.size = 0;
        this.data = new int[10];    //缩容
    }
}
