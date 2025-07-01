class Animal{
    static void makesound(){
        System.out.println("Making sound");
    }
}

class Dog extends Animal{
    static void barking(){
        System.out.println("Dog Barking");
    }
}
public class inheritancePractice {
    public static void main(String[] args) {
        Animal.makesound();
        Dog.barking();
    }
}
