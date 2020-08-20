
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContohHashingMap {
    public static void main(String[] args) {

        // Deklarasi objek HashMap baru
        HashMap nilai = new HashMap();

        // Menambahkan data ke objek
        nilai.put("Andi", 85.2);
        nilai.put("Budi", 100.0);
        nilai.put("Edi", 88.5);
        nilai.put("Fera", 87.20);

        // Mengakses data HaspMap dengan foreach
        Set<Map.Entry> check = nilai.entrySet();

        for (Map.Entry hasil : check) {
            System.out.println(hasil.getKey() + " : " + hasil.getValue());
        }

        System.out.println(nilai.entrySet());
        System.out.println();

    }
}


