/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smiles
 */

public class Student extends Person{
    private String currentYear = "";
    private String gradDate = "";
    private String major = "";
    private static String sID = "S0";
    public Student (String first, String last, int age, String currentYear, String gradDate, String major){
        super(first, last, age);
        setCurrentYear(currentYear);
        setGradDate(gradDate);
        setMajor(major);
        sID = updatesID(sID);
    }
    
    private String updatesID(String id){
        int num = Integer.valueOf(id.substring(1, id.length()-1));
        num = num + 1;
        id = "S" + num;
        return id;
    }

    /**
     * @return the currentYear
     */
    public String getCurrentYear() {
        return currentYear;
    }

    /**
     * @param currentYear the currentYear to set
     */
    private void setCurrentYear(String currentYear) {
        this.currentYear = currentYear;
    }

    /**
     * @return the gradDate
     */
    public String getGradDate() {
        return gradDate;
    }

    /**
     * @param gradDate the gradDate to set
     */
    private void setGradDate(String gradDate) {
        this.gradDate = gradDate;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    private void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the sID
     */
    public String getID() {
        return this.sID;
    }

    
}
