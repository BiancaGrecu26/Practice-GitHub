package java_week_4;

public class EnumDemo {
    Day day;
    public EnumDemo(Day day) {
        this.day = day;
    }
    public void dayIsLike(){
        switch (day){
            case MONDAY:
                System.out.println("Mondays are bad!");
                break;
            case FRIDAY:
                System.out.println("Fridays are better!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best!");
                break;
            default:
                System.out.println("MIdweeks day are so-so");

        }
    }

    public static void main(String[] args) {
        EnumDemo dayOne = new EnumDemo(Day.MONDAY);
        dayOne.dayIsLike();
        EnumDemo dayThree = new EnumDemo(Day.WEDNESDAY);
        dayThree.dayIsLike();
        EnumDemo dayFive = new EnumDemo(Day.FRIDAY);
        dayFive.dayIsLike ();
        EnumDemo daySix = new EnumDemo(Day.SATURDAY);
        daySix.dayIsLike ();
        EnumDemo daySeven = new EnumDemo(Day.SUNDAY);
        daySeven.dayIsLike ();
    }
}
