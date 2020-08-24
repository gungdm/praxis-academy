import java.util.Date;

public class MainOOP {
        private static Customer user = new Member(null, 0);

        public static void main(String[] args) {
        System.out.println("fsad");

        Hotel hotel = new Hotel("Marriot", "Lima");
        hotel.resepsionist("Indah");

        user.setName("Agung");
        user.setId(007);
        user.isMember();
        user.setMember("kelas A");

        hotel.Ledger();

    }
}


class Hotel implements Bayar{

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


class Customer {
    String nama;
    int id;
    public Customer(){

    }
    public Customer(String nama,int id) {
        this.nama = nama;
        this.id = id;
    }

    public void setName(String nama){
        this.nama = nama;
    }
    public String getName(){
        return nama;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    //inheritance to Member Class
    public void isMember(){}

    //inheritance to Member Class
    public void setMember(String kelas_Member){}

    // public String getName(){
    //     return kelas_Member;
    // }
    
}


class Member extends Customer {
    String kelas_Member;

    public Member(String nama, int id) {
        super(nama, id);
    }
    public void setKelas(String kelas_Member){
        this.kelas_Member = kelas_Member;
    }
    
    public String getKelas(){
        return kelas_Member;
    }

    @Override
    public void isMember(){
        if (kelas_Member == null){
            System.out.println("Bukan Member, Silahkan mendaftar menjadi member");
        }
    }

    @Override
    public void setMember(String kelas_Member){
        this.kelas_Member = kelas_Member;
    }

    public String getMember(){
        return kelas_Member;
    }
}

interface Bayar {
    void isBayar();
    void isCheckIN();
    void isCheckOUT();
}

interface Booking {
    public void isBooking();
}

class Resepsionist {

    String name;
    public Resepsionist(String name){
        this.name = name;
    }
}