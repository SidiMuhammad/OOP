package bangundimensi;
import java.util.Scanner;

public class BangunDimensi {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        int pilih;
        int pilih2;
        int pilih3;
        int sisi;
        int tinggi;
        int jari;
        
        do {
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            System.out.print("Pilih : ");
            pilih = scanInput.nextInt();
            if (pilih==1) {
                System.out.println("1. Dua Dimensi (Persegi)");
                System.out.println("2. Tiga Dimensi (Kubus & Limas Persegi)");
                System.out.print("Pilih : ");
                pilih2 = scanInput.nextInt();
                if (pilih2==1) {
                    System.out.print("Sisi Persegi : ");
                    sisi = scanInput.nextInt();
                    Persegi P = new Persegi(sisi);
                    P.luas();
                    P.keliling();
                }
                if (pilih2==2) {
                    System.out.println("1. Kubus");
                    System.out.println("2. Limas Persegi");
                    System.out.print("Pilih : ");
                    pilih3 = scanInput.nextInt();
                    if (pilih3==1) {
                        System.out.print("Sisi Kubus : ");
                        sisi = scanInput.nextInt();
                        Kubus K = new Kubus(sisi);
                        K.volume();
                        K.luasp();
                    }
                    if (pilih3==2) {
                        System.out.print("Sisi Limas Persegi : ");
                        sisi = scanInput.nextInt();
                        System.out.print("Tinggi Limas Persegi : ");
                        tinggi = scanInput.nextInt();
                        LimasPersegi LP = new LimasPersegi(sisi,tinggi);
                        LP.volume();
                        LP.luasp();
                    }
                }
            }
            if (pilih==2) {
                System.out.println("1. Dua Dimensi (Lingkaran)");
                System.out.println("2. Tiga Dimensi (Tabung & Kerucut)");
                System.out.print("Pilih : ");
                pilih2 = scanInput.nextInt();
                if (pilih2==1) {
                    System.out.print("Jari-jari Lingkaran : ");
                    jari = scanInput.nextInt();
                    Lingkaran L = new Lingkaran(jari);
                    L.luas();
                    L.keliling();
                }
                if (pilih2==2) {
                    System.out.println("1. Tabung");
                    System.out.println("2. Kerucut");
                    System.out.print("Pilih : ");
                    pilih3 = scanInput.nextInt();
                    if (pilih3==1) {
                        System.out.print("Jari-jari Tabung : ");
                        jari = scanInput.nextInt();
                        System.out.print("Tinggi Tabung : ");
                        tinggi = scanInput.nextInt();
                        Tabung T = new Tabung(jari,tinggi);
                        T.volume();
                        T.luasp();
                    }
                    if (pilih3==2) {
                        System.out.print("Jari-jari Kerucut : ");
                        jari = scanInput.nextInt();
                        System.out.print("Tinggi Kerucut : ");
                        tinggi = scanInput.nextInt();
                        Kerucut K = new Kerucut(jari,tinggi);
                        K.volume();
                        K.luasp();
                    }
                }
            }
            if (pilih==3) {
                System.out.println("1. Dua Dimensi (Segitiga)");
                System.out.println("2. Tiga Dimensi (Prisma Segitiga & Limas Segitiga)");
                System.out.print("Pilih : ");
                pilih2 = scanInput.nextInt();
                if (pilih2==1) {
                    System.out.print("Sisi Segitiga : ");
                    sisi = scanInput.nextInt();
                    Segitiga S = new Segitiga(sisi);
                    S.luas();
                    S.keliling();
                }
                if (pilih2==2) {
                    System.out.println("1. Prisma Segitiga");
                    System.out.println("2. Limas Segitiga");
                    System.out.print("Pilih : ");
                    pilih3 = scanInput.nextInt();
                    if (pilih3==1) {
                        System.out.print("Sisi Prisma Segitiga : ");
                        sisi = scanInput.nextInt();
                        System.out.print("Tinggi Prisma Segitiga : ");
                        tinggi = scanInput.nextInt();
                        PrismaSegitiga PS = new PrismaSegitiga(sisi,tinggi);
                        PS.volume();
                        PS.luasp();
                    }
                    if (pilih3==2) {
                        System.out.print("Sisi Limas Segitiga : ");
                        sisi = scanInput.nextInt();
                        System.out.print("Tinggi Limas Segitiga : ");
                        tinggi = scanInput.nextInt();
                        LimasSegitiga LS = new LimasSegitiga(sisi,tinggi);
                        LS.volume();
                        LS.luasp();
                    }
                }
            }
        } while (pilih==1 || pilih==2 || pilih==3);
    }
    
}
