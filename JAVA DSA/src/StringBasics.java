import java.util.Scanner;

public class StringBasics {

    //----------------Problem-1--------------------------------
    //Print each character of the string
    static void printString(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    //----------------Problem-2--------------------------------
    //count length of string without length()
    static int getLengthOfString(String str){
       char[] arr = str.toCharArray();
       int len = arr.length;
       return len;
    }

    //------------------Problem-3----------------------------------
    //Get vowels count
    static int getVowelsCount(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        return count;
    }


    //--------------------Problem-4--------------------------------
    //Reverse a String
    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    //--------------------Problem-5--------------------------------
    //Check string is a palindrome or not
    static boolean isPalindrone(String str){
        String original = str;
        String reverse = reverseString(original);
        //compare
        for(int i=0; i<original.length(); i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
                if(ch1 != ch2){
                    return false;
                }

        }
        return true;
    }


//***********************************************************************

    static void main(){

        //------------------Problem-5--------------------------

        String str = "NOON";
        System.out.println(isPalindrone(str));

        //------------------Problem-4--------------------------

//        String str = "LOVE";
//        System.out.println(reverseString(str));

        //------------------Problem-3--------------------------

//        String str = "LOVE";
//        System.out.println(getVowelsCount(str));

        //------------------Problem-2--------------------------

//        String str = "Love";
//        System.out.println(getLengthOfString(str));

        //-------------------Problem-1---------------------------

//        String str = "Love";
//        printString(str);

        //---------------------------------------------------------

//        String name = "Babbar";
//        char[] chr = name.toCharArray();
//
//        //print the char array
//        for(char ch: chr){
//            System.out.println("Value of char: " + ch);
//        }

        //---------------------------------------------------------

//        String str = "My Name is Love Babbar";
//        System.out.println(str.substring(3, 7));
//        System.out.println(str.contains("Love"));

        //--------------------------------------------------------

//        String firstName = "Rahul";
//        String lastName = "Chaudhary";
//        System.out.println(firstName + " " + lastName);
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(0));

        //-------------------------------------------------------

//        String name = "Rahul";
//        //name[0] = 'B';
//        name = "Chaudhary";
//        System.out.println(name);

        //---------------------------------------------------------

//        String name1 = "Love";
//        String name2 = "Lover";
//
//        if(name1.equals(name2)){
//            System.out.println("Both strings are equal");
//        }else{
//            System.out.println("Both string are not equal");
//        }

        //----------------------------------------------------------

//        String str  = "Rahul";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        String name = "RAHUL";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));


    }
}
