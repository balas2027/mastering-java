
//Problem Statement

//You are given:

//A string A containing digits and one unknown character 'X'

//A string B containing digits and one unknown character 'Y'

// An integer total

// Replace 'X' and 'Y' with digits from 0 to 9 such that:

// Integer value of A + Integer value of B = total


// Return the digits that replace X and Y.

// If multiple solutions exist, return any one.
// If no solution exists, return -1.

// Example
// Input:
// A = "2X"
// B = "Y5"
// total = 45

// Output:
// X = 0
// Y = 2

// Explanation:
// 20 + 25 = 45



  
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String a = sc.nextLine();
        System.out.println("Enter the second number");
        String b = sc.nextLine();
        System.out.println("Enter the total");
        int total = sc.nextInt();
        String values = "0123456789";
        
        for(int i = 0; i < values.length() ;i++)
        {
            boolean bool = false;
            for(int j = 0; j < values.length();j++)
            {
                String aa = a.replace('X',values.charAt(i));
                String bb = b.replace('Y',values.charAt(j));
                System.out.println(aa +" "+bb);
                if(total == (Integer.parseInt(aa) + Integer.parseInt(bb)))
                {
                    System.out.println(values.charAt(i) +" "+values.charAt(j));
                    bool = true;
                    break;
                }
            }
            if(bool)
            {
                break;
            }
        }
        
    }
}
