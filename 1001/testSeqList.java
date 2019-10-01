public class testSeqList {
    public static void main(String[] args) {
        SeqList seqList = new SeqList();
        seqList.add(0, 1);
        seqList.add(1, 2);
        seqList.add(2, 3);
        seqList.add(3, 4);
        seqList.add(2, 5);
        seqList.display();

        boolean result = seqList.contains(5);
        System.out.println(result);

        int result1 = seqList.search(5);
        System.out.println("result 预期是2， 实际是 " + result1);

        seqList.remove(3);
        seqList.display();
    }

    //每个方法都单独写一段代码进行测试，这种测试方式成为“单元测试”
    public static void testAdd() {
        SeqList seqList = new SeqList();
        seqList.add(0, 1);
        seqList.add(1, 2);
        seqList.add(2, 3);
        seqList.add(3, 4);
        seqList.add(2, 5);
        seqList.display();
    }

    public static void testContains() {

    }

}
