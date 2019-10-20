package package2;

public class D extends B{
    private int num = 1;
    /*
    public D() {
        //super();
        //System.out.println("D");
    }
    */

    @Override
    public void func() {
        System.out.println("D.func()" + num);
    }
}
