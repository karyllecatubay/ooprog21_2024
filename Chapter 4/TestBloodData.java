import java.util.Scanner;

public class TestBloodData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an instance of BloodData
        BloodData bd = new BloodData();

        // The user inputs blood type and rh factor
        System.out.print("Enter Blood Type: ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh Factor: ");
        String rhFactor = scanner.nextLine();

        // Setting blood type and rh factor
        bd.setBloodType(bloodType);
        bd.setRhFactor(rhFactor);

        //Displays blood info
        bd.displayBloodInfo();

        scanner.close();
    }
}
