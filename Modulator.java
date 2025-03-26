public class Modulator {
    public int modulate(String s, int n){
        int remainder=  n % s.length();
        return remainder;
    }
}
