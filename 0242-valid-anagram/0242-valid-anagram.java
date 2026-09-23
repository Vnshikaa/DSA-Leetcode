class Solution { 
    public boolean isAnagram(String s, String t) { 
        HashMap<Character, Integer> map = new HashMap<>(); 
        
        if(s.length() != t.length()) {
            return false;
        }

        for(char num : s.toCharArray()) { 
            int count = map.getOrDefault(num, 0); 
            map.put(num, count + 1); 
        } 
        
        for(char num : t.toCharArray()) { 
            if(!map.containsKey(num) || map.get(num) == 0) { 
                return false; 
            } 
            else { 
                map.put(num, map.get(num) - 1); 
            } 
        } 
 
        return true; 
    } 
}