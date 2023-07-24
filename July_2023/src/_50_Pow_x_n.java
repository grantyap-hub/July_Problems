public class _50_Pow_x_n {

    public static double myPow(double x, int n){
        return binaryExp(x, (long) n);
    }

    public static double binaryExp(double x, long n){
        if(n == 0)
            return 1;

        if(n < 0)
            return 1.0 / binaryExp(x, -1*n);

        if(n % 2 == 1)
            return x * binaryExp(x*x, (n-1)/2);
        else
            return binaryExp(x*x, n/2);
    }


    public static void main(String[] args) {
        System.out.println(myPow(2.0,10));

    }
}
