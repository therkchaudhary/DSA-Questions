class Solution {

    public boolean checkInclusion(String s1, String s2) {

        // Agar s1 ki length s2 se badi hai to permutation kabhi nahi mil sakta
        if (s1.length() > s2.length()) {
            return false;
        }

        // s1 ki frequency store karega
        int[] target = new int[26];

        // Current window ki frequency store karega
        int[] window = new int[26];

        // s1 ke har character ki frequency count karo
        for (char ch : s1.toCharArray()) {

            // Character ko index me convert karke frequency badhao
            // 'a' -> 0, 'b' -> 1, .... 'z' -> 25
            target[ch - 'a']++;
        }

        // Sliding Window ki fixed size = s1 ki length
        int windowSize = s1.length();

        // s2 ki first window ki frequency banao
        for (int i = 0; i < windowSize; i++) {
            window[s2.charAt(i) - 'a']++;
        }

        // Agar first window hi permutation hai to answer mil gaya
        if (matches(target, window)) {
            return true;
        }

        // Ab window ko ek-ek step slide karenge
        for (int right = windowSize; right < s2.length(); right++) {

            // Naya character window me enter hua
            window[s2.charAt(right) - 'a']++;

            // Jo character window se bahar gaya uski frequency ghata do
            window[s2.charAt(right - windowSize) - 'a']--;

            // Har slide ke baad check karo frequency match hui ya nahi
            if (matches(target, window)) {
                return true;
            }
        }

        // Puri string check kar li, permutation nahi mila
        return false;
    }

    // Dono frequency arrays compare karega
    private boolean matches(int[] target, int[] window) {

        // Sabhi 26 letters compare karo
        for (int i = 0; i < 26; i++) {

            // Agar kisi bhi letter ki frequency alag hui
            // To permutation nahi hai
            if (target[i] != window[i]) {
                return false;
            }
        }

        // Sab frequencies same hain
        // Matlab permutation mil gaya
        return true;
    }
}