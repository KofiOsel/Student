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
public class Student  {
    private String name;
    private String gender;
    private String email;
    private Course course1; 
    private Course course2; 
    private Course course3; 
  

    public Student() {
        this.name = null;
        this.gender = null;
        this.email = null;
        this.course1 = new Course("Programming1",3,95,60);
        this.course2 = new Course("Game Programming",2.5,45,0);
        this.course3 = new Course("Intro To Computer Science",2,45,0);
    }
    
    public Student(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = null;
        this.course2 = null;
        this.course3 = null;
    }
    
    public Student(String name, String gender, String email, Course course1,
            Course course2,Course course3) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }
    
    public boolean equals(Student student) {
        return this.name.equals(student.name) &&
        this.gender.equals(student.gender) &&
        this.email.equals(student.email) &&
        this.course1.equals(student.course1) &&
        this.course2.equals(student.course2) &&
        this.course3.equals(student.course3);
    }
    
    /**
     *Checks how many courses the student has passed
     * @return the number of courses
     */
    public int calcPassCourseNum() {
        int num = 0;
        if(this.course1.isPassed() == true){
            num++; 
        }
        if(this.course2.isPassed() == true){
            num++; 
        }
        if(this.course3.isPassed() == true){
            num++;
        }  
        return num;
    }
    
    /**
     * This adds all the credit based on the course you have passed 
     * @return the total credit
     */
    public double CalcTotalCredit() {
        double num = 0;
        
        if(this.course1.calcFinalScore() > 60) {
            num += course1.getCredit();
        }
        if(this.course2.calcFinalScore() > 60) {
            num += course2.getCredit();
        }
        if(this.course3.calcFinalScore() > 60) {
            num += course3.getCredit();
        }
        return num;
    }
    
    /**
     * checks if the email are valid or not
     * @param email this is the email
     * @return true id the email is valid else false
     */
    public boolean isEmailValid(String email) {
        char f = '@';
        String check1 = email.substring(email.charAt('@')+1);
        for (int i = 0; i <= email.length(); i++) {
            char c = check1.charAt(i);
            if (!Character.isLetter(c)){
                return false;
            }
        }
        if (email.length() > 320) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-15s : %s\n","Name" , name);
        str += String.format("%-15s : %s\n","Gender" , gender);
        str += String.format("%-15s : %s\n\n","Email" , email);
        str += String.format("%-17s%-29s%-8s%s\n","Course","Name","Credit","Score");
        str += String.format("%s\n","--------------------------------------"
                + "----------------------");
        str += String.format("%-15s: %-25s %-2s %.1f %-3s %.1f\n","Course1",
                this.course1.getCourseName()," ",this.getCourse1().getCredit()," ",
                this.course1.calcFinalScore());
        str += String.format("%-15s: %-25s %-2s %.1f %-3s %.1f\n","Course2",
                this.course2.getCourseName()," ",this.getCourse2().getCredit()," ",
                this.course2.calcFinalScore());
        str += String.format("%-15s: %-25s %-2s %.1f %-3s %.1f\n","Course3",
                this.course3.getCourseName()," ",this.getCourse3().getCredit()," ",
                this.course3.calcFinalScore());
        str += String.format("%-15s: %d\n","Passed Courses", calcPassCourseNum());
        str += String.format("%-15s: %.1f\n","Total Credits", CalcTotalCredit());
        
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Course getCourse3() {
        return course3;
    }

    public void setCourse3(Course course3) {
        this.course3 = course3;
    }
}

    
    

    
    
    
    
           
            

    
    
    
    



    
    