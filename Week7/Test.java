public class Test {
    public static void main(String[] args) {
        Shape s = new Rectangle(3, 4, "white");
        System.out.println(s.toString());
        System.out.println("Area = " + s.getArea());

        Shape s1 = new Shape();
        
        /*s = new Triangle(4, 5, "black");
        System.out.println(e.toString());
        System.out.println("Area = " + s.getArea());*/
    }
}