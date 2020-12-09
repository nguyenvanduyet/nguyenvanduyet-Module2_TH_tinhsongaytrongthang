import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập tháng:");
        int month=sc.nextInt();
       String daysInMonth= "";
        switch (month){
            case 2:
                daysInMonth="28-29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth="31 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "31 days";
                break;
            default:
                daysInMonth= "k";
        }

        if (!daysInMonth.equals("k") ) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
        }
    }


