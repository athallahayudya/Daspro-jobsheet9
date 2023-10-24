package jobsheet9;
import java.util.Scanner;
public class LinearSearch062 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arrayInt = new int [8];
        int key;
        int jmlInput;
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array : ");
        jmlInput = sc.nextInt();

        for (int i = 0; i < jmlInput; i++) {
            System.out.print("Masukkan elemen array ke- " + i + " : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke- " + hasil);
                break;
            } else {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
    }
}