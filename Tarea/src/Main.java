public class Main {

    public static void main(String[] args)
    {
        operacion Operacion = new operacion();

        Operacion.EstablecerNumero1(2);
        Operacion.EstablecerNumero2(10);
        Operacion.EstablecerNumero3(9);

        System.out.println("Coeficiente Cuadratico: "+Operacion.ObtenerNumero1());
        System.out.println("Coeficiente Lineal: "+Operacion.ObtenerNumero2());
        System.out.println("Constante: : "+Operacion.ObtenerNumero3());
        System.out.println(" x1 :"+Operacion.operacion2());
        System.out.println(" x2 :"+Operacion.operacion3());

    }

}