import javax.swing.*;

public class Matriz {

    private int[][] matriz;

    private int fila;

    private int columna;

    private int valor;

    public void ordenMatriz(){

        fila = Integer.parseInt(JOptionPane.showInputDialog("Filas: ")); //INGRESO DE FILAS

        columna = Integer.parseInt(JOptionPane.showInputDialog("Columnas: ")); //INGRESO DE COLUMNAS

        matriz = new int[fila][columna];

    }
    public void agregarMatriz(){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                valor = Integer.parseInt(JOptionPane.showInputDialog("Valores: ")); //INGRESO DE LOS VALORES DE LA MATRIZ

                matriz[i][j] = valor;
            }
        }
    }
    public void mostrarMatriz(){
        System.out.println("------ MATRIZ ------");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz[i].length; j++){    //ORDENANDO LOS VALORES DENTRO DE LA MATRIZ
                System.out.print(matriz[i][j]+" "); //MOSTRANDO LA MATRIZ ORDENADA CON LOS VALORES
            }
            System.out.println();
        }
    }
    public void transpuestaMatriz(){
        System.out.println("------ TRANSPUESTA ------");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j< matriz[i].length; j++){ //ORDENANDO LOS VALORES EN LA MATRIZ TRANSPUESTA
                System.out.print(matriz[j][i]+" ");  //MOSTRANDOS LA MATRIZ TRANSPUESTA
            }
            System.out.println();
        }
    }

    public static void main (String[] args){
        Matriz matriz = new Matriz();
        matriz.ordenMatriz();
        matriz.agregarMatriz();
        matriz.mostrarMatriz();
        matriz.transpuestaMatriz();

    }

}