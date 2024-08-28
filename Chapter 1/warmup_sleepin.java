public class warmup_sleepin{

   public static boolean sleepln(boolean weekday, boolean vacation){
   
   return! weekday||vacation; 
    
   }

public static void main (String[] args){
     
   System.out.println(sleepln(false, false));
   System.out.println(sleepln(true, false));
   System.out.println(sleepln(false, true));
   
   }
}