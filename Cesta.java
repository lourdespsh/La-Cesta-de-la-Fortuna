
import java.util.Random;

public class Cesta{
    private int bolasBlancas = 10;
    private int bolasAzules = 1;
    private int bolasNegras = 1;

    public Cesta (int blancas, int azules, int negras){
        this.bolasBlancas = blancas;
        this.bolasAzules = azules;
        this.bolasNegras = negras;
    }

    public int obtenerTotalBolas(){
        int bolasTotales = this.bolasBlancas + this.bolasAzules + this.bolasBlancas;
        return bolasTotales -1;
    }


    private char extraerBolaBien(){
        Random rand = new Random(42);
        if(obtenerTotalBolas() != 0){
            int tirada = rand.nextInt(obtenerTotalBolas()) + 1;
            if (tirada <= this.bolasBlancas){
                return 'B';
            }
            if (tirada == this.bolasAzules + this.bolasBlancas){
                return 'A';
            }
            if(tirada == obtenerTotalBolas()){
                return 'N';
            }
        }
        return 'V';
    }
    
    public char sacarBola(){
        char color = 'V';
        if(obtenerTotalBolas()>0){
            color = extraerBola(this.bolasBlancas, this.bolasAzules, this.bolasNegras);
            switch (color){
                case 'A' -> {
                    this.bolasAzules--;
                }
                case 'B' -> {
                    this.bolasBlancas--;
                }
                case 'N' -> {
                    this.bolasNegras--;
                }
            }
            
        }
        return color;
    }

    private static char extraerBola(int b, int a, int n){
        Random rand = new Random();
        int totalBolas = b + a + n;
        if (totalBolas == 0) return 'v';

        int tirada = rand.nextInt(totalBolas) + 1;
        if (tirada <=b ){
            return 'B';
        }else if (tirada == b + a) {
            return 'A';
        }else {
            return 'N';
        }
    }

    public int getBolasBlancas() {
        return bolasBlancas;
    }

    public int getBolasAzules() {
        return bolasAzules;
    }

    public int getBolasNegras() {
        return bolasNegras;
    }

    

}
    