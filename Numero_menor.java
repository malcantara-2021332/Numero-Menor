import java.util.Scanner;
 public class Numero_menor {
 	public static void main(String[] args) {
 		
 		Scanner leer = new Scanner(System.in);
 		System.out.println("Hola, en esta oportunidad tu ingresarar valores y nosotros te diremos cual es el menor");

 		System.out.println("Ingresar valor para variable A Porfavor.");
 		int var_A = leer.nextInt();
 		//Se pedira ingrsarar los 3 valores para luego poder decir luego cual es el menor.
 		System.out.println("Ingresar el segundo valor para variable B Porfavor.");
        int var_B = leer.nextInt();
        System.out.println("Ingresar el tercer valor para variable C Porfavor.");
        int var_C = leer.nextInt();


 if (var_A < var_B){
 	if (var_A < var_C){
 		// Usaremos el if para poder ver los posiblies resultados que abran usando los valores de las variable
 		System.out.println("El menor es " +var_A );
 	  }else {
 	  	System.out.println("El menor es" +var_B);
 	  }
 } else if (var_B < var_C){
 	System.out.println("El menor es" +var_B);
 } else {
 	System.out.println("El menor es " +var_C);
 }
 	}
 }