import java.util.Scanner;

public class SammysRentalPrice{
   
   public static void main(String[] args){
   
   
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S Sammy's makes it fun in the sun. S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the number of minutes: ");
      int totalMinutes = input.nextInt();

      
      int hours = totalMinutes/ 60;
      int additionalMinutes = totalMinutes % 60;

      int totalPrice = (hours * 40) + additionalMinutes;

      
       System.out.println("Hours: " + hours);
       System.out.println("Additional Minutes: " + additionalMinutes);
       System.out.println("Total Price: $" + totalPrice); 
       
       input.close();     

   }
}
