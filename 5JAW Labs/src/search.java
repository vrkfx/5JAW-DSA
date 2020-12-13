import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vrkfx
 * 
 */
public class search {
    
    public static int linearSearchStudent(ArrayList<student> students, int id) {
        
        for (int i=0; i<students.size(); i++) {
            int id1 = students.get(i).StudentId;
            if(id1 == id) {
                return i;
            }
        }
        return -1;
    }
    
    
    public static ArrayList<String> linearSearchEnrolledinCourse(ArrayList<courses> courses, String id) {
        ArrayList<String> result = new ArrayList<String>();
        int count = 0;
        for(int i=0; i<courses.size(); i++) {
            if(courses.get(i).CourseCode == id) {
                count++;
                String s = courses.get(i).enrollment.student.Name;
                result.add(s);
            }
        }
        return result;
    }
    
    public static int BinarySearch(ArrayList<enrollement> student, int i) {
        int min = 0;
        int max = student.size();
        int mid;
        
        while(min <= max) {
            mid = (min+max)/2;
            if(student.get(mid).enrollmentId == i) {
                return mid;
            }
            if (student.get(mid).enrollmentId < i) {
                min = mid +1;
            } else {
                max = mid -1;
                
            }           
        }
        
        return -1;
    }
    
}
