public class Switch {

    public static void main(String[] args) {
        int status = 1;
        String Statement;
        switch (status){
            case 1 : Statement = "SINGLE";
                    break;
            case 2 : Statement = "DOUBLE";
                    break;
            default:Statement = "Invalid"; break;
                    
        }
        System.out.println(Statement);
    }
    
}