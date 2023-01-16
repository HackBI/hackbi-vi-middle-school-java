/* 
   Write your Name
*/

import java.util.Scanner; //allows user unput 

public class Hello {

   public static void main(String[]args) {
      //System.out.print("Hello World"); // this will print out Hello World
      
      //String name = "Your Name";
      //System.out.println(name);
      
      //int num = 78;
      //System.out.print(num);
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your Birthday:");
      String myBirthday = input.nextLine();
      System.out.println("My birthday is: " + myBirthday);
      
   }
}