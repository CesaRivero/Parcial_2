public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "red", false);
        Shape s2 = new Circle();
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        Shape s4 = new Square(6.6);

        s2.setFilled(true);
        s2.setColor("blue");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}
