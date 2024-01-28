public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isRightTriangle;
        isRightTriangle = (a*a + b*b == c*c);
        isRightTriangle = isRightTriangle || (b*b + c*c == a*a);
        isRightTriangle = isRightTriangle || (a*a + c*c == b*b);
        isRightTriangle = isRightTriangle && (a > 0);
        isRightTriangle = isRightTriangle && (b > 0);
        isRightTriangle = isRightTriangle && (c > 0);
        System.out.println(isRightTriangle);
    }
}