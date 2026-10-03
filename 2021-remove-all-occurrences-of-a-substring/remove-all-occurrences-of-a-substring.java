class Solution {
    public String removeOccurrences(String s, String part) {
        //kab tak same 2 steps krenge
        //jab tk part exist krta h s string me 

        while(s.contains(part)){
            //search part inside s
            int index = s.indexOf(part);

            //create a new string by merging the left and right part of dound substring inside s string
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
        
    }
}