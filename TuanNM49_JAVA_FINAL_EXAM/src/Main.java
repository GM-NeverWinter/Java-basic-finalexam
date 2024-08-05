import util.InputUtil;

import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date date1;
        Date date2;

        System.out.println("Input date 1: ");
        date1 = InputUtil.getDate();
        System.out.println("Input date 2: ");
        date2 = InputUtil.getDate();
        System.out.println(date1);
        System.out.println(date2);
    }
}