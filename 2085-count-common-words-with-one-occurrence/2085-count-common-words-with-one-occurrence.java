
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int answer  =0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i< words1.length; i++){
            if(!map.containsKey(words1[i])){
                map.put(words1[i],1);
            } else{
                map.put(words1[i], map.get(words1[i])+1);
            }
        }
        
        for(int i = 0; i< words2.length; i++){
            if(map.containsKey(words2[i])&&map.get(words2[i]) < 2){
                map.put(words2[i], map.get(words2[i]) -1);
            } 
        }
        
        for(String s : map.keySet()){
            if(map.get(s) == 0) answer++;
        }
        
        return answer;
    }
}