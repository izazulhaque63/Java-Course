package method;

public class binomialcoff {
    public static int binomial(int n, int r) {
        int fact_n = n;
        int fact_r = r;
        int nmr = fact_n - fact_r;
        int binomialcoff = fact_n / fact_r * nmr;
        return binomialcoff;
    }
    public static void main(String[] args) {
//        int n = 5;
//        int r = 5;
        System.out.println(binomial(5,2));
    }


}
