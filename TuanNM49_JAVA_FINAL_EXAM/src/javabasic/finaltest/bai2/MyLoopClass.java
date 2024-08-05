package javabasic.finaltest.bai2;

public class MyLoopClass {
    public static void main(String[] args) {

        //input
        System.out.println("Nhap so bat ky: ");
        int a = util.InputUtil.getInt();
        int chan = 0, le = 0;

        //process
        if (a < 0) {
            System.out.println("Khong the tinh tong chan va le tu 0 den " + a);
        } else {
            for (int i = 0; i <= a; i++) {
                if (i % 2 == 0) {
                    chan = chan + i;
                } else {
                    le = le + i;
                }
            }
            //output
            System.out.println("Tong chan = " + chan);
            System.out.println("Tong le = " + le);
        }
    }

}

