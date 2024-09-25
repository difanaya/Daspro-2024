package minggu5;
import java.util.Scanner;
public class PemilihanHari10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;

        System.out.print("Input day name: ");
        dayName = sc.nextLine();

        //int, char, string yang dapat dipakai switch case (yang bernilai diskrit)
        //if else bisa dipakai di kasus apapun
        //switch (kondisi)

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }

        System.out.println(dayName + " is a " + dayType);

        sc.close();

}
}