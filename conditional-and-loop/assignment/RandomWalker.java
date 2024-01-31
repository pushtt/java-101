public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int step = 0;
        while (Math.abs(x) + Math.abs(y) != r) {
            step += 1;
            if (Math.random() < 0.25) x += 1;
            else if (Math.random() < 0.50) x -= 1;
            else if (Math.random() < 0.75) y += 1;
            else if (Math.random() < 1.0) y -= 1;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.print("steps = " + step);
    }
}
