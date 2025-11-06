public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;
    
    Student(String name, int age, double gpa){
        this.name = name;
        this.age  = age;
        this.gpa = gpa;
        this.isEnrolled = true ;

    }
public static void main(String[] args) {
    Student student1 = new Student("naitik", 20,8.9);
    Student student2 = new Student("john", 22,9.1);

    System.out.println(student1.name);
    System.out.println(student1.age);
    System.out.println(student1.gpa);
    System.out.println(student1.isEnrolled);

    System.out.println(student2.name);
    System.out.println(student2.age);
    System.out.println(student2.gpa);
    System.out.println(student2.isEnrolled);
}
   

}
