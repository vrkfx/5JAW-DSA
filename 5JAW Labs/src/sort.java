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
public class sort {
    
    public static void bubbleSort(ArrayList<student> students) {
        student t;
        for(int x = 0; x<= students.size()-2; x++ ){
            for(int i = 0; i<= students.size()-2; i++) {
                if(students.get(i).Name.compareTo(students.get(i+1).Name)>0) {
                     t = students.get(i);
                     students.set(i, students.get(i+1));
                     students.set(i+1, t);
                }
            }
        }
    }
    
    public static void selectionSort(ArrayList<student> students) {
        for(int i = 0; i< students.size(); i++) {
            int pos = i;
            for(int j = i; j<students.size(); j++) {
                if(students.get(i).StudentId < students.get(pos).StudentId) {
                    pos = j;
                }
                
                student min = students.get(pos);
               students.set(pos, students.get(i));
                students.set(i, min);
                
            }
        }
    }
    
    
    
}
