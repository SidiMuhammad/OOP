import java.util.Scanner;

public class FormLab implements Form{
    Scanner scanInput = new Scanner(System.in);
        
    String nim;
    String nama;
    int tes1;
    int tes2;
    int tes3;
    int tes4;
    boolean error;
        
    public void InputNilai(){
    }
    
    public int NilaiAkhir(){
        return (tes1+tes2+tes3+tes4)/4;
    }
    
    public void Hasil(){
        System.out.println("Nilai Akhir : " + NilaiAkhir());
        if (NilaiAkhir()>85){
            System.out.println("Keterangan : LOLOS");
            System.out.print("Selamat kepada " + nama + " (" + nim + ") telah diterima sebagai ");
        }
        else{
            System.out.println("Keterangan : GAGAL");
            System.out.print("Mohon maaf kepada " + nama + " (" + nim + ") tidak diterima sebagai ");
        }
    }
    
    public void CekInput(int nilai) throws IllegalArgumentException{
        if (nilai<0 || nilai>100){
            throw new IllegalArgumentException ();
        }
    }
}
