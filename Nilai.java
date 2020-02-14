import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        
        Scanner scanInput = new Scanner(System.in);
        String nama = null;
        System.out.print("Nama : ");
        nama = scanInput.nextLine();
        int jumlah;
        System.out.print("Jumlah Nilai : ");
        jumlah = scanInput.nextInt();
        int nilai[] = new int[jumlah];
        int total = 0;
        int max = 0;
        int min = 1000;
        for (int a=0; a<jumlah; a++) {
            System.out.print("Nilai ke " + (a+1) + " : ");
            nilai[a] = scanInput.nextInt();
            total = total + nilai[a];
            if (nilai[a] > max)
                max = nilai[a];
            if (nilai[a] < min)
                min = nilai[a];
        }
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Nilai Terendah : " + min);
        System.out.println("Rata-rata Nilai : " + total/jumlah);
    }
}
