public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int n_pow2 = (int) Math.pow(n, 2);
        int[] t = new int[n_pow2];
        for (int i = 1; i <= n_pow2/2;){
            for (int j = 0; j < i; j++) {
                if (t[i+j] == t[j])
                    t[i+j] = 1;
            }
            i *= 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = n*i; j < n*(i+1); j++) {
                if (t[j] == 0)
                    System.out.print("+  ");
                else
                    System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
