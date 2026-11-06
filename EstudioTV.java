import java.util.Scanner;

public class EstudioTV{
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Como te llamas: ");
        String nombre = scanner.nextLine();

        Concursante concursante = new Concursante(nombre);
        Cesta cesta = new Cesta(10,1,1);
        int opcion = 0;
        boolean plantarse = false;
        boolean bancarrota = false;

        do { 
            imprimirMenu();
            int opcion = leerSeguro();
            switch (opcion){
                case 1 -> {
                    char bola = cesta.sacarBola();


                    switch (bola){
                        case 'B' -> {
                            System.out.println("100 euros, bola blanca");
                            concursante.sumarPremio(concursante.VALOR_BLANCA);
                        }
                        case 'A' -> {
                            concursante.sumarPremio(concursante.VALOR_AZUL);
                        }
                        case 'N' -> {
                            concursante.bancarrota();
                            bancarrota = true;
                        }
                        
                    }
                }
                case 2 -> {
                    plantarse = true;
                    System.out.printf("Enhorabuena %s!\n", nombre);
                    System.out.printf("Has ganado %d euros", concursante.getPremioAcumulado());
                }
                default -> {
                    System.out.println("Opcion no valida: 1 o 2");
                }
            }
        } while (opcion !=2 && !plantarse && !bancarrota);

        private static void imprimirMenu(){
            System.out.println("1. Sacar Bola");
            System.out.println("2. Plantarse");
            System.out.println("¿Que quieres hacer?");
        }

        private static int leerSeguro(){
            Scanner scan = new Scanner(System.in);
            try {
                
            } catch ( Input) {
            }

            return 0;
        }

    }
    
    

    
}