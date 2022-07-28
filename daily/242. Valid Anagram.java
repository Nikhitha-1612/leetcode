class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
      HashMap<Character,Integer> hm2=new HashMap<Character,Integer>();
       char input[]=s.toCharArray();
       char input2[]=t.toCharArray();
        for(char ch:input){
            if(hm.containsKey(ch))
                hm.put(ch,hm.get(ch)+1);
            else
                hm.put(ch,1);
        }
        for(char ch2:input2){
            if(hm2.containsKey(ch2))
                hm2.put(ch2,hm2.get(ch2)+1);
            else
                hm2.put(ch2,1);
        }
        return hm.equals(hm2);
    }
}
