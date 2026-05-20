import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basicSalary, hra, da, grossSalary;

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;

        grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary = " + grossSalary);
    }
}
