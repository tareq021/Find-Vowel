// This programme finds out the position(s) of vowels in a sentence
package findingvowels;

import java.util.Scanner;

public class FindingVowels
  {

    
    public static void main(String[] args)
      {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the sentence: ");
        String str = scan.nextLine();
        
        str = str.toLowerCase();
        
        String[] vowels = {"a","e","i","o","u"}; // if not case sensetive
        
        //String[] vowels = {"a","e","i","o","u","A","E","I","O","U"}; // If case sensetive
        
        for(int i = 0; i < vowels.length;i++)
        {
            findVowel(str, vowels[i]);
            System.out.println("");
        }
        
      }
    
    public static void findVowel(String str, String v)
      {
        
        System.out.print(v + ": "); 
        for(int i = 0; i<str.length(); i++ )
          {
            if(str.indexOf(v,i) != -1 && str.indexOf(v, i) != str.indexOf(v, i+1))
              {
                System.out.print(str.indexOf(v, i)+",");
                System.out.print(" ");
              }
          }
        
      }
    
  }
