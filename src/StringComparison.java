public class StringComparison {
    public static void main(String[] args) {
        String s1="hello"; //SCP
        String s2="hello"; //SCP
        String s3="Hello";//SCP

        //System.out.println(s1.equals(s2));//true
       // System.out.println(s2.equals(s3));//false

       // In java we can create Strings in 2 ways
        //1. using literal  String s1="hello";
        //2. using new operator String s3= new String("HELLO");

        String s4= new String("hello");//heap
        String s5= new String("hello");//heap

       // System.out.println(s1.equals(s4)); //true
        int a=10,b=10;
       // System.out.println(a==b);//true
        //System.out.println(s1==s4);//false

        System.out.println(s1==s2);//true

        System.out.println(s4==s5);//false
    }
}
