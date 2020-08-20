import java.util.Hashtable;
import java.util.Enumeration;

// Hashing adalah suatu metode yang digunakan untuk mengembalikan key dan value pada suatu variabel/konstanta,
// dalam implementasinya hashing biasanya untuk menyimpan nilai pada suatu key tertentu
public class HashTable {
    public static void main(String[] args) {
        Hashtable PemainBola = new Hashtable();
        Enumeration NomorPunggung;
        String check;

        PemainBola.put("CR7", 7);
        PemainBola.put("Messi", 10);
        PemainBola.put("Dybala", 10);
        PemainBola.put("Kaka", 8);

        NomorPunggung = PemainBola.keys();

        while(NomorPunggung.hasMoreElements()){
            // try {
            //     System.out.println(NomorPunggung.nextElement());
            // }
            // catch (Exception e){
            //     System.out.println(e);
            // }
            check = (String)NomorPunggung.nextElement();
            System.out.println(check + " " + PemainBola.get(check));
        }

    }
}