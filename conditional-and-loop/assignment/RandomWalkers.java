public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double step = 0.0;
        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            while (Math.abs(x) + Math.abs(y) != r) {
                step += 1;
                double p = Math.random();
                if (p < 0.25) x += 1;
                else if (p < 0.50) x -= 1;
                else if (p < 0.75) y += 1;
                else if (p < 1.00) y -= 1;
            }
        }
        System.out.println("average number of steps = " + step/trials);
    }
}
