// class Solution {
//     public int lengthOfLastWord(String s) {
//         s = s.trim();
//         int lastSpace = s.lastIndexOf(' ');
//         return s.length() - lastSpace - 1;
//     }
// }

class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
    }
}