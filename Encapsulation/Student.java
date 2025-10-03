package Encapsulation;

public class Student {
    private String name;
    private String course;
    private int rollNumber;

    Student(String name, String course, int rollNumber){
        this.name = name;
        this.course = course;
        this.rollNumber = rollNumber;
    }
    // use setter to make object mutable
    // public void setName(String name){
    //     this.name = name;
    // }
    // public void setCourse(String course){
    //     this.course= course;
    // }
    // public void setRollNumber(int rollNumber){
    //     this.rollNumber = rollNumber;
    // }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public static void main(String[] args) {
        Student st = new Student("Iqbal Ansari", "B.tech", 2241061);
        // Student st = new Student("Iqbal", "B.tech", 2241061);
        Student st1 = new Student("Arman", "BCA", 2241132);

        System.out.println(st.getName());
        System.out.println(st1.getName());

    }
    
}