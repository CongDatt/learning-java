public class ReverseString {

    static String myReverse(String str) {
        if(str.length() < 2) {
            return "Opps !";
        }
        StringBuffer myStr = new StringBuffer(str);

        return myStr.reverse()+"";
    }

    static String myReverse2(String str) {
        String result = "";
        char ch;

        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            result = ch + result;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(myReverse("abc"));
        System.out.println(myReverse2("tran cong dat"));
    }
}
