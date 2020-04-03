/**
 *
 * @authors: Jacob Bennett
 * Eric Nguyen
 * 
 * 
 * 
 * 
 */

public class Counselor extends Person{
    
    private double salary = 0;
    private int tenure = 0;
    private int numberOfStudents = 0;
    //private String department = "";
    private String realcID = "";
    private static String cID = "C0";
    
    public Counselor(String first, String last, int age, double salary, int tenure, int numberOfStudents){
            super(first, last, age);
            setSalary(salary);
            setTenure(tenure);
            setNumberOfStudents(numberOfStudents);
            //setDepartment(dept);
            setID();
            cID = updatetID(cID);
    }
    
    private static String updatetID(String id){
        int num = Integer.valueOf(id.substring(1, id.length()));
        num = num + 1;
        id = "C" + Integer.toString(num);
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
    /*public String getDepartment() {
        return department;
    }*/

    /**
     * @param department the department to set
     */
    /*private void setDepartment(String department) {
        this.department = department;
    }*/

    /**
     * @return the tID
     */
    public String getID() {
        return this.realcID;
    }
    
    private void setID(){
        this.realcID = cID;
    }

    /**
     * @return the numberOfStudents
     */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * @param numberOfStudents the numberOfStudents to set
     */
    private void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    
}
