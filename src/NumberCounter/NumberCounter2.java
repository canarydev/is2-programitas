/*
 *Segunda forma que se me ha ocurrido de realizar el NumberCounter sin necesidad
 *de utilizar HashMap.
 *Se trata de contar cuantos números diferentes hay en el vector. Luego, con la
 *ayuda de otro vector que crearemos insertaremos cada uno de los números
 *diferentes encontrados. Por último recorreremos el primer vector tantas veces
 *como números diferentes existan e iremos dando (sin orden alguno) la respuesta.
 */
package NumberCounter;


public class NumberCounter2 {
    public static void NumberCounter2(int[] v1) {
        int [] v2 = OpVector.VectorDistintos(v1);
        int y;
        for (int i = 0; i < v2.length; i++) {
            y = 0;
            for (int j = 0; j < v1.length; j++) {
                if (v2[i] == v1 [j]){
                    y++;
                }
            }
            System.out.println("El número "+ v2[i] + " ha aparecido " + y + " veces");   
        }    
    }
}
