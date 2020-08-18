public class JavaExpression {
    public static void main(final String[] args) {
        int cobaInt = 90;
        int cobaINT = 90;
        double cobaDouble = 90;

        char cobaCHAR= 'A';
        String cobaString= "A";

        // if(cobaCHAR == cobaString){
        //     System.out.println("java ekspression mengembalikan value walau berbeda tipe data (CHAR dan STRING)");
        // }
        // else{
        //     System.out.println("java ekspression mengembalikan value dan tipe data harus sama");
        // } --->> hasilnya error yang berarti java Ekspression hanya bisa menggunakan tipe data yang sama dalam menggunakan eksprssion

        if (cobaInt == cobaDouble){
            System.out.println("java ekspression mengembalikan value dengan tipe data yang berbeda (Doubel dan INT)");
        }
        else{
            System.out.println("java ekspression mengembalikan value tipe data harus sama");
        }



        //untuk melihat kembalian nilai expression dari java
        if (cobaINT == cobaInt){
            System.out.println("java Ekspression mengembalikan value bukan ADRESSS HASH");
        }
        else{
            System.out.println("Java mengembalikan nilai score");
        }


        
    }
}


//  DENGAN DEMIKIAN PADA JAVA EKSPRESSION,, TIPE DATA INT, DOUBLE MEMBERIKAN VALUE SEDANKAN UNTUK TIPE DATA STRING DAN
// CHAR JAVA EKSPRESSION BERUPA ADDRESS HASH BUKAN VALUE,, JADI
// INT == INT --> BENAR/
// INT == DOUBLE --> BENAR
// CHAR == STRING --> EROR...
