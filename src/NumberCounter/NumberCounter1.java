/*
*Este NumberCounter ha sido el primero que se me ha ocurrido,
* como solución alternativa a la del HashMap
 */
package NumberCounter;


public class NumberCounter1 {
    public static void NumberCounter1(int[] v) {
        if (v.length > 1){
            int x = v[0];
            int y = 0;
            if (v.length > 1){
                int[] v2= OpVector.OrdenaVector(v);
                OpVector.ImprimeVector(v2);
                for (int i = 0; i < v2.length; i++) {    
                    if (x == v2[i]) y++;
                  else {
                      System.out.println("Está "+ y + " veces repetido el número el número " + x);
                      x = v2[i];
                        y = 1;
                    }
                }
            }
            System.out.println("Está "+ y + " veces repetido el número el número " + x);
        }
        else if (v.length == 1){
            int x = v[0];
            int y = 1;
            System.out.println("Está "+ y + " veces repetido el número el número " + x);
        }
    }
}
