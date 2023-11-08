package practice_rewrite_week8;

//Java program to overload constructors
public class Prog25_ConstructorOverloading {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Prog25_ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Prog25_ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Prog25_ConstructorOverloading s1 = new Prog25_ConstructorOverloading(111, "Karan");
        Prog25_ConstructorOverloading s2 = new Prog25_ConstructorOverloading(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
