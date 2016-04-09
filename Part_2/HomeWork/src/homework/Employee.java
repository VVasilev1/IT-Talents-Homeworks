package homework;

public class Employee extends Person {
    public static final int MIN_SALARY = 0;
    public static final int MIN_OVERTIME_AGE = 18;
    public static final double MULTYPLICATOR = 1.5;
    double daySalary;
    Employee (String name,short age,boolean isMale,double daySalary) {
        super(name,age,isMale);
        if (daySalary > MIN_SALARY) {
        this.daySalary = daySalary;     
        }
    }
    double calculateOverTime (double hours) {
        
        if (this.age >= MIN_OVERTIME_AGE) {
            return (hours * this.daySalary) * MULTYPLICATOR;
        }
        else {
            return hours * this.daySalary;
        }
    }
    void showEmployeeInfo () {
        System.out.println(this.name + " " + this.age + " " + this.isMale + " " + this.daySalary);
    }
    
    }