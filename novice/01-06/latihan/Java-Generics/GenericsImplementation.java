public class GenericsImplementation {
    public static void main(String[] args) {
        Implementation<String> implementasi = new Implementation<>();
        implementasi.call("item");
        System.out.println(implementasi.getItem());
    }
}

class Implementation<T>{
    T item;
    public void call(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
}