package Payroll;
// SalariedEmployee.java 
// SalariedEmployee class extends Employee. 

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    // constructor 
    public SalariedEmployee(String first, String last,
            String socialSecurityNumber, double salary) {
        super(first, last, socialSecurityNumber);
        setWeeklySalary(salary);
    }

    // set salaried employee's salary 
    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    // return salaried employee's salary 
    public double getWeeklySalary() {
        return weeklySalary;
    }
// calculate salaried employee's pay; 
    // override abstract method earnings in Employee 

    public double earnings() {
        return getWeeklySalary();
    }

    // return String representation of SalariedEmployee object 
    public String toString() {
        return "\nsalaried employee: " + super.toString();
    }
} // end class SalariedEmployee 
