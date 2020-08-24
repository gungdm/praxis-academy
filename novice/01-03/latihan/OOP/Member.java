public class Member extends Customer {
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