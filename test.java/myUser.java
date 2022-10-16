public class myUser implements User {
    /**
     *
     */
    @Override
    public void getName() {

    }

    /**
     * @return
     */
    @Override
    public int getAge() {
        return a;
    }

    /**
     * @return
     */
    @Override
    public String getFullNam() {
        return "Tran Cong Dat";
    }

    public static void main(String[] args) {
        myUser a = new myUser();

        System.out.println(a.getAge());
        System.out.println(a.getFullNam());
    }
}
