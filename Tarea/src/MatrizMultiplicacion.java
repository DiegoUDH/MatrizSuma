import javax.swing.*;

public class MatrizMultiplicacion {

    private int matriza[][];
    private int matrizb[][];

    private int fila;

    private int columna;

    private int valores;

    public MatrizMultiplicacion()
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
    public void mostrarResultanteMultiplicacion()
    {
        System.out.println("Matriz A * Matriz B")   ;
        int matrizResultado[][] = new int[matriza.length][matriza[0].length];
        for (int a = 0; a < matrizb[0].length; a++) {

            for (int i = 0; i < matriza.length; i++) {
                int suma = 0;

                for (int j = 0; j < matriza[0].length; j++) {

                    suma += matriza[i][j] * matrizb[j][a];
                }

                matrizResultado[i][a] = suma;
            }
        }

        for (int i = 0; i < matrizb.length; i++) {
            for (int j = 0; j < matrizb[0].length; j++) {
                System.out.printf("%d ", matrizResultado[i][j]);
            }
            System.out.print("\n");
        }

    }






    public static void main(String args[])
    {
        MatrizMultiplicacion matrizMultiplicacion = new MatrizMultiplicacion();

        matrizMultiplicacion.agregarMatrizA();
        matrizMultiplicacion.agregarMatrizB();

        matrizMultiplicacion.mostrarMatrizA();
        matrizMultiplicacion.mostrarMatrizB();

        matrizMultiplicacion.mostrarResultanteMultiplicacion();


    }
}