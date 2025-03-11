package EjerciciosGuia;
public class EjercicioTiposPrimitivos{
    //significado delmodificador de acceso public      : significa que el método es accesible desde cualquier clase.
    //tambien se puede utilizar el modificador de acceso protected, private y default.
    //protected: significa que el método es accesible desde cualquier clase del mismo paquete y de cualquier subclase.
    //private: significa que el método es accesible solo desde la misma clase.
    //default: significa que el método es accesible solo desde las clases del mismo paquete.    
    public static void main(){
        System.out.println("Hola en este ejercicio crearemos y asignaremos valores a las variables primitivas y no primitivas, así como tipos de datos especiales.");
        //Tipos entero
        byte edad = 25;
        short edad2 = 25;
        int edad3 = 25;
        long edad4 = 25L;    
        System.out.println(edad);
        System.out.println(edad2);
        System.out.println(edad3);
        System.out.println(edad4);
        //Tipos flotante
        float altura = 1.75f;
        double altura2 = 1.75;
        System.out.println(altura);
        System.out.println(altura2);
        //Tipo caracter
        char letra = 'a';
        System.out.println(letra);
        //Tipo booleano
        boolean bandera = true;
        System.out.println(bandera);
        //Tipo String
        String nombre = "Juan";
        System.out.println(nombre);
        //Tipo Object
        Object objeto = new Object();
        System.out.println(objeto);
        //Tipo null
        Object objeto2 = null;
        System.out.println(objeto2);
        //Tipo void.
        //void no es un tipo de dato, es un tipo de retorno de un método.
        //void indica que el método no retorna ningún valor.    
        //Datos estructurados
        //Array
        int[] numeros = {1,2,3,4,5};
        System.out.println(numeros);
        System.out.println("este es el valor guardado en la posición 0 del arreglo: "+ numeros[0]);
        //RETO 1: Imprimir los valores del arreglo anterior ubicadoe¿s en las posiciones 1, 3 y 4.
        



        //Matriz
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matriz);
        System.out.println("este es el valor guardado en la posición 0,2 de la matriz: "+ matriz[0][2]);
        System.out.println("este es el valor guardado en la posición 2,0 de la matriz: "+ matriz[2][0]);
        //RETO 2:Imprimir los valores de la matriz anterior ubicados en las posiciones 1,1 y 2,2.
        
        

       
    }
}
