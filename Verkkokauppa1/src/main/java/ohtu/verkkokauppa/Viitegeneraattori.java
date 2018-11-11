package ohtu.verkkokauppa;

public class Viitegeneraattori implements ViitegeneraattoriIO {
    
    private int seuraava;
    
    private Viitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
