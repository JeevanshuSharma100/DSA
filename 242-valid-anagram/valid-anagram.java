class Solution {
    public boolean isAnagram(String s, String t) {

         if(s.length() != t.length()){
            return false;
        }

        int [] frq = new int[26];

        for(int i =0;i<s.length();i++){
            char cc = s.charAt(i);
            int idx = cc - 'a';
            frq[idx]++;

        }
         for(int j =0; j<t.length();j++){
            char cc = t.charAt(j);
            int id = cc - 'a';
            frq[id]--;
    }
    for(int k = 0;k<frq.length;k++){
        if(frq[k] !=0) return false;
    }
    return true;
}
}