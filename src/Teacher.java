/**
 * @authors: Jacob Bennett
 * Keith Kwan
 * Kyle Allen
 * Eric Nguyen
 * Kaveen Heenatigala
 * Cole Harris
 */


public class Teacher extends Person{
    private double salary = 0;
    private int tenure = 0;
    private String department = "";
    private String realtID = "";
    private static String tID = "T0";
    
    public Teacher(String first, String last, int age, double salary, int tenure, String dept){
            super(first, last, age);
            setSalary(salary);
            setTenure(tenure);
            setDepartment(dept);
            setID();
            tID = updatetID(tID);
    }
    
    private static String updatetID(String id){
        int num = Integer.valueOf(id.substring(1, id.length()));
        num = num + 1;
        id = "T" + Integer.toString(num);
        return id;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    private void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the tenure
     */
    public int getTenure() {
        return tenure;
    }

    /**
     * @param tenure the tenure to set
     */
    private void setTenure(int tenure) {
        this.tenure = tenure;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    private void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the tID
     */
    public String getID() {
        return this.realtID;
    }
    
    private void setID(){
        this.realtID = tID;
    }
}