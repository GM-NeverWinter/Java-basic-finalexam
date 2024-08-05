package javabasic.finaltest.bai1;

public class MyMainClass {
    public static void main(String[] args) {

        //input
        MyUtilClass myUlt = new MyUtilClass();

        System.out.println("Nhap x: ");
        double x = util.InputUtil.getDouble();
        System.out.println("Nhap y: ");
        double y = util.InputUtil.getDouble();
        System.out.println("ACTION (input: CONG/NHAN): ");
        String action = util.InputUtil.getString().toUpperCase();

        //output
        switch (action) {
            case "CONG":
                System.out.println("Tong 2 so = " + myUlt.tinhTong(x, y));
                break;
            case "NHAN":
                System.out.println("Tich 2 so = " + myUlt.tinhNhan(x, y));
                break;
            default:
                System.out.println("Invalid Input! (input: CONG/NHAN)");

        }
    }
}
