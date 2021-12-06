package factorypattern;

/**
 * @author ÖZGE
 */
public interface ICevir {
    void Ceviri();
}


class Python implements ICevir {  
    private String tur;
    public Python(String tur){
        this.tur=tur;
    }
    @Override
    public void Ceviri() {
        System.out.println("Metin Python diline çevrildi");
    }
}


class Java implements ICevir{
    private String tur;
    public Java(String tur){
        this.tur=tur;
    }
    @Override
    public void Ceviri() {
        System.out.println("Metin Java diline çevrildi");
    } 
}


class MATLAB implements ICevir{    
    private String tur;
    public MATLAB(String tur){
        this.tur=tur;
    }
    @Override
    public void Ceviri() {
        System.out.println("Metin MATLAB diline çevrildi");
    } 
}