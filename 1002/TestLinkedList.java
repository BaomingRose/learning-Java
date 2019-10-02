public class TestLinkedList {
    public static void main(String[] args) {
        testAddFirst();
        testAddLast();
        testAddIndex();
        testRemove();
        testRemoveAllKey();
        testReverse();
    }

    public static void testAddFirst() {
        System.out.println("测试头插：");
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
    }

    public static void testAddLast() {
        System.out.println("测试尾插：");
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
    }

    public static void testAddIndex() {
        System.out.println("测试插入任意位置：");
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();

        list.addIndex(2, 5);
        list.display();

        System.out.println(list.contains(3));
    }

    public static void testRemove() {
        System.out.println("测试删除链表的元素：");
        /**要测试的点
         * 1.空链表
         * 2.删除头结点
         * 3.删除普通结点
         * 4.删除一个不存在的元素
         * 5.删除重复元素
         */
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.remove(1);
        list.display();
    }

    public static void testRemoveAllKey() {
        System.out.println("测试删除链表的相同元素");
        LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(5);
        System.out.println("预期结果为[3,5]");
        list.removeAllKey(2);
        System.out.println("实际结果为");
        list.display();
    }

    public static void testReverse() {
        System.out.println("测试逆置链表");
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();
        list.reverse();
        list.display();

    }
}
