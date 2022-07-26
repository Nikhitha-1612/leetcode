class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        char a=suits[0];
        int count=0;
        for(int i=1;i<suits.length;i++){
            if(suits[i]==a){
                count++;
            }
        }
        if(count==suits.length-1)
            return "Flush";
        else{
        for(int i=0;i<ranks.length;i++){
            if(hp.containsKey(ranks[i])){
                hp.put(ranks[i],hp.get(ranks[i])+1);
            }
            else{
                hp.put(ranks[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> enter : hp.entrySet()){
            int num =enter.getValue().intValue();
            list.add(num);
          }
        }
        Collections.sort(list);
        if(list.get(list.size()-1)>=3){
            return "Three of a Kind";
        }
        else if(list.get(list.size()-1)==2){
            return "Pair";
        }
        return "High Card";
    }
}
