package bangundimensi;

public class PrismaSegitiga extends Segitiga{
    int tinggi;
    
    public PrismaSegitiga(int sisi,int tinggi){
        super(sisi);
        this.tinggi=tinggi;
    }
    
    public void volume(){
        System.out.println("Volume : "+(Math.pow(sisi,2)/4*Math.sqrt(3)*tinggi));
    }
    
    public void luasp(){
        System.out.println("Luas permukaan : "+((Math.pow(sisi,2)/2*Math.sqrt(3))+(3*sisi*tinggi)));
    } 
}