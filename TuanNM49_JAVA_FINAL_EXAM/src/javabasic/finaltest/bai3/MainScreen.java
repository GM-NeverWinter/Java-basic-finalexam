package javabasic.finaltest.bai3;

import java.util.ArrayList;
import java.util.Objects;

public class MainScreen {

    private static final ArrayList<Employee> emp = new ArrayList<>();

    public static void main(String[] args) {
        inputFinal(); // Input
        outputB(); // In ra tất cả Employee trong danh sách
        outputC(); // Sử dụng vòng lặp FOR để in ra danh sách vừa nhập. Xét salary
        outputD(); // Tính tổng lương trung bình
    }

    //input
    private static void inputData() {
        // input
        Employee e = new Employee();
        System.out.println("Nhap ten: ");
        String name = util.InputUtil.getString();
        System.out.println("Nhap tuoi: ");
        int age = util.InputUtil.getAge();
        System.out.println("Nhap ngay sinh (dd/mm/yyyy): ");
        String dob = util.InputUtil.getDOB();
        System.out.println("Nhap level: ");
        double level = util.InputUtil.getDouble();
        System.out.println("Nhap luong: ");
        float salary = util.InputUtil.getFloat();

        // set
        e.setFullName(name);
        e.setAge(age);
        e.setDob(dob);
        e.setLevel(level);
        e.setSalary(salary);

        //add
        emp.add(e);
    }

    private static void inputFinal() {
        boolean flag;
        do {
            inputData();
            while (true) {
                System.out.println("Muon nhap tiep khong Y/N: ");
                String choice = util.InputUtil.getString().toLowerCase();
                if (Objects.equals(choice, "n")) {
                    flag = true;
                    break;
                } else if (Objects.equals(choice, "y")) {
                    flag = false;
                    break;
                } else {
                    System.out.println("Invalid Input. (input: Y/N)");
                }
            }
        } while (!flag);
    }

    //output
    private static void outputB() {
        System.out.println();
        System.out.println("-- Danh sach nhan vien -- ");
        for (int i = 0; i < emp.size(); i++) {
            Employee e = emp.get(i);
            System.out.println("#Nhan vien " + (i + 1));
            System.out.println("FullName:" + e.getFullName() + " | Age:" + e.getAge()
                    + " | DoB:" + e.getDob() + " | Level:" + e.getLevel() + " | Salary:" + e.getSalary());
        }

    }

    private static void outputC() {
        System.out.println();
        System.out.println("-- Danh sach nhan vien theo muc luong -- ");
        for (Employee e : emp) {
            if (e.getSalary() < 10000) {
                System.out.println("#Nhan vien " + e.getFullName() + " co muc luong thap");
            } else if (e.getSalary() >= 10000 && e.getSalary() < 20000) {
                System.out.println("#Nhan vien " + e.getFullName() + " co muc luong trung binh");
            } else if (e.getSalary() >= 20000) {
                System.out.println("#Nhan vien " + e.getFullName() + " co muc luong cao");
            }
        }
    }

    private static void outputD() {
        System.out.println();
        System.out.println("-- Tong luong trung binh -- ");
        float totalSalary = 0;
        for (Employee e : emp) {
            totalSalary = totalSalary + e.getSalary();
        }
        System.out.println(totalSalary / emp.size());
    }
}
