public class Demo01 {
    int val;
    public static LinkedNode reverseList(LinkedNode _head) {
        if (_head == null) {
            return null;
        }
        if (_head.next == null) {
            return null;
        }
        LinkedNode newHead = null;
        LinkedNode cur = _head;
        LinkedNode prev = null;
        while (cur != null) {
            LinkedNode next = cur.next;
            if (next == null) {
                newHead = cur;
            }
            //翻转指针的指向
            cur.next = prev;
            //更新prev和cur
            prev = cur;
            cur = next;
        }
        return newHead;
    }

    //设置中间结点为头结点,如果为偶数个结点,设置后一个为头结点
    public static void middleNode(LinkedList h) {
        LinkedNode cur = h.getHead();
        int steps = h.size() / 2;
        for (int i = 0; i < steps; i++) {
            cur = cur.next;
        }
        h.setHead(cur);
    }
    //还有一种方法快慢指针法,一个fast指针一次走两步,last指针一次走一步
    //结束循环条件 fast == null || fast.next == null
    //两种方法性能差不多

    public static LinkedList mergeTwoLists(LinkedList l1, LinkedList l2) {
        LinkedList newList = null;
        if (l1.getHead() == null) {
           return l2;
        }
        if (l2.getHead() == null) {
            return l1;
        }
        LinkedNode cur1 = l1.getHead();
        LinkedNode cur2 = l2.getHead();
        LinkedNode newHead = null;
        LinkedNode newTail = null;
        while (cur1 != null && cur2 != null) {
            if (cur1.getData() < cur2.getData()) {
                //就把cur1指向的结点插入到新链表的尾部
                if (newHead == null) {
                    //新链表是空链表
                    newHead = cur1;
                    newTail = cur1;
                    cur1 = cur1.next;
                } else {
                    //新链表不是空链表
                    newTail.next = cur1;
                    //更新尾部的指向
                    newTail = cur1;
                    cur1 = cur1.next;
                }
            } else {
                //就把cur2指向的结点插入到新链表的尾部
                if (newHead == null) {
                    newHead = cur2;
                    newTail = cur2;
                    cur2 = cur2.next;
                } else {
                    newTail.next = cur2;
                    newTail = cur2;
                    cur2 = cur2.next;
                }
            }
        }
        //如何判定当前哪个链表到达结尾，哪个链表还有剩余
       if (cur1 == null) {
           //cur2还有剩余
           newTail.next = cur2;
       } else {
           //cur1还有剩余
           newTail.next = cur1;
       }
        newList.setHead(newHead);
        return newList;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        LinkedNode node = list.getHead();
        //list.setHead(reverseList(node));
        list.display();

        LinkedList list2 = new LinkedList();
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(3);
        list2.display();

        LinkedList merge = mergeTwoLists(list, list2);
        merge.display();

//        middleNode(list);
//        list.display();
    }
}
