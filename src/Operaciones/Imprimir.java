package Operaciones;


public class Imprimir {
       
    public static void Imprime (int x, int y){
        System.out.print("El número " + x + " aparece " + y);
        if (y ==1) {
            System.out.println(" vez");
        }
        else {
            System.out.println(" veces");
        }
    }
}
