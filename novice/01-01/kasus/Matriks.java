public class Matriks {
    public static void main(String[] args) {
        int[] cek = {2,5,6};
        int[][] matriks_Satu = {{5,2,4},{4,6,3},{4,5,8}};
        int[][] matriks_Dua = {{8,1,9},{5,6,1},{8,2,4}};
        int[][] total_matriks = new int[3][3];

        for(int i=0; i<total_matriks.length; i++){
            for(int j=0; j<total_matriks.length; j++){
                total_matriks[i][j] = matriks_Satu[i][j] + matriks_Satu[i][j];
                System.out.print("   " +total_matriks[i][j] + "   ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println(total_matriks.length);
        System.out.println(total_matriks);

    }
    
}