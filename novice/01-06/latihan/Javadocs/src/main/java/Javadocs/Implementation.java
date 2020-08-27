package Javadocs;

public class Implementation<T>{
    T item;
    public void call(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
}