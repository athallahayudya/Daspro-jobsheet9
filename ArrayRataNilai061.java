package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMahasiswa = new int[10];
        double total = 0;
        double rata2;
        int lulus = 0;

        for(int i = 0; i < nilaiMahasiswa.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMahasiswa[i] = sc.nextInt();
        }

        for(int i = 0; i < nilaiMahasiswa.length; i++){
            total += nilaiMahasiswa[i];
            if(nilaiMahasiswa[i] > 70){
                lulus++;
            }
        }

        rata2 = total/nilaiMahasiswa.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Banyak mahasiswa yang lulus menurut rata-rata nilai = "+lulus++);
    
    }
}