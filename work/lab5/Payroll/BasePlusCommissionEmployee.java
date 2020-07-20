package Payroll;

public class BasePlusCommissionEmployee extends Employee {

    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee(String first, String last,
            String ssn, double sales, double rate, double salary) {
        super(first, last, ssn);

        setGrossSales(sales); // validate and store gross sales
        setCommissionRate(rate); // validate and store commission rate
        setBaseSalary(salary); // validate and store base salary
    } // end six-argument BasePlusCommissionEmployee constructor
    // set gross sales amount

    public void setGrossSales(double sales) {
        grossSales = (sales < 0.0) ? 0.0 : sales;
    } // end method setGrossSales
    // return gross sales amount

    public double getGrossSales() {
        return grossSales;
    } // end method getGrossSales
    // set commission rate

    public void setCommissionRate(double rate) {
        commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    } // end method setCommissionRate
    // return commission rate

    public double getCommissionRate() {
        return commissionRate;
    } // end method getCommissionRate
    // set base salary

    public void setBaseSalary(double salary) {
        baseSalary = (salary < 0.0) ? 0.0 : salary;
    } // end method setBaseSalary
    // return base salary

    public double getBaseSalary() {
        return baseSalary;
    } // end method getBaseSalary
    // calculate earnings

    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    } // end method earnings
    // return String representation of BasePlusCommissionEmployee

    public String toString() {
        return "\nBase plus Commossion Employee : " + super.toString();
    } // end method toString
} // end class BasePlusCommissionEmployee