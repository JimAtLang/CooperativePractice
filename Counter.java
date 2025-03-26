public class Counter {
    public int count(String s){
        return 0;
    }

    public int countPart(String s, int n){
        char[] cc = s.toCharArray();
        int count = 0;
        for (int i = 0; i < cc.length; i++) {
            if cc[i] == 'x' {
                    count++;
                }
        }
        return count;
    }
}
