package model;

public class Student {
    
    //creating object attributes
    private long regno;
    private String name;
    private String course;
    private double marks;


    //building constructor 
    public Student(long regno, String name, String course, double marks){
        this.regno = regno;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    //building all getter function for each variable so they can be accessed from outside the class safely
    public long getRegno(){
        return regno;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public double getMarks(){
        return marks;
    }


    //building all setter function for each variable.
    public void setRegno(long regno){
        this.regno = regno;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }

    //creating method to calc grade of marks 
    public String CalcGrade(double marks){
        
        if (marks>=90)
            return "A+";
        else if (marks>=80)
            return "A";
        else if (marks>=70)
            return "B";
        else if (marks>=60)
            return "C";
        else if (marks>=40)
            return "D";
        else
            return "F";
    }

    //creating method to display all attributes of student
    public void DisplayStudent(){

        System.out.println("Registration No.: " + regno );
        System.out.println("Name: " + name );
        System.out.println("Course: " + course );
        System.out.println("Marks: " + marks );
        System.out.println("Grade: " + CalcGrade(marks));
    }

    
}