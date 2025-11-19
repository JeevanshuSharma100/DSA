class Solution {
    public int gdc(int a,int b){
        while(b !=0){
            int temp = a%b;
            a=b;
            b = temp;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
      
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gdclargest = gdc(str1.length(),str2.length());
        return str1.substring(0,gdclargest);

    }
}