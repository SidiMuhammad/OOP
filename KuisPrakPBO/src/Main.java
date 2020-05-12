import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanInput = new Scanner(System.in);
        
        int menu;
        String balik;
        do{
            System.out.println("FORM PENDAFTARAN");
            System.out.println("1. Asisten Laboratorium");
            System.out.println("2. Admin Laboratorium");
            System.out.print("Pilih : ");
            menu = scanInput.nextInt();
            if (menu==1){
                do{  
                    FormAsistLab aslab = new FormAsistLab();
                    aslab.FormAsistLab();
                    System.out.print("Kembali ke menu utama (y/n) : ");
                    scanInput.nextLine();
                    balik = scanInput.nextLine();
                    System.out.println("");
                } while (!balik.equals("y"));
            }
            if (menu==2){
                do{
                    FormAdminLab admin = new FormAdminLab();
                    admin.FormAdminLab();
                    System.out.print("Kembali ke menu utama (y/n) : ");
                    scanInput.nextLine();
                    balik = scanInput.nextLine();
                    System.out.println("");
                } while (!balik.equals("y"));
            }
        } while (menu==1 || menu==2);
    }
}
