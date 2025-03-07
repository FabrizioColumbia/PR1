package javaapplication;
public class Impresion {
    public static void main(String[] args) {

        // se declara matriz de 0 y 1 para explicar las formas
       
        int[][] matriz = {
            {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0},
            {1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0},
            {1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
            {1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
            {1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
            {1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0},
            {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0},
        };

        // se itera la matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {



                // si el indice de la matriz es 1 se reemplaza por * sino por un espacio

                if (matriz[i][j] == 1) {
                    System.out.print("* ");  

                } else {
                    System.out.print("  ");  
                }



            }

            // se imprime un espacio por vector para simular la matriz 2x2, y si yo escribi esto.

            System.out.println();  
        }
    }
}
