import java.util.Date;


public class Hotel implements Bayar{

    String nama_Hotel;
    int no_Kamar;
    String bintang;
    int harga_Sewa;
    String date;
    boolean daftar;

    public Hotel() {
    }

    public Hotel(String nama_Hotel, String bintang){
        this.nama_Hotel = nama_Hotel;
        this.bintang = bintang;
    }
    public void resepsionist(String nama_ResepsionString){
        new Resepsionist(nama_ResepsionString); 
    }

    public void setNoKamar(int no_Kamar){
        this.no_Kamar = no_Kamar;
    }

    public int getNoKamar(){
        return no_Kamar;
    }
    public String getDate(){
        return new Date().toString();
    }
    public void Ledger(){
        daftar = true;
        System.out.println(new Customer().getName() + "id: " + new Customer().getId() + "no.Kamar:  " + getNoKamar());
        System.out.println(getDate());
    }

    @Override
    public void isCheckIN(){
        if (daftar == true){
            System.out.println("CheckIN pada: " + getDate());
        }
    }

    @Override
    public void isCheckOUT(){
        if (daftar == false){
            System.out.println("CheckIN pada: " + getDate());
        }
        
    }

    @Override
    public void isBayar(){
        this.daftar = true;
    }

    public void checkIn(){
        System.out.println();
    }
    
    public void chekcOut(){
        System.out.println();
    }
}