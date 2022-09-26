import java.util.StringTokenizer;

public class StringTokenizerTest {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("java_full_stack_codes", "_");//using space delimiter
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

