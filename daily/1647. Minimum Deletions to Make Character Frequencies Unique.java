class Solution {
    public int minDeletions(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int deletecount=0;
        HashSet<Integer> seenFrequencies = new HashSet<>();
        for(int i=0;i<26;i++){
            while(freq[i]>0 && seenFrequencies.contains(freq[i])){
                freq[i]--;
                deletecount++;
            }
            seenFrequencies.add(freq[i]);
        }
        return deletecount;
    }
}
