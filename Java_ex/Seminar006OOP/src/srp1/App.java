package srp1;


public class App {
    public static void main(String[] args) throws Exception {
        Square square = new Square(new Point(1, 1), 5);

        System.out.printf("Площадь квадрата square = %d единиц\n", square.getArea());
        System.out.println();
        DrawScale drawScale = new DrawScale(square, 1);
        drawScale.setScale(3);
        drawScale.draw();
    }
}
