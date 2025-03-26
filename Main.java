public class Main {
    public static void main(String[] args){
        new Main();
    }

    public Main(){
        String s = "axbxvccxadx";
        int n = 10000;
        Solver slv = new Solver();
        System.out.println(slv.solve(s, n));
    }
}
