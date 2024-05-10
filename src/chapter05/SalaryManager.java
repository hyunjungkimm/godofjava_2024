package chapter05;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        double salary = salaryManager.getMonthlySalary(20000000);
        System.out.println(salary);
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary / 12.0;
        double tax = calculateTax(monthlySalary);
        double nationPension = calculateNationPension(monthlySalary);
        double healthInsurance =  calculateHealthInsurance(monthlySalary);
        double totalTax =  tax + nationPension + healthInsurance;
        double salary = monthlySalary - totalTax;
        return salary;
    }

    public double calculateTax(double monthlySalary) {
        double tax = monthlySalary * 0.125;
        System.out.println(tax);
        return tax;
    }

    public double calculateNationPension(double monthlySalary) {
        double tax = monthlySalary * 0.081;
        System.out.println(tax);
        return tax;
    }

    public double calculateHealthInsurance(double monthlySalary) {
        double tax = monthlySalary * 0.135;
        System.out.println(tax);
        return tax;
    }
}
