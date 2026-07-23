public class BasicMaths {

     static void printDigits(int num){
        //agar mere num=0, toh mai ruk jaunga
        //agar mere num!=0, toh mai processing krta rahunga

        while(num != 0 ){
            int digit = num%10;
            System.out.println(digit);
            //last digit remove
            num = num/10;
        }


    }
//    static void main() {
//        int num = 53127;
//        printDigits(num);
//    }

    //-------------------------------------------------------------

    static int countDigits(int num){
        //agar mere num=0, toh mai ruk jaunga
        //agar mere num!=0, toh mai processing krta rahunga

        int count = 0;
        while(num != 0 ){
            int digit = num%10;
            count++;
            //last digit remove
            num = num/10;
        }
        return count;
    }
//    static void main() {
//        int num = 53127;
//        int ans = countDigits(num);
//        System.out.println(ans);
//    }

    //--------------------------------------------------------------

    static int sumOfDigits(int num){
        //agar mere num=0, toh mai ruk jaunga
        //agar mere num!=0, toh mai processing krta rahunga

        int sum = 0;
        while(num != 0 ){
            int digit = num%10;
            sum = sum + digit;
            //last digit remove
            num = num/10;
        }
        return sum;
    }

//    static void main() {
//        int num = 53127;
//        int sum = sumOfDigits(num);
//        System.out.println(sum);
//    }

    //-------------------------------------------------------------

    static int reverseNum(int num) {
        int revNum = 0;
        //ans = ans * 10 + currentDigit

        while (num != 0){
            int digit = num % 10;
            //reverse num calculate as per formula
            revNum = revNum * 10 + digit;
            //last digit remove krna padega num me se
            num = num/10;
        }
        return revNum;
    }

//    static void main() {
//         int num = 1234;
//         int revNum = reverseNum(num);
//        System.out.println(revNum);
//    }


    //---------------------------------------------------------------

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = reverseNum(num);
        if(originalNum == reversedNum) {
            System.out.println("It is a palindrome");
            return true;
        }
        else {
            System.out.println("It is not a palindrome");
            return false;
        }
    }
//    static void main(){
//         boolean ans = isPalindrome( 1221);
//         System.out.println(ans);
//    }

    //--------------------------------------------------------------

    static boolean isPrimeOrNot(int num){
         for(int i=2; i*i<=num; i++){
             if(num%i  == 0){
                 //not a prime
                 return false;
             }
         }
//         for(int i = 2; i<num-1; i++){
//             if(num%i  == 0){
//                 //not a prime
//                 return false;
//             }
//         }


         //yaha tbhi pohoch paaoge, jab loop se bahar nikloge
        // \or loop se tabhi bahar nikloge jab kabhi bhi reminder me zero naa aaye
        //or agar kabhi reminder 0 nahi aata iska mtlb its a prime number
        return true;
    }
//    static void main(){
//        int num =13;
//        System.out.println(isPrimeOrNot(num));
//    }

    //--------------------------------------------------------------

    static int getGCD(int a, int b){
         //gcd(a,b) = gcd(b, a%b);

        while (b != 0 ){
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
        }
        //jab mera b 0 hoga, tab a ki place pr gcd milega
        int ans = a;
        return ans;
    }
//    static void main(){
//        System.out.println(getGCD(18, 12));
//    }

    //--------------------------------------------------------------

    static int getLCM(int a, int b ){
         int gcd = getGCD(a,b);
         //gcd(18, 12) = 6;
         int prod = a*b;
         //prod(a, b) -> 216
         int lcm = prod/gcd;
         //216/6
        return lcm;
    }
//    static void main(){
//        System.out.println(getLCM(18, 12));
//    }


    //--------------------------------------------------------------
    static  boolean isArmStrongNumber(int num){
         int sum = 0;
         int originalNum = num;

         while(num!=0){
             int digit = num%10;
             int cubeOfDigit = digit*digit*digit;
             sum = sum + cubeOfDigit;
             //digit remove form num
             num = num / 10;
         }
         if(sum == originalNum){
             return true;
         }
         else {
             return false;
         }
    }
//    static void main(){
//        System.out.println(isArmStrongNumber(157));
//    }

    //---------------------------------------------------------------
    static boolean checkPerfectNumber(int num){
         int sum = 1;

         for(int i=2; i*i<=num; i++){
             if(num % i == 0){
                 //i ne num ko perfectly divide kr diya h
                 //toh ab factor pair kya banega
                 //1st factor -> i
                 //2nd factor -> num/i
                 int firstFactor = i;
                 int secondFactor = num/i;
                 sum = sum + firstFactor + secondFactor;
             }
         }
         if(sum == num){
             return true;
         }
         else{
             return false;
         }
    }

//    static void main(){
//        System.out.println(checkPerfectNumber(6));
//    }


    //---------------------------------------------------------
    static void printAllPrimes(int n){
         //print all prime number from 1 to N
        //1 is not a prime number
        for(int num=2; num<=n; num++){
            boolean isPrime = isPrimeOrNot(num);
            if(isPrime == true){
                System.out.println(num);
            }
        }

        //check whether a number is prime or not
//        int num = 5;
//        for(int i = 2; i*i<=num; i++){
//            if(num%i==0){
//                return false;
//            }
//        }
//        return true;
    }
    static void main(){
         printAllPrimes(100);
    }

}
