import java.sql.SQLSyntaxErrorException;
import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("4");

//        System.out.println(st.pop()); -> 4
//        System.out.println(st.pop()); -> 3
    }
}
