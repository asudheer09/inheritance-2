class Parent{
    int i;
    static{
        System.out.println("Parent : static block");
    }
    {
        System.out.println("Parent : Instance block");
    }

    Parent(int i){
        System.out.println("Parent: Parent(i)");
        this.i=i;
    }
    public void printParentMethod(){
        System.out.println(" Parent: printParentMethod "+i);
    }
}

class Child extends Parent{
    int j;

    static{
        System.out.println("Child : static block");
    }

    {
        System.out.println("Child : Instance block");
    }
    Child(int i,int j) {

        super(i);
        System.out.println("Child: Child(i,j)");

        this.j=j;
    }
    public void printChildMethod(){
        System.out.println(" Child: printChildMethod "+j);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Child c= new Child(10,20);
        c.printChildMethod();
        c.printParentMethod();
    }
}