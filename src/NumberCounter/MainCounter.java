package NumberCounter;
import java.util.Scanner;

public class MainCounter {
//2,3,4,5,5,9,2,9,8,5,7,3,7,4
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean condicion = true;
        int selector;
        System.out.print("Bienvenid@ al programa para contar apariciones del");
        System.out.println(" mismo número en un vector.");
        while (condicion){
            System.out.println("Puedes elegir que programa quieres ejecutar:");
            System.out.println("1) NumberCounter1");
            System.out.println("0) Salir de la ejecución");
            selector = teclado.nextInt();
            System.out.println("");
            switch (selector) {
                case 1: {
                    int[] v;
                    v = OpVector.InicializaVector();
                    NumberCounter1.NumberCounter1(v);
                    break;
                }
                case 2: {
                    int[] v;
                    v = OpVector.InicializaVector();
                    System.out.println(OpVector.NumeroDistintos(v));
                    OpVector.ImprimeVector(OpVector.VectorDistintos(v));
                    NumberCounter2.NumberCounter2(v);
                    break;
                }
                case 0: condicion = false;
            }
        }
    }
}
