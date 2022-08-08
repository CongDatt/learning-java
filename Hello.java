class Hello {

    public static void main(String[] args) {
        int n = 7;

        while(n >= 10) {
            n = (int) (Math.pow(n%10, 2) + Math.pow(n/10,2)); 
            System.out.println(n);

            // if(n % 100 == 0) {
            //     System.out.println("Happy");
            //     break;
            // }
        }
    }
}