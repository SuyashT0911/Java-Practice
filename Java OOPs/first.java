class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
        
        // this.color = "Blue";
        // this.type = "Gel";
    }
    
    public void clr(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){
        System.out.println("Contructor Called");

        this.name = s2.name;
        this.age = s2.age;
    }

    public Student() {
    }

    
}
public class first {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Suyash";
        s1.age = 21;

        
        Student s2 = new Student(s1);
        s2.printInfo();

        // Pen p1 = new Pen();
        // p1.color = "Blue";
        // p1.type = "Gel";

        // Pen p2 = new Pen();
        // p2.color = "Black";
        // p2.type = "Ballpoint";

        // p1.clr();
        // p2.clr();
    }
}
