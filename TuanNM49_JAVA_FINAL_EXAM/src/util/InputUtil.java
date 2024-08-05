package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static String getString() {
        String value = sc.nextLine();
        return value;
    }

    public static int getInt() {
        int a = 0;
        boolean flag;
        do {
            String value = getString();
            try {
                a = Integer.valueOf(value);
                flag = true;
            } catch (Exception e) {
                flag = false;
                System.out.println("Invalid input! Try again.");
            }
        } while (!flag);
        return a;
    }

    public static double getDouble() {
        double a = 0;
        boolean flag;
        do {
            String value = getString();
            try {
                a = Double.valueOf(value);
                flag = true;
            } catch (Exception e) {
                flag = false;
                System.out.println("Invalid input! Try again.");
            }
        } while (!flag);
        return a;
    }

    public static float getFloat() {
        float a = 0;
        boolean flag;
        do {
            String value = getString();
            try {
                a = Float.valueOf(value);
                flag = true;
            } catch (Exception e) {
                flag = false;
                System.out.println("Invalid input! Try again.");
            }
        } while (!flag);
        return a;
    }

    public static String getEmail() {
        String a = null;
        boolean flag, result;
        do {
            String value = getString();
            result = value.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
            if (result) {
                a = value;
                flag = true;
            } else {
                flag = false;
                System.out.println("Invalid input! Try again.");
            }
        } while (!flag);
        return a;
    }

    public static String getDOB() {
        String a;
        boolean result;
        while (true) {
            String value = getString();
            result = value.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$");
            if (result) {
                a = value;
                break;
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }
        return a;
    }

    public static Date getDate() throws ParseException {
        Date a;
        boolean result;
        while (true) {
            String value = getString();
            result = value.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$");
            if (result) {
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
                a = format.parse(value);
                break;
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }
        return a;
    }

    public static int getAge() {
        int a = 0;
        boolean flag;
        do {
            String value = getString();
            try {
                a = Integer.valueOf(value);
                if (a > 0) {
                    flag = true;
                } else {
                    flag = false;
                    System.out.println("Invalid input:(Value<0)! Try again.");
                }
            } catch (Exception e) {
                flag = false;
                System.out.println("Invalid input! Try again.");
            }
        } while (!flag);
        return a;
    }

}