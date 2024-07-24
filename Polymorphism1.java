class Student{
    String name;
    int age;

    public void StudentInfo1(String name){
        System.out.println(name);
    }
    public void StudentInfo1(int age){
        System.out.println(age);
    }
    public void StudentInfo1( String name, int age){
        System.out.println( name +" "+ age);
    }



}
public class Polymorphism1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "sonu";
        s1.age = 25;
        s1.StudentInfo1(s1.name, s1.age);
    }
}
