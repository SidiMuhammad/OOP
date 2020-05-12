public class FormAsistLab extends FormLab{
    
    public void FormAsistLab(){
        InputNilai();
        Hasil();
    }
    
    @Override
    public void InputNilai(){
        System.out.print("NIM : ");
        nim = scanInput.nextLine();
        System.out.print("Nama : ");
        nama = scanInput.nextLine();
        do{
            try{
                System.out.print("Nilai Tes Tulis : ");
                tes1 = scanInput.nextInt();
                CekInput(tes1);
                System.out.print("Nilai Tes Praktek Coding : ");
                tes2 = scanInput.nextInt();
                CekInput(tes2);
                System.out.print("Nilai Tes Wawancara : ");
                tes3 = scanInput.nextInt();
                CekInput(tes3);
                System.out.print("Nilai Tes MicroTeaching : ");
                tes4 = scanInput.nextInt();
                CekInput(tes4);
            }
            catch (IllegalArgumentException iae){
                System.out.println("Input nilai antara 0-100 !");
                error = true;
            }
            catch (Exception e){
                System.out.println("Input nilai harus bilangan bulat !");
                scanInput.nextLine();
                error = true;
            }
        } while (error);
    }
    
    @Override
    public void Hasil(){
        super.Hasil();
        System.out.println("Asisten Laboratorium");
        System.out.println("");
    }
}