class Solution {
    public int MAXELE(int[]candies){
        int MAX = Integer.MIN_VALUE;
        for(int i =0;i<candies.length;i++){
            if(candies[i]>MAX){
                MAX = candies[i];
            }

        }
          return MAX;

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int b = MAXELE(candies);
        List<Boolean> kidsWithCandies = new ArrayList<>();
        for(int j =0;j<candies.length;j++){
            int newele = extraCandies+candies[j];
            if(newele >= b){
               kidsWithCandies.add(true);
            }
            else{
                kidsWithCandies.add(false);
            }
        }

        return kidsWithCandies;
        
    }
}