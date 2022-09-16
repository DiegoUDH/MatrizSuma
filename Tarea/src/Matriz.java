import javax.swing.*;

public class Matriz {

    private int matriza[][];
    private int matrizb[][];

    private int fila;

    private int columna;

    private int valores;

    public Matriz()
    {
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de filas de la matriz A"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de columnas de la matriz A"));

        this.matriza = new int[fila][columna];

        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de filas de la matriz B"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de columnas de la Matriz B"));

        this.matrizb = new int[fila][columna];
    }

    public void agregarMatrizA()
    {
        for (int fila=0; fila < this.matriza.length; fila++)
        {
            for (int columna=0; columna < this.matriza[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores de la Matriz A"));

                this.matriza[fila][columna] = this.valores;
            }
        }
    }
    public void agregarMatrizB()
    {
        for (int fila=0; fila < this.matrizb.length; fila++)
        {
            for (int columna=0; columna < this.matrizb[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores de la Matriz B"));

                this.matrizb[fila][columna] = this.valores;
            }
        }
    }


    public void mostrarMatrizA()
    {
        System.out.println("Matriz A")   ;
        for(int fila=0; fila < this.matriza.length; fila++)
        {
            for(int columna=0; columna < this.matriza[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriza[fila][columna]);
            }

            System.out.println();

        }

    }

    public void mostrarMatrizB()
    {
        System.out.println("Matriz B")   ;
        for(int fila=0; fila < this.matrizb.length; fila++)
        {
            for(int columna=0; columna < this.matrizb[fila].length; columna++)
            {

                System.out.printf("%d ", this.matrizb[fila][columna]);
            }

            System.out.println();
        }
    }

    public void mostrarResultanteSuma()
    {

        int [][] mresultado = new int [matriza.length] [matriza[0].length];
        System.out.println("Matriz A + Matriz B")   ;
        for (int fila =0; fila<= matriza.length;fila++){

            for (int col=0; col< matriza[fila].length;col++)
            {

                mresultado [fila][col] = matriza[fila][col] + matrizb [fila][col];
                System.out.printf("%d ", mresultado[fila][col]);
            }
            System.out.println();
        }
    }





    public static void main(String args[])
    {
        Matriz matriz = new Matriz();

        matriz.agregarMatrizA();
        matriz.agregarMatrizB();

        matriz.mostrarMatrizA();
        matriz.mostrarMatrizB();
        matriz.mostrarResultanteSuma();



    }
}
