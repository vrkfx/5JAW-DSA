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
public class person {
    
    public String Name;
    public String Email;
    public String TelNum;
    
    public static final String DEF_NAME = "DEFAULT_NAME";
    public static final String DEF_EMAIL = "DEFAULT_EMAIL";
    public static final String DEF_TEL_NUM = "DEFAULT_TEL_NUM";

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
    
    //main 
    public person(String name, String email, String telNum) {
        this.Name = name;
        this.Email = email;
        this.TelNum = telNum;
    }
    
    public person() {
        this.Name = DEF_NAME;
        this.Email =DEF_EMAIL;
        this.TelNum = DEF_TEL_NUM;
        
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", Email=" + Email + ", TelNum=" + TelNum + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.Name);
        hash = 61 * hash + Objects.hashCode(this.Email);
        hash = 61 * hash + Objects.hashCode(this.TelNum);
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
        final person other = (person) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.TelNum, other.TelNum)) {
            return false;
        }
        return true;
    }
    
    
    
}
