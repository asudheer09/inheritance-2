import java.util.Iterator;
import java.util.StringTokenizer;

public class StringManipulations {

    public static void main(String[] args) {
        String name="java_full_stack_codes";
        String name1="java full stack codes";
        String name2="java-full-stack-codes";

        String[] res=name.split("_");
       /* for (String s:res) {
            System.out.println(" "+s);
        }*/

       /* for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }*/

        StringTokenizer st= new StringTokenizer(name2,"-");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
