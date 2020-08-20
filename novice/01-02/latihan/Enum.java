import java.util.Enumeration;
import java.util.Vector;


public class Enum{

    public static void main(String[] args) {
        Vector ruang = new Vector();
        Enumeration tigaDimensi;

        for (int i =0; i<3; i++){
            ruang.add(i+1);
        }
        tigaDimensi = ruang.elements();
        System.out.println(ruang); // --> sebagai vektor
        System.out.println(tigaDimensi); // --> Address import-library
        System.out.println(tigaDimensi.hasMoreElements()); // method Enumeration yang mengembalikan boolean dari Enum tersebut

        //-contoh penggunaan method hasMoreElements()
        while(tigaDimensi.hasMoreElements()){
            // implementasi method nextElements() pada Enumeration
            System.out.println(tigaDimensi.nextElement());
        }
    }
}