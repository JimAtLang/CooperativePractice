public class Counter {
    public int count(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='x'){
                count+=1;
            }
        }
        return count;
    }

    public int countPart(String s, int n){
        char[] cc = s.toCharArray();
        int count = 0;
        for (int i = 0; i < cc.length; i++) {
            if (cc[i] == 'x') {
                    count++;
                }
        }
        return count;
    }
}
