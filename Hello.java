class Hello {

    public static void main(String[] args) {
        String date = "2003-12-27";

        int year = Integer.parseInt((date.split("-")[0]));
        int month = Integer.parseInt((date.split("-")[1]));
        int day = Integer.parseInt((date.split("-")[2]));
        int totalDay = 0;

        switch(month) {
            case 2:
                totalDay = day + 31;
                break;
            case 3:
                totalDay = day + 31 + 28;
                break;
            case 4:
                totalDay = day + 31 + 28 + 31;
                break;
            case 5:
                totalDay = day + 31 + 28 + 31 + 30;
                break;
            case 6:
                totalDay = day + 31 + 28 + 31 + 30 + 31;
                break;
            case 7:
                totalDay = day + 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 8:
                totalDay = day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                totalDay = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                totalDay = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                totalDay = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                totalDay = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
                break;
        }

        if(year % 400 == 0 && month >= 3) {
            totalDay += 1;
            System.out.println(totalDay);
        }
        else if (year % 4 == 0 && month >= 3) {
            totalDay += 1;
            System.out.println(totalDay);
        }

        System.out.println(totalDay);
    }
}