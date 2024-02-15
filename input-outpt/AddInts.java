public class AddInts {
	public static void man(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int value = StdIn.readIn();
			sum += value;
		}
		StdOut.println("Sum is ", sum);
		
	}

}
