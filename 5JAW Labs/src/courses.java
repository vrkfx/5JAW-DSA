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
public class courses implements Comparable<courses>{
    
    /**
     *
     */
    public String CourseCode;

    /**
     *
     */
    public String CourseName;

    /**
     *
     */
    public double Cost;
    enrollement enrollment;

    /**
     *
     * @return
     */
    public String getCourseCode() {
        return CourseCode;
    }

    /**
     *
     * @param CourseCode
     */
    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    /**
     *
     * @return
     */
    public String getCourseName() {
        return CourseName;
    }

    /**
     *
     * @param CourseName
     */
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    /**
     *
     * @return
     */
    public double getCost() {
        return Cost;
    }

    /**
     *
     * @param Cost
     */
    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    /**
     *
     * @return
     */
    public enrollement getEnrollment() {
        return enrollment;
    }

    /**
     *
     * @param enrollment
     */
    public void setEnrollment(enrollement enrollment) {
        this.enrollment = enrollment;
    }

    /**
     *
     * @param CourseCode
     * @param CourseName
     * @param Cost
     * @param e
     */
    public courses(String CourseCode, String CourseName, double Cost, enrollement e) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.Cost = Cost;
        this.enrollment = e;
    }
    
    /**
     *
     * @param CourseCode
     * @param CourseName
     * @param Cost
     */
    public courses(String CourseCode, String CourseName, double Cost) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.Cost = Cost;
    }

    
    @Override
    public String toString() {
        return "Course{" + "CourseCode=" + CourseCode + ", CourseName=" + CourseName + ", Cost=" + Cost + ", enrollment=" + enrollment + '}';
    }

    
    @Override
    public int compareTo(courses course) {
        int c1 = (int)course.Cost;
        int c2 = (int) this.Cost; 
        
        return c2-c1;
    }
    
    
}
