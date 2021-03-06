/*
 *Este NumberCounter ha sido el primero que se me ha ocurrido como solución
 *alternativa a la del HashMap. 
 *En primer lugar se ordena el vector y luego se compara cada número. Si el
 *número comparado es menor al actual valor del vector, se devuelven las
 *apariciones que éste ha tenido.
 */
package NumberCounter;

import Vectores.OpVector;

public class NumberCounter1 {

    public static void NumberCounter1(int[] v) {
        int[] v2 = OpVector.OrdenaVector(v);
        System.out.println("El vector ordenado es:");
        OpVector.ImprimeVector(v2);
        int x = v2[0];
        int y = 0;
        if (v.length > 1) {  
            for (int i = 0; i < v2.length; i++) {
                if (x == v2[i]) {
                    y++;
                } else {
                    System.out.println("El número " + x + " ha aparecido " + y + " veces");
                    x = v2[i];
                    y = 1;
                }
                if (i == v2.length - 1){
                    System.out.println("El número " + x + " ha aparecido " + y + " veces");
                }
            }
        } else if (v.length == 1) {
            System.out.println("El número " + x + " ha aparecido " + 1 + " vez");
        }
    }
}
