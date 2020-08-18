import java.util.Scanner;
public class MatriksScan {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah element array pada kube-array Matriks:");
        n = input.nextInt();
        int matriks_Satu[][] = new int[n][n];
        int matriks_Dua[][] = new int[n][n];
        int total_Matriks[][] = new int[n][n];
        for (int i=0; i<total_Matriks.length; i++){
            System.out.println("Masukan nilai array pada Matriks Satu dan Dua baris ke: " + i );
            for (int j=0; j<total_Matriks.length; j++){
                System.out.println("Matriks-1 Kolom ke-" + j);
                matriks_Satu[i][j] = input.nextInt();
                System.out.println("Matriks-2 Kolom ke-" + j);
                matriks_Dua[i][j] = input.nextInt();
                total_Matriks[i][j] = matriks_Satu[i][j] + matriks_Dua[i][j];
            }
            System.out.println();
        }
        
        System.out.println("Jumlah total matriks aadalah : ");

        for(int i=0; i<total_Matriks.length; i++){
            for(int j=0; j<total_Matriks.length; j++){
                

                System.out.print("   " +total_Matriks[i][j] + "   ");
            }
            System.out.println();
            System.out.println();
        }

    }
    
}