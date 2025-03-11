package EjerciciosGuia;
public class IncrementoDecrementoRelacionales{
        public static void main(String[] args) {
//Operadores Aritmeticos Incremento y Decremento
        int a = 5;
        int b = ++a;
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);

        int c=5;
        int d = c++;
        System.out.println("El valor de c es: "+c);
        System.out.println("El valor de d es: "+d);

        int e = 5;
        int f = --a;
        System.out.println("El valor de e es: "+e);
        System.out.println("El valor de f es: "+f);

        int g = 5;
        int h = a--;
        System.out.println("El valor de g es: "+g);
        System.out.println("El valor de h es: "+h);

    //Operadores Relacionales
        boolean igualque= 5==4;
        System.out.println("5 es igual a 4: "+igualque);
        boolean distinto = 5!=4;
        System.out.println("5 es distinto de 4: "+distinto);
        boolean mayorque = 5>4;
        System.out.println("5 es mayor que 4: "+mayorque);
        boolean menorque = 5<4;
        System.out.println("5 es menor que 4: "+menorque);
        boolean mayoroigualque = 5>=4;
        System.out.println("5 es mayor o igual que 4: "+mayoroigualque);
        boolean menoroigualque = 5<=4;
        System.out.println("5 es menor o igual que 4: "+menoroigualque);
        
    // Operadores Lógicos 
        boolean and = true && false;
        System.out.println("true AND false: "+and);
        boolean or = (1 > 3) || (5 > 1);
        System.out.println("true OR false: "+or);
        boolean not = !true;
        System.out.println("NOT true: "+not);
        boolean xor = true ^ false;
        System.out.println("true XOR false: "+xor);
        boolean and2 = 5>4 & 5<6;
        System.out.println("5>4 AND 5<6: "+and2);
        boolean or2 = 5>4 | 5<6;
        System.out.println("5>4 OR 5<6: "+or2);
       
// Operardor condicional ?: 
        int i = 5;
        int j = 4;
        int k = (i>j)? i:j;
        System.out.println("El valor de k es: "+k);
        int l = (i<j)? i:j;
        System.out.println("El valor de l es: "+l); 

        //Operador Concatenar
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Nombre Completo: "+nombreCompleto);         
        }
}
