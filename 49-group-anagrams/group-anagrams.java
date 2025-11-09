

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        Map<String, List<String>> map = new HashMap<>();

        
        for (int i = 0; i < strs.length; i++) {
            String a = strs[i];
            int[] frq = new int[26];
            for (int j = 0; j < a.length(); j++) {
                char val = a.charAt(j);
                frq[val - 'a']++;
            }

            String key = "";
            for (int k = 0; k < 26; k++) { // list k liye string bna rha hu jo as a key hai
                key = key + frq[k] + "#";
            }

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(a);
        }

        
        return new ArrayList<>(map.values());
    }
}
