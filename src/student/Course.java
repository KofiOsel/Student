/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Kofi Osel
 */
public class Course {
    
    private String courseName;
    private double credit;
    private double examScore;
    private double assignmentScore;

    public Course() {
        this.courseName = "";
        this.credit = 0;
        this.examScore = 0;
        this.assignmentScore = 0;
    }
    
    public Course(String courseName, double credit) {
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = 0;
        this.assignmentScore = 0;
    }
    
    public Course(String courseName, double credit, double examScore, double assignmentScore) {
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = examScore;
        this.assignmentScore = assignmentScore;
    }
    
    public Course(Course course) {
        this.courseName = course.courseName;
        this.credit = course.credit;
        this.examScore = course.examScore;
        this.assignmentScore = course.assignmentScore;
    }
    
    /**
     * To calculate the final score
     * @return the final score
     */
    public double calcFinalScore() {
        double examPoursentage = 0.60;
        double assignmentPourcentage = 0.40;
        
        return (assignmentScore * assignmentPourcentage)
                + (examScore * examPoursentage);
    }
    
    /**
     * To check if the student passed 
     * @return true if the student passed else return false
     */
    public boolean isPassed() {
        int pass = 60;
        
        if(calcFinalScore() > 60) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean equals(Course course) {
        return this.courseName.equals(course.courseName)
                && this.credit == course.credit
                && this.examScore == course.examScore
                && this.assignmentScore == course.assignmentScore;        
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-17s : %s\n","Course Name",courseName);
        str += String.format("%-17s : %.1f\n","Credit",credit);
        str += String.format("%-17s : %.1f\n","Exam Score",examScore);
        str += String.format("%-17s : %.1f\n","Assignment Score",assignmentScore);
        str += String.format("%-17s : %.1f\n","Final Score", calcFinalScore());
        
        return str;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    public double getAssignmentScore() {
        return assignmentScore;
    }

    public void setAssignmentScore(double assignmentScore) {
        this.assignmentScore = assignmentScore;
    }  
}   

