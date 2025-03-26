public class Solver {
    Counter c = new Counter();
    Divider d = new Divider();
    Modulator m = new Modulator();
    Repeater r = new Repeater();
    Combiner cm = new Combiner();

    public int solve(String s, int n){
        int count = c.count(s);
        int quot = d.divide(s,n);
        int prod = r.repeat(count, quot);
        int rem = m.modulate(s, n);
        int slice = c.countPart(s,rem);
        int total = cm.combine(prod, slice);
        return total;

    }
}
