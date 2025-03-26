public class Main {
    public static void main(String[] args){
        new Main();
    }

    public Main(){
        String s = "axbxvccxadx";
        int n = 10000;
        Counter c = new Counter();
        Divider d = new Divider();
        Modulator m = new Modulator();
        Repeater r = new Repeater();
        Combiner cm = new Combiner();

        int count = c.count(s,n);
        int quot = d.divide(s,n);
        int prod = r.repeat(count, quot);
        int rem = m.modulate(s, n);
        int slice = c.count(s,rem);
        int total = cm.combine(rem, slice);
        System.out.println(total);
    }
}
