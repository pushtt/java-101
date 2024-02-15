public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double trials = Double.parseDouble(args[1]);
        double frac = 0;
        double sum = 0;
        int[] t = new int[n+1]; // in the very unlucky day


        for (int i = 0; i < trials; i++) {
            int person = 0;
            boolean[] b = new boolean[n)];
            while (true) {
                person ++;
                int rand = (int) (Math.random() * (n-1));
                if (b[rand] == true) {
                    t[person] ++;
                    //System.out.println(t[person]);
                    break;
                }
                b[rand] = true;
                continue;
            }
        }
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
            frac = sum/trials;
            System.out.print(i + "\t");
            System.out.print(t[i] + "\t");
            System.out.print(frac + "\n");
            if (frac >= 0.5) break;
        }
    }
}

        //while (frac < 0.5) {
        //    for (int i = 0; i < t.length; i++) {
        //        frac = sum/trials;
        //        System.out.print(i+1 + "\t");
        //        System.out.print(t[i] + "\t");
        //        System.out.print(frac + "\n");

        //}


        //}
