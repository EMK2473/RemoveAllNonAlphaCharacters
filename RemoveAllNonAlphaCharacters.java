package RemoveAllNonAlphaCharacters;

import java.util.Scanner;

public class RemoveAllNonAlphaCharacters {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputString = scnr.nextLine();
      
      for(int i = 0; i < inputString.length(); ++i){
         if(Character.isLetter(inputString.charAt(i))){
            System.out.print(inputString.charAt(i));
         }
      }
      System.out.println();
      scnr.close();
   }
}
