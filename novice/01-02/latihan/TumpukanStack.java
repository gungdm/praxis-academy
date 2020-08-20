import java.util.Stack;

public class TumpukanStack {
    //Stack Tumpukan = new Stack();
    public static void main(String[] args) {
        Stack Tumpukan = new Stack(); // Inisiasi Stack

        //implementasi Stack

        //push()
        if(Tumpukan.empty()) {
            Tumpukan.push(22);
            Tumpukan.push("coba");
            System.out.println(Tumpukan);
        }

        // pop()
        while(!Tumpukan.empty()){
            System.out.println(Tumpukan);
            Tumpukan.pop();
            
        }
    }
}