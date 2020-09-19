package hospital;

public abstract class HospitalEmployee {
    protected String employeeNumber;            //protected variables shared among the children
    protected String name;

    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public HospitalEmployee(String employeeNumber, String name) {
        this.employeeNumber = employeeNumber;
        this.name = name;
    }

    public abstract int calculatePay();     //dedicated abstract method that we'll have to build for all our employees

}
