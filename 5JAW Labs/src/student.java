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
public class student extends person implements Comparable<student> {
    
    public int StudentId;
    public String Program;
    public LocalDate DateRegistered;
    

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public LocalDate getDateRegistered() {
        return DateRegistered;
    }

    public void setDateRegistered(LocalDate DateRegistered) {
        this.DateRegistered = DateRegistered;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelNum() {
        return TelNum;
    }

    public void setTelNum(String TelNum) {
        this.TelNum = TelNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Program);
        hash = 97 * hash + Objects.hashCode(this.DateRegistered);
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
        final student other = (student) obj;
        if (!Objects.equals(this.Program, other.Program)) {
            return false;
        }
        if (!Objects.equals(this.DateRegistered, other.DateRegistered)) {
            return false;
        }
        return true;
    }

    public student(int studentId, String Program, LocalDate DateRegistered, String name, String email, String telNum) {
        super(name, email, telNum);
        this.StudentId = studentId;
        this.Program = Program;
        this.DateRegistered = DateRegistered;
    }
    
    
    @Override
    public String toString() {
        return "student { " + "StudentId = " + StudentId + " , Program = " + Program + ",  DateRegistered = " + DateRegistered + '}';
    }
    
    public int compareTo(student student) {
        return this.StudentId - student.StudentId;
    }
    
    
}
