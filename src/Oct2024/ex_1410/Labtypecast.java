package Oct2024.ex_1410;

public class Labtypecast {
    public static void main(String[] args)
    {
        byte b=10;
        double d= b;
        System.out.println(b);
        System.out.println(d);

        double myd = 250.45d;
        byte myb = (byte)myd;
        short mys = (short)myd;
        int myint = (int)myd;


        System.out.println(myd);
        System.out.println(myb);
        System.out.println(mys);
        System.out.println(myint);



    }
}
