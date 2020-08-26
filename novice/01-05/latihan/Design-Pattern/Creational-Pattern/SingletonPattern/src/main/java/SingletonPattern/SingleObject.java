package SingletonPattern;

public class SingleObject {
    private SingleObject(){

    }

    private static SingleObject instance = new SingleObject();

    public static SingleObject getInstance(){
        return instance;
    } 

    public void showMessage(){
        System.out.println("ini adalah pesan dari Singleton object");
    }

}