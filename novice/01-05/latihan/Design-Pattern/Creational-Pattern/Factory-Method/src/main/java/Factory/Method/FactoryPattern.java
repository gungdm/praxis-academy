package Factory.Method;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("Circle").draw();

        shapeFactory.getShape("Rectangle").draw();

        shapeFactory.getShape("Square").draw();
    }
}