

public class Concursante{
    private final String nombre;
    private int premioAcumulado;
    public static final int VALOR_BLANCA = 100;
    public static final int VALOR_AZUL = 200;
    
    public Concursante(String nombre){
        this.nombre = nombre;
        this.premioAcumulado = 0;
    }

    public void sumarPremio(int cantidad){

        premioAcumulado += cantidad;

    }

    public void bancarrota(){
        premioAcumulado = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPremioAcumulado() {
        return premioAcumulado;
    }

    
}