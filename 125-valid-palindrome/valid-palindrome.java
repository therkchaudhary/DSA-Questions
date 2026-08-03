class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();

        //left pointer string k start se chalega
        int left = 0;

        //right pointer string k end se chalega
        int right = n-1;

        //jab tk dono pointer cross nhi karte
        while(left < right){
            // Agar left side ka character letter ya digit nahi hai
            // to usse ignore karke next character par chale jao
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            // Agar right side ka character letter ya digit nahi hai
            // to usse ignore karke previous character par chale jao
             while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            // Dono valid characters ko lowercase me convert karke compare karo
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                // Agar dono equal nahi hain to palindrome nahi hai
                return false;
            }

            // Dono equal hain to andar ki taraf move karo
            left++;
            right--;
        }

        // Agar pura loop khatam ho gaya aur mismatch nahi mila
        // to string palindrome hai
        return true;

    }
}