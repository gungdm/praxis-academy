public class Constants {
    String name;



    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Constants contoh = new Constants();
        contoh.setName("testing");
        System.out.println(contoh.getName());
    
    }
}