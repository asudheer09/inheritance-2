public class MethodCallExample {
    public void add(int a , int b){
        System.out.println(a+b);
    }
    public float add(int a , float b){
        return a+b;
    }

    public static boolean findResult(){
        return true;
    }

    public static void main(String[] args) {
        MethodCallExample mc= new MethodCallExample();
        mc.add(10,20);//30
        float c=mc.add(10,12.40f);
        System.out.println(c);//22.40
        System.out.println(findResult()); //true


    }
}
