class Solution {
    public boolean isAnagram(String s, String t) {
     int [] ar= new int[26];
       for(char c: s.toCharArray()){
        ar[c-'a']++;
       }

            for(char c: t.toCharArray()){
        ar[c-'a']--;
       }
       for(int i:ar){
        if(i!=0) return false;
       }
       return true;
    }
}
