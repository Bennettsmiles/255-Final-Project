/**
 *
 * @authors: Jacob Bennett
 * Keith Kwan
 * Kyle Allen
 * 
 */

public abstract class Person{
    
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
       
    public Person(String first, String last, int age){
        setFirstName(first);
        setLastName(last);
        setAge(age);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    private void setAge(int age) {
        this.age = age;
    }
    }