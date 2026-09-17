import java.util.Scanner;

public class monthswitch56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to month mapping");
        System.out.println("please enter your month number");
        int monthNum = input.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("your month name is: " + monthName);
    }

    public static String getMonthName(int monthNum){
        String monthName = switch (monthNum){
            case 1 -> "janaury";
            case 2 -> "fabraury";
            case 3 -> "march";
            case 4 -> "april";
            case 5 -> "may";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "august";
            case 9 -> "september";
            case 10-> "october";
            case 11 -> "novmber";
            case 12 -> "december";
            default -> "mars month";
        };
        return monthName;
    }
}
