class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){
        this.name= "chintu";
        this.age= 23;

    }
Student(){

}


}


public class Constructor_for_student {
public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student(s1);
    s2.studentInfo();
}
}
