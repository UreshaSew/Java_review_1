public class Test2 {
    public static void main(String [] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.age = 12;
        s1.name = "Kamal";
        s2.age = 15;
        s2.name = "Amal";
        System.out.println("Student name is "+ s1.name +" and age is "+s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);

        Employee e1 = new Employee();
        Employee e2 = new Employee();
     e1.insert("a",23,56000);
     e2.insert("s",45,670000);
     e1.display();
     e2.display();

    Puppy p = new Puppy();
    Dog d  = new Dog();
    Cat c = new Cat();
    p.eat();
    p.weep();
    d.bark();
    d.eat();
    c.meow();
    c.eat();
    }
}
 class Student{
     int age ;
     String name ;

 }

 class Employee{
    String name ;
    int age;
    float salary;
    public void insert(String n, int a, float s){
        name =n;
        age = a;
        salary =s;
    }

    void display(){
        System.out.println(name+ "" + age+ ""+ salary);
    }

 }
 class Animal{
     void eat(){System.out.println("eating");}
 }
 class Dog extends Animal{
    void bark(){System.out.println("barking");}}

    class Puppy extends Dog{
        void weep(){System.out.println("weeping");}}


        class Cat extends Animal{
            void meow(){System.out.println("meowing");}
        }


