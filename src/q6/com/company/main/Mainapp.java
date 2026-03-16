package q6.com.company.main;

import q6.com.company.hr.Employee;
import q6.com.company.payroll.Payroll;

class MainApp {

    public static void main(String[] args) {

        Employee e = new Employee(1,"Amit","IT",50000);

        Payroll p = new Payroll();

        p.calculateBonus(e);

        e.display();

    }
}