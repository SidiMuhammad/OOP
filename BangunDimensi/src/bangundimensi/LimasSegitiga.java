package bangundimensi;

public class LimasSegitiga extends Segitiga{
    int tinggi;
    
    public LimasSegitiga(int sisi,int tinggi){
        super(sisi);
        this.tinggi=tinggi;
    }
    
    public void volume(){
        System.out.println("Volume : "+(Math.pow(sisi,2)/12*Math.sqrt(3)*tinggi));
    }
    
    public void luasp(){
        System.out.println("Luas permukaan : "+((Math.pow(sisi,2)/4*Math.sqrt(3))+(3*sisi/2*Math.sqrt(Math.pow(tinggi,2)+Math.pow(sisi/2*Math.sqrt(3),2)))));
    } 
}