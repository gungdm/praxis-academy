import java.lang.annotation.*;

@interface MyAnnotation{
    String name() default "agung";
    int id() default 007;
}


public class JavaAnnotationDemo {
    @MyAnnotation(name = "dwi", id = 001)
    public void codingan1(){
        System.out.println("Testing !!!");
    }

    @MyAnnotation(name = "gung", id = 003)
    public void codingan2(){
        System.out.println("Testing 2");
    }

    public static void main(String[] args) {
        new JavaAnnotationDemo().codingan1();
        new JavaAnnotationDemo().codingan2();
    }
}