package ocp1;

import java.util.List;

public class CalcAreaService {
    private List<Shape> shapes;

    public List<Shape> getShapes() {
        return shapes;
    }

    public CalcAreaService(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void processAll() {
        double sumArea = 0;

        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }

        System.out.printf("Сумма площадей равна %f\n", sumArea);
    }
}
