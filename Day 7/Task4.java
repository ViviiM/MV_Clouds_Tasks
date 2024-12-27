
class A {
    String name;

    A(String name) {
        this.name = name;
    }

    void displayA() {
        System.out.println("I am A");
    }

}

class B extends A {
    int age;

    B(int age, String name) {
        super(name);
        this.age = age;
    }

    void display() {
        System.out.println("I am B");
    }

}
public class Task4 {
    public static void main(String[] args) {
        B b = new B(19, "Vivek");
        System.out.println(b.age + " " + b.name);
        b.display();
        b.displayA();
    }
}
