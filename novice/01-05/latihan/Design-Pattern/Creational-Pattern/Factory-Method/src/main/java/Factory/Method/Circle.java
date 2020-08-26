package Factory.Method;

public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("ini adalah Circle anak dari Shape");
    }
}