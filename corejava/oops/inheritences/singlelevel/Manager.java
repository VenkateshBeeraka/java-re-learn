package corejava.oops.inheritences.singlelevel;

public class Manager extends Employee {

    private String department;

    public Manager(int empId, String empName, String department){
        super(empId,empName);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void detailsInfo(){
        displayEmployeeDetails();
        System.out.println("Department : " + department);
    } 

    public static void main(String[] args) {
        Manager manager = new Manager(1, "Venkatesh", "IT");
        manager.detailsInfo();
    }

}
