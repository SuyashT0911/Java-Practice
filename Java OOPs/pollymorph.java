class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
        
    }
    
    public void clr(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

class Student{
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name +" "+ age);
    }
    
}
public class pollymorph {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Suyash";
        s1.age = 21;

        s1.printInfo(s1.name, s1.age);
    }
}
