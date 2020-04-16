/**
 * @authors: Jacob Bennett
 * Keith Kwan
 * Kyle Allen
 * Eric Nguyen
 * Kaveen Heenatigala
 * Cole Harris
 */

import java.util.ArrayList;

public class DataBase {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static ArrayList<Teacher> teacherList = new ArrayList<>();
    private static ArrayList<Counselor> counselorList = new ArrayList<>();
    
    public static Student studentIDLookUp(String ID){
        for(int i = 0; i < DataBase.studentList.size(); i++){
            if(DataBase.studentList.get(i).getID().equals(ID)){
                return DataBase.studentList.get(i);
            }
        }
        return null;
    }
    public static Teacher teacherIDLookUp(String ID){
        for(int i = 0; i < DataBase.teacherList.size(); i++){
            if(DataBase.teacherList.get(i).getID().equals(ID)){
                return DataBase.teacherList.get(i);
            }
        }
        return null;
    }
    
        public static Counselor counselorIDLookUp(String ID){
        for(int i = 0; i < DataBase.counselorList.size(); i++){
            if(DataBase.counselorList.get(i).getID().equals(ID)){
                return DataBase.counselorList.get(i);
            }
        }
        return null;
    }
        
    public static void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }
    public static void addStudent(Student student){
        studentList.add(student);
    }
    public static void addCounselor(Counselor counselor){
        counselorList.add(counselor);
    }
    public static ArrayList<Teacher> getTeacherList(){
        return teacherList;
    }
    public static ArrayList<Student> getStudentList(){
        return studentList;
    }
    
    public static ArrayList<Counselor> getCounselorList(){
        return counselorList;
    }
}
