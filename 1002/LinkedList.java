//java中的一个.java中其实可以存在多个class.但是这多个class中只有一个才允许public.
// 这个public的class类名必须和文件名完全一致
class LinkedNode {
    private int data = 0;
    public LinkedNode next = null;

    public LinkedNode(int data) {
        this.data = data;
    }

    public void setNext(LinkedNode n) {
        this.next = n;
    }

    public int getData() {
        return data;
    }
}

//每个方法考虑是否为空链表很重要
public class LinkedList {
    //链表的头结点(第一个结点).有了这个头结点之后就可以根据next把所有的剩下元素取到
    private LinkedNode head = null;

    public void addFirst(int elem) {
        //先创建一个结点,让这个结点的值就是elem
        LinkedNode node = new LinkedNode(elem);
        if (this.head == null) {
            //空链表的情况
            this.head = node;
            return;
        }
        //如果不是空链表，就需要把新的结点放到链表的开始位置
        node.setNext(head);
        this.head = node;
        return;
    }

    public LinkedNode getHead() {
        return head;
    }

    public void setHead(LinkedNode head) {
        this.head = head;
    }

    public void display() {
        System.out.print("[");
        for (LinkedNode node = this.head; node != null; node = node.next) {
            System.out.print(node.getData());
            if(node.next != null) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public void addLast(int elem) {
        LinkedNode node = new LinkedNode(elem);
        //如果是空链表,直接把这个结点放上去即可
        if (this.head == null) {
            this.head = node;
            return;
        }
        //非空的情况,需要先找到最后一个结点
        LinkedNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void addIndex(int index, int elem) {
        LinkedNode node = new LinkedNode(elem);
        //1.先对pos进行一个合法的校验,需要知道链表的长度
        int len = size();
        if (index < 0 || index > len) {
            return;
        }
        //2.处理头插
        if (index == 0) {
            addFirst(elem);
            return;
        }
        //3.尾插
        if (index == len) {
            addLast(elem);
            return;
        }
        //4.处理插入到中间位置
        //prev 这个引用就对应到index -1的位置
        LinkedNode prev = getIndexPos(index - 1);
        //5.完成具体的插入
        node.next = prev.next;
        prev.next = node;
    }

    private LinkedNode getIndexPos(int index) {
        //是否判定一下index在有效范围中
        LinkedNode cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public int size() {
        int size = 0;
        for (LinkedNode cur = this.head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    public boolean contains(int toFind) {
        for (LinkedNode cur = this.head; cur != null; cur = cur.next) {
            if (cur.getData() == toFind) {
                return true;
            }
        }
        return false;
    }

    public void remove(int toRemove) {
        //1.先单独处理下空链表的情况
        if (head == null) {
            return;
        }
        //2.先考虑是否要删除的是头结点
        if (head.getData() == toRemove) {
            this.head = this.head.next;
            return;
        }
        //3.删除中间的结点,找到要删除元素的前一个元素
        LinkedNode prev = searchPrev(toRemove);
        if (prev == null) {
            return;
        }
        //prev.next = prev.next.next; //这种写法虽然没错,但是比较抽象
        LinkedNode nodeToRemove = prev.next;
        prev.next = nodeToRemove.next;
    }

    private LinkedNode searchPrev(int toRemove) {
        if (this.head == null) {
            return null;
        }
        //找到要删除元素的前一个位置
        LinkedNode prev = this.head;
        while (prev.next != null) {
            if (prev.next.getData() == toRemove) {
                return prev;
            }
            prev = prev.next;
        }
        //返回null 表示没找到
        return null;
    }


    //先不管头结点，先把后面所有该删的结点都删完，最后处理头结点
    public void removeAllKey(int toRemove) {
        if (head == null) {
            return;
        }
        //先处理后续的结点，最后处理头结点的情况
        LinkedNode prev = head;
        LinkedNode cur = head.next;
        while (cur != null) {
            if (cur.getData() == toRemove) {
                //cur对应的结点就应该删掉
                prev.next = cur.next;   //删除cur指向的结点
                cur = prev.next;        //让cur继续指向prev的下一个结点
            } else {
                //cur对应的结点不用删除
                prev = cur;
                cur = cur.next;
            }
        }
        //头结点的情况
        if (this.head.getData() == toRemove) {
            this.head = this.head.next;
        }
        return;
    }

    public void clear() {
        //java垃圾回收，后续的所有结点只要这个结点没有引用指向它，就会被jvm判定成垃圾被回收掉
        this.head = null;
    }

    public void reverse() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            return;
        }
        LinkedNode oldHead = head;
        LinkedNode cur = head.next;
        while (cur != null) {
           oldHead.next = cur.next;
           cur.next = head;
           head = cur;
           cur = oldHead.next;
        }
    }

}
//链表的插入和删除的高效率是有前提的
//得知道要插入或者删除的结点前一个位置，这时候就是O(1)
//如果不知道位置，复杂度就是O(N)
//对于插入来说必须得知道前一个位置才高效
//但是对于删除来说，不知道前一个位置，只知道当前位置，也有办法让删除高效(伪删除)
//改当前结点data删后一个结点
