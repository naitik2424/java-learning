class Animal {
    String type = "Animal";

    Animal() {
        System.out.println("Animal Constructor Called");
    }

    void sound() {
        System.out.println("Animals make different sounds");
    }
}

class Dog extends Animal {
    String type = "Dog";

    Dog() {
        super();
        System.out.println("Dog Constructor Called");
    }

    void showType() {
        System.out.println("Parent type: " + super.type);
        System.out.println("Child type: " + type);
    }

    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showType();
        d.sound();
    }
}
