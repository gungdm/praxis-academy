import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Serialization {

    // int integer;
    // String name;

    public static void main(String[] args) {
        Implementasi object = new Implementasi(1000, "Rupiah");
        String berkas = "INI CONTOH SERIALISASI";

        //Serialiasasi
        try {
            FileOutputStream files = new FileOutputStream(berkas);
            ObjectOutputStream Keluaran = new ObjectOutputStream(files);

            Keluaran.writeObject(object);
            Keluaran.close();
            files.close();

            System.out.println("Serialization Succeed!");

            
        } catch (Exception ex) {
            //TODO: handle exception
            System.out.println("print " + ex);
        }

        //Deserialisasi

        Implementasi objects = null;

        try {
            FileInputStream files = new FileInputStream(berkas);
            ObjectInputStream Masukan = new ObjectInputStream (files);

            

            objects = (Implementasi)Masukan.readObject();
            Masukan.close();
            files.close();
    

            System.out.println("Deseliazation Succeed!");

            
        } catch (Exception ex) {
            //TODO: handle exception
            System.out.println("print " + ex);
        }
        
    }
}

class Implementasi implements Serializable{
    public int integer;
    public String name;

    public Implementasi(int integer, String name){
        this.name = name;
        this.integer = integer;

    }
}