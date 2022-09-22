class A extends Object{
    public void printA(){
        System.out.println("A: printA");
    }
}

class B extends A{
    public void printB(){
        System.out.println("B: printB");
    }

    public void printA(){
        System.out.println("B: overriden method");
    }
}

public class ObjectCreation {

    public static void main(String[] args) {
        B b= new B();
        b.printB();
        System.out.println("==============");
        b.printA();
        System.out.println("==============");

        A a= new A();
        a.printA();
        System.out.println("==============");
        A a1= new B();
        a1.printA();
    }
}
