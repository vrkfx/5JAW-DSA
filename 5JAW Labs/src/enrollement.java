import java.time.LocalDate;
import java.util.Objects;
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
public class enrollement implements Comparable<enrollement>{
    
    public LocalDate dateEnrolled;
    student student;
    public String grade;
    public int enrollmentId;
    
        @Override
    public String toString() {
        return "Enrollment{" + "dateEnrolled=" + dateEnrolled + ", student=" + student + ", grade=" + grade + '}';
    }
    
    public int getEnrollmentId() {
        return enrollmentId;
    }
    
    public void setEnrollmentId(int e) {
        this.enrollmentId = e;
    }

    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(LocalDate dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public student getStudent() {
        return student;
    }

    public void setStudent(student student) {
        this.student = student;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public enrollement(int id, student student, LocalDate dateEnrolled, String grade) {
        this.student = new student(student.StudentId, student.Program, student.DateRegistered, student.Name, student.Email, 
                student.TelNum);
        this.enrollmentId = id;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.dateEnrolled);
        hash = 79 * hash + Objects.hashCode(this.student);
        hash = 79 * hash + Objects.hashCode(this.grade);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final enrollement other = (enrollement) obj;
        if (!Objects.equals(this.grade, other.grade)) {
            return false;
        }
        if (!Objects.equals(this.dateEnrolled, other.dateEnrolled)) {
            return false;
        }
        if (!Objects.equals(this.student, other.student)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(enrollement enrollment) {
        return this.enrollmentId - enrollment.enrollmentId;
    }
    
    public int compareTo(int i) {
        return this.enrollmentId - i;
    }
    
    
}
