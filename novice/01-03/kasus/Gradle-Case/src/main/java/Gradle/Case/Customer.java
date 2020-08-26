package Gradle.Case;

public class Customer {
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