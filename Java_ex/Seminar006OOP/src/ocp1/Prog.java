package ocp1;

import java.util.ArrayList;
import java.util.List;

public class Prog {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));

        CalcAreaService calcAreaService = new CalcAreaService(shapes);
        calcAreaService.processAll();

    }
}
