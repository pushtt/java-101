public class Deck {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"♣", "♠", "♦", "♥"};
        String[] deck = new String[rank.length*suit.length];

        for (int i = 0; i < rank.length; i++)
            for (int j = 0; j < suit.length; j++)
                deck[i + 13*j] = rank[i] + suit[j];

        for (int i = 0; i < deck.length; i++)
            System.out.print(deck[i] + " ");
        
        for (int i = 0; i < 52; i++) {
            int r = i + (int) (Math.random() * (52-i));
            System.out.print(r);
        }

    }
}
