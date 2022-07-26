class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> hm= new HashMap<Character, Integer>();
        char[] c = s.toCharArray();
        for(char ch:c){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
            int count=hm.get(ch);
            if(count==2)
               return  ch;
            }
        return '0';
    }
}
