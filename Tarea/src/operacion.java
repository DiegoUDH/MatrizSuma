import java.math.*;

public class operacion

{
    double numero1;
    double numero2;
    double numero3;



    void EstablecerNumero1(double num1)
    {
        numero1 = num1;
    }
    double ObtenerNumero1()
    {
        return numero1;
    }

    void EstablecerNumero2(double num2)
    {
        numero2 = num2;
    }

    double ObtenerNumero2()
    {
        return numero2;
    }
    void EstablecerNumero3(double num3)
    {
        numero3 = num3;
    }
    double ObtenerNumero3()
    {
        return numero3;
    }



    double operacion2()
    {
        double operacion2;

        operacion2 = (-numero2 + Math.sqrt((numero2*numero2)-(4*numero1*numero3)))/(2*numero1);

        return operacion2;

    }
    double operacion3()
    {
        double operacion3;

        operacion3 = (-numero2 - Math.sqrt((numero2*numero2)-(4*numero1*numero3)))/(2*numero1);

        return operacion3;
    }

}
