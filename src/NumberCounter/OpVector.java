package NumberCounter;

import java.util.Scanner;


public class OpVector {
    private static Scanner teclado = new Scanner(System.in);
    private static int num;
    
    public static int[] InicializaVector (){
        int[] vector;
        System.out.println("Introduce el número de elementos");
        num = teclado.nextInt();
        vector = new int [num];
        vector = ReyenaVector(vector);
        ImprimeVector(vector);
        return vector;
    }
    
    private static int[] ReyenaVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce el elemento [" + i + "]" );
            num = teclado.nextInt();
            vector[i] = num;
        }
        return vector;
    }
    
    public static void ImprimeVector (int[] vector){
        System.out.print("{");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i != vector.length-1)
                System.out.print(",");
        }
        System.out.println("}");
    }
    
    public static int[] OrdenaVector (int[] v1){
        int [] v2 = new int [v1.length];
         v2[0] = v1[0];
         int j;
         for (int i = 1; i < v1.length; i++) {
            j = i;
            if (v2[i-1] <= v1[i]) v2[i] = v1[i];
                                                 
            else {
                while ((j !=0 ) && (v1[i] < v2[j-1])) {
                    v2[j] = v2[j-1];
                    v2[j-1] = v1[i];
                    j--;
                }
            }
         }
         return v2;
    }
    
    
}