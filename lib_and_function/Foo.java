public class Foo {
    public static void main(String[] args) {
        String example = "abcdabcdeabcd";
        String s = example.substring(1, 4);
        String t = example.substring(5, 8);
        System.out.println(s);
        System.out.println(t);
        System.out.println(s.equals(t));
        System.out.println(s==t);
        System.out.println(s.length()==t.length());
    }
}

