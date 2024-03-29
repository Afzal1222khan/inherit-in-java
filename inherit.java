// Parent class
class Parent {
    void display() {
        System.out.println("This is the Parent class");
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    void show() {
        System.out.println("This is the Child class");
    }
}

// inherit class
public class inherit {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Method from Parent class
        obj.show();    // Method from Child class
    }
}
