package bangundimensi;

public class LimasPersegi extends Persegi{
    int tinggi;
    
    public LimasPersegi(int sisi,int tinggi){
        super(sisi);
        this.tinggi=tinggi;
    }
    
    public void volume(){
        System.out.println("Volume Limas Persegi : "+(sisi*sisi*tinggi/3));
    }
    
    public void luasp(){
        System.out.println("Luas permukaan Limas Persegi : "+((sisi*sisi)+(2*sisi*Math.sqrt(Math.pow(tinggi,2)+Math.pow(sisi/2,2)))));
    }
}
