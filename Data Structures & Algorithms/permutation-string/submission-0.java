class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []need = new int [26];
        for(char c: s1.toCharArray()){
            need[c-'a']++;
        }
        int [] window= new int [26];
        int k=s1.length();
        for(int i=0;i<s2.length();i++){
           window[s2.charAt(i)-'a']++; // i=0 c=l 
           if(i>=k){
               window[s2.charAt(i-k)-'a']--;
           }
           if(Arrays.equals(window,need)) return true;
        }
        return false;
    }
}
