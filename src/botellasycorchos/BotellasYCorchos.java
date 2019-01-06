/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botellasycorchos;

/**
 *
 * @author diego
 */
public class BotellasYCorchos {

    public static int[] robot(int[] botellas, int[] corchos) {
        if (botellas.length == corchos.length) {//Comprobación
            int i, j;//para las iteraciones
            int[] out = new int[corchos.length];
            boolean flag;

            for (i = 0; i < botellas.length; i++) {//Recorremos las botellas
                flag = true;
                for (j = 0; j < corchos.length && flag; j++) {//y recorremos los corchos desde el correspondiente, los anteriores ya están ordenados
                    if (botellas[i] == corchos[j]) {
                        out[i] = corchos[j];
                        flag = false;//para dejar de buscar
                    }
                }
            }
            
            return out;
            
        } else {//Si no no hay tantas botellas como corchos algo va mal
            return null;
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] botellas = {4,6,9,2,10,3};
        int[] corchos = {3,9,6,10,4,2};
        int[] corchosOrd = robot(botellas, corchos);
        
        for (int i = 0; i< corchosOrd.length; i++) System.out.print(corchosOrd[i]);
        System.out.println();
    }
    
}
