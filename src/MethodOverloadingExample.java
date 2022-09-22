class Addition{

    public float add (float a, float b){
        return a+b;
    }

    public int add (int a, int b,int c){
        return a+b+c;
    }

    public int add (int a, int b,int c,int d){
        return a+b+c+d;
    }

    public void printData(){
        System.out.println("hi");
    }
    public boolean checkNumber(int i){
        if(i>18){
            return true;
        }
        return false;
    }

}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Addition addition= new Addition();
       float c =addition.add(10.5f,20.5f); //30
        System.out.println(c);
        addition.printData();
       boolean res= addition.checkNumber('c');
        System.out.println(res);

    }
}
