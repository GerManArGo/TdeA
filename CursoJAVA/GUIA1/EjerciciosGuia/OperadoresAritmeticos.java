package EjerciciosGuia;
public class OperadoresAritmeticos{
    //Realizaremos ejercicios con Operadores Aritmeticos, Relacionales y Logicos 
    /**
     * @param args
     */
    public static void main(String []args){
       
        //Asignación de valores a variables
        int numero1 = 10;
        int numero2 = numero1;
        System.out.println("el valor de numero1 es: "+ numero1 + " = "+"y el de numero2:" + numero2);
        
         //Operadores Aritmeticos
        //suma
        int suma = numero1 + numero2;
        System.out.println("La suma de numero1 y numero2 es: "+suma);
        
        //resta
        int a=  10;
        long b = 5;
        long resta = a - b;
        System.out.println("La resta de a y b es: "+resta);

        //multiplicacion
        double c = 1.5D;
        int d = 5;
        double multiplicacion = c * d;
        System.out.println("La multiplicacion de c y d es: "+multiplicacion);

        // division
        float e = 1.5F;
        int f = 3;
        float division = e / f;
        System.out.println("La division de e y f es: "+division);

        // modulo
        int g = 10;
        int h = 3;
        float modulo= g % h;
        System.out.println("El modulo de g y h es: "+modulo);       

        //Ejercicio
        int r=12;
        int t=2;
        double div;
        int su,re,mul;
        double mod;
        double operacion;

        operacion=9/3*5+7-2;
        System.out.println("El resultado de la operacion es: "+operacion);
        div=r/t;
        System.out.println("La division de numero1 y numero2 es: "+div);
        su=r+t;
        System.out.println("La suma de numero1 y numero2 es: "+su);
        re=r-t;
        System.out.println("La resta de numero1 y numero2 es: "+re);
        mul=r*t;
        System.out.println("La multiplicacion de numero1 y numero2 es: "+mul);
        mod=r%t;
        System.out.println("El modulo de numero1 y numero2 es: "+mod);
     
        



    }
}
