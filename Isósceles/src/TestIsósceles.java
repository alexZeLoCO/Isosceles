import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO.
public class TestIs�sceles {

	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER.
		Is�sceles Magallanes = new Is�sceles();		//CREAR OBJETO Magallanes DE TIPO IS�SCELES.
		
		System.out.print("Introduzca el valor de la base: ");		//SOLICITA BASE.
		Magallanes.setBase(teclado.nextDouble());		//LLAMADA M�TODO setBase() DE Magallanes.
		System.out.print("Introduzca el valor de la altura: ");		//SOLICITA ALTURA.
		Magallanes.setAltura(teclado.nextDouble());		//LLAMADA M�TODO setAltura() DE Magallanes.
		
		//SALIDA DE DATOS.
		System.out.printf("El �rea del tri�ngulo is�sceles definido por la base de longitud %.2f y altura de longitud %.2f es %.3f. Y su per�metro es de %.2f.",Magallanes.getBase(),Magallanes.getAltura(),Magallanes.calcularArea(),Magallanes.calcularPer�metro());
	}
}
