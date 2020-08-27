package Javadocs;

public class Demo {
    public static void main(String[] args) {
        Implementation<String> implementasi = new Implementation<>();
        implementasi.call("item");
        System.out.println(implementasi.getItem());
    }
}