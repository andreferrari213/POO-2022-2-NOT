import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        new App();


        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor de x e y");

        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int resultado = 0;
        try {
            resultado = x / y; // se y for zero, vai ocorrer erro
        } catch (ArithmeticException e){
            System.out.println("Erro tratado: "+e.getMessage());
        } finally {
            teclado.close();
        }

        System.out.println("Resultado: "+resultado);

    }

    public App(){
        Pessoa p  = new Pessoa();

        try {
            p.setCpf(null);
        } catch (IllegalArgumentException e ){
            System.out.println("Erro de criacao de objeto: "+e.getMessage());
        }
    }
}
