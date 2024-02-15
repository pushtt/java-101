public class Sample {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] perm = new int[n];
        // Intitialise perm[].
        for (int j = 0; j < n; j++)
            perm[j] = j; // array from 0 to n
        // Take sample
        for (int i = 0; i < m; i++) {
            int r = i + (int) (Math.random() * (n-i)); // pick a random number for each index
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }
        // print samle
        for (int i = 0; i < m; i++)
            System.out.print(perm[i] + " ");
        System.out.println();
    }
}
