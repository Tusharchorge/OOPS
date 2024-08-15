class A{
    void ShowA(){
        System.out.println("A method");
    }
}
class B extends A{
    void ShowB(){
        System.out.println("B method");
    }
    public static void main(String[] args) {
        B b=new B();
        b.ShowA();
        b.ShowB();
    }
}
// types of inheritance are single,muti-level,multiple,hierarchical,hybrid

// muilti-level

class Animal extends Object{
    void eat(){
        System.out.println("I am Eating");
    }
}
class Dog extends Animal {
    void eatA(){
        System.out.println("I am Eating A");
    }
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.eatA();
    }

}
class Bark extends Dog{
    void eatB(){
        System.out.println("I am Eating B");
    }
    public static void main(String[] args) {
        Bark bark=new Bark();
        bark.eat();
        bark.eatA();
        bark.eatB();

    }
    
}


// Hierarchical Inheritance

class Fruit{
    void cut(){
        System.out.println("I am Cutting");
    }
}
class Apple extends Fruit{
    void cutA(){
        System.out.println("I am Cutting Apple");
    }
    public static void main(String[] args) {
        Apple apple=new Apple();
        apple.cut();
        apple.cutA();
    }

}
class Banana extends Fruit{
    void cutC(){
        System.out.println("I am Cutting Banana");
    }
    public static void main(String[] args) {
        Banana banana=new Banana();
        banana.cut();
        banana.cutC();
    }
}

