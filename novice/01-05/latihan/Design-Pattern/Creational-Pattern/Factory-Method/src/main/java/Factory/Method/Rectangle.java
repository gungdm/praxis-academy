package Factory.Method;

public class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("ini adalah Rectangle anak dari Shape");
    }
}