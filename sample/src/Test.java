public class Test {

    public static int a = 10;

    static void m1(){
        System.out.println("from m1");
        a = 5;
    }

    public static void main(String[] args){
        m1();

        Rectangle shape = new Rectangle(3, 4, "smallbox");
        shape.draw();
        double area = shape.area();

        System.out.println("Area is " + area);

        Shape circle = new Circle(4, "circle");
        circle.draw();
        double circleArea = circle.area();

        System.out.println("Are of circle is " + circleArea);

        shape.moveTo(3, 4);

        System.out.println(shape.width);

        // circle.moveTo(shape.width, shape.length);

    }
}
