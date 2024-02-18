public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double trials = Double.parseDouble(args[1]);
        int[] birthday_tracker = new int[n+2]; // in the very unlucky day


        for (int i = 0; i < trials; i++) {
            int person = 0;
            boolean[] birthday = new boolean[n+1];
            while (true) {
                person ++;
                int rand_birthday = (int) (Math.random() * (n))+ 1;
                if (birthday[rand_birthday] == true) {
                    break;
                }
                else birthday[rand_birthday] = true;
            }
            birthday_tracker[person] ++;
        }

        int count = 1;
        double sum = 0;
        double frac = 0;
        while (frac < 0.5) {
            sum += birthday_tracker[count];
            frac = sum/trials;
            System.out.print(count + "\t");
            System.out.print(birthday_tracker[count] + "\t");
            System.out.print(frac + "\n");
            count ++;
        }
    }
}

