public class myEnum {
    public static void main(String[] args) {
         enum Days {
            Mon, Tus, Web, Thur ,Fri, Sar, Sun
        }
        enum Friend {
            MAT("Male"),
            JOHN("Male"),
            JANE("Female");

            private final String gender;
            Friend(String gender) {
                this.gender = gender;
            }
            public String getGender() {
                return this.gender;
            }
        }
//        System.out.println(Friend.JANE.getGender());
        String a = "a";
        String aa = new String("a");
        System.out.println(a.getClass());
        System.out.println(aa.hashCode());
    }
}
