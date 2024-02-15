public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] n = new int[args.length]; // n arguments after m + 0
        int sum = 0;
        int[] rand = new int[m];
        int[] cumsum = new int[args.length];


        // Store arguments to the arrays
        for (int i = 1; i < n.length; i++) {
             n[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            cumsum[i] = sum;
        }

        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random()*cumsum[cumsum.length - 1]);
            for (int j = 1; j < cumsum.length; j++) {
                if (r >= cumsum[j - 1] && r < cumsum[j])
                    rand[i] = j;
            }
        }
        for (int i = 0; i < rand.length; i++) {
            System.out.print(rand[i] + " ");
        }
    }
}
