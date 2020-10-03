import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO.
public class TestIsósceles {

	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER.
		Isósceles Magallanes = new Isósceles();		//CREAR OBJETO Magallanes DE TIPO ISÓSCELES.
		
		System.out.print("Introduzca el valor de la base: ");		//SOLICITA BASE.
		Magallanes.setBase(teclado.nextDouble());		//LLAMADA MÉTODO setBase() DE Magallanes.
		System.out.print("Introduzca el valor de la altura: ");		//SOLICITA ALTURA.
		Magallanes.setAltura(teclado.nextDouble());		//LLAMADA MÉTODO setAltura() DE Magallanes.
		
		//SALIDA DE DATOS.
		System.out.printf("El área del triángulo isósceles definido por la base de longitud %.2f y altura de longitud %.2f es %.3f. Y su perímetro es de %.2f.",Magallanes.getBase(),Magallanes.getAltura(),Magallanes.calcularArea(),Magallanes.calcularPerímetro());
	}
}
