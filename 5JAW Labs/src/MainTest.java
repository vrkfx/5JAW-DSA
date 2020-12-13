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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;



public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LocalDate date = java.time.LocalDate.now();
        
     
        //person
        
        person person1 = new person("jack", "j1@gmail.com", "0123456789");
        person person2 = new person("john", "j2@gmail.com", "0123456789");
        person person3 = new person("james", "j3@gmail.com", "0123456789");
        person person4 = new person("june", "j4@gmail.com", "0123456789");
        person person5 = new person("vrkfx", "v1@gmail.com", "0123456789");
        person person6 = new person("pratik", "p1@gmail.com", "0123456789");
        
        //student      
        student student1 = new student(00110210, "IT", date, person1.Name, person1.Email, person1.TelNum);
        student student2 = new student(00110211, "IT", date, person2.Name, person2.Email, person2.TelNum);
        student student3 = new student(00110212, "IT", date, person3.Name, person3.Email, person3.TelNum);
        student student4 = new student(00110213, "IT", date, person4.Name, person4.Email, person4.TelNum);
        student student5 = new student(00110214, "IT", date, person5.Name, person5.Email, person5.TelNum);
        student student6 = new student(00110215, "IT", date, person6.Name, person6.Email, person6.TelNum);
        
        //courses       
        courses course1 = new courses("s100", "6CLP", 1500.00);
        courses course2 = new courses("C200", "5JAW",  6300.00);
        courses course3 = new courses("C300", "5JAM", 5740.00);
        courses course4 = new courses("C400", "5WORKs", 1820.00);
        courses course5 = new courses("C500", "5SDA", 3000.00);
        courses course6 = new courses("C600", "5TSD", 1500.00);
        
        //enrollment       
        enrollement enrollement1 = new enrollement(1500, student1, date, "IPG750" );
        enrollement enrollement2 = new enrollement(6300, student2, date, "IPG752");
        enrollement enrollement3 = new enrollement(5740, student3, date, "IPG754");
        enrollement enrollement4 = new enrollement(1820, student4, date, "IPG756");
        enrollement enrollement6 = new enrollement(3000, student5, date, "IPG758");
        enrollement enrollement5 = new enrollement(1501, student6, date, "IPG760");
        
       
           //equals method 
        
        System.out.println("equals Method");   
           
        System.out.println(person1.equals(person4)); //flase
        System.out.println(student6.equals(person1)); //false
        System.out.println(enrollement5.equals(enrollement5)); //true
        System.out.println(person5.equals(enrollement1)); //false
        System.out.println(person1.equals(person2)); //false
        System.out.println(person2.equals(person2)); //true

        System.out.println();
        
        // comparators 
        
        ArrayList<student> students = new ArrayList<student>();
        students.add(student1);
        students.add(student6);
        students.add(student2);
        students.add(student5);
        students.add(student3);
        students.add(student4);
        
        ArrayList<courses> courses = new ArrayList<courses>();
        
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        courses.add(course5);
        courses.add(course6);
        
        ArrayList<enrollement> enrollments = new ArrayList<enrollement>();
        
        enrollments.add(enrollement1);
        enrollments.add(enrollement2);
        enrollments.add(enrollement3);
        enrollments.add(enrollement4);
        enrollments.add(enrollement5);
        enrollments.add(enrollement6);      
        
        
        
        System.out.println();
        
        //unsorted list
        System.out.println("Before Sorting");
        
        for (student s: students) 
        {
            System.out.println(" Student Name" + s.Name + s.StudentId + "Program:" + s.Program );
        }
        
        System.out.println();
        
        //sort by Id
        System.out.println("After Sorting");
        
        Collections.sort(students);
        for (student s: students) 
        {
            System.out.println(" Student Name" + s.Name + s.StudentId + "Program:" + s.Program );
        }
        
        System.out.println();
        
        

        //searching

        System.out.println("Linear Search");
        
        //Search for 00110211 return 5 
        System.out.println(search.linearSearchStudent(students, 00110215));
        
        //-1 not found 
        System.out.println(search.linearSearchStudent(students, 001102));
        
        System.out.println();
        System.out.println("Binary Search");
       
        System.out.println(search.BinarySearch(enrollments, 3000)); //5 pos
        System.out.println(search.BinarySearch(enrollments, 1500)); //0 pos 

        System.out.println();
        
        //sort 

        //Sort student
        sort.bubbleSort(students);
        
        System.out.println("Bubble Sort");
        
        students.forEach((student s) ->
        {
            System.out.println(s.StudentId  );
        });
        
        System.out.println();
        
        students.forEach((student s) ->
        {
            System.out.println(s.Name );
        });
        
        System.out.println();
        
        //Sort enrollement
        sort.selectionSort(students);
        System.out.println("Selection sort");
        students.forEach((s) -> {
            System.out.println(s.StudentId);
        });

         System.out.println();
        
        //linked List 
        Node first = new Node(3);
        Node middle = new Node(5);
        first.setNext(middle);
        Node last = new Node(7);
        middle.setNext(last);
        //Node.printList(first);
        
        Node s1 = new Node(student1);
        Node s2 = new Node(student2);
        Node s3 = new Node(student3);
        Node s4 = new Node(student4);
        Node s5 = new Node(student5);
        Node s6 = new Node(student6);
 
        
        LinkedList<student> sLinkedList = new LinkedList<student>();
        
        sLinkedList.addFirst(s1);
        sLinkedList.addLast(s2);
        sLinkedList.addLast(s3); 
        sLinkedList.addLast(s4);
        sLinkedList.addLast(s5);
        sLinkedList.addLast(s6);

        System.out.println("Total : " + sLinkedList.count );
        LinkedList.printList(s1);
        
        
        
        System.out.println("\nRemoving 37005 from Linked List " );
        
         System.out.println();
        sLinkedList.removeLast();
        LinkedList.printList(s1);
        System.out.println("Total : " + sLinkedList.count );
        
        
         System.out.println();
        //Doubly Linked List

        Node node1 = new Node(student1);
        Node node2 = new Node(student2);
        Node node3 = new Node(student3);
        Node node4 = new Node(student4);
        Node node5 = new Node(student5);
        Node node6 = new Node(student6);
        
        
        LinkedList<courses> DoblyLinkedList = new LinkedList<courses>();
        DoblyLinkedList.addFirst(node1);
        DoblyLinkedList.addLast(node2);
        DoblyLinkedList.addLast(node3); 
        DoblyLinkedList.addLast(node4);
        DoblyLinkedList.addLast(node5);
        DoblyLinkedList.addLast(node6);
        
        System.out.println();
        
        System.out.println("Adding items ");
        System.out.println("Total : " + DoblyLinkedList.count );
        DoblyLinkedList.printList(node1);
        
        System.out.println();
        
        System.out.println("Removing First" );
        DoblyLinkedList.removeLast();
        
        System.out.println();
        
        LinkedList.printList(node1);
        System.out.println("Count: (" + DoblyLinkedList.count + ")");
        
        System.out.println();
        
        System.out.println("Result in LinkedList");
        System.out.println("(s5)" + DoblyLinkedList.contains(course6)); 

        
        
        
    }
    
}
