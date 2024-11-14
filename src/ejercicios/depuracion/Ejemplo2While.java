package ejercicios.depuracion;

/* 
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;
public class Ejemplo2While {
  
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        n = pedirNumero();
        while (contador< n){
               System.out.println(" * ");
               System.out.println("contador:"+ contador);
               contador++;
        }
    }
}

