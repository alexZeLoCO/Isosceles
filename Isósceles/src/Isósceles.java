
public class Isósceles {

	
//--------------------INICIALIZACIÓN DE VARIABLES PRIVADAS-------------------------
	private double base;
	private double altura;
	private double área;
	private double perímetro;
	private double lado;

	
//----------------------MÉTODOS GET-----------------------
	public double getBase() {
		return base;
	}
	public double getAltura () {
		return altura;
	}

	
//----------------------------MÉTODOS SET-----------------
	public void setBase (double b) { 		//VARIABLE b TEMPORAL.
		if (b < 0) {		//CONDICIÓN: SI b<0.
			System.out.print("El valor de la base introducido es inferior a 0. La base ha sido invalidada.");
			System.exit(0);		//CIERRA PROGRAMA.
		} else {
			System.out.println("El valor de la base ha sido validado.");
			base = b;		//ALMACENAR VALOR DE b EN VARIABLE PRIVADA B
		}
	}
	public void setAltura (double a) {		//VARIABLE a TEMPORAL.
		if (a < 0) {		//CONDICIÓN: SI a<0.
			System.out.print("El valor de la altura introducido es inferior a 0. La altura ha sido invalidada.");
			System.exit(0);		//CERRAR PROGRAMA.
		} else {
			System.out.println("El valor de la altura ha sido validado.");
			altura = a;		//ALMACENAR VALOR DE a EN VARIABLE PRIVADA A.
		}
	}
	
	
//----------------------MÉTODOS DE CÁLCULO----------------------
	public void calcularLado () {		//CALCULAR LADO DE ISÓSCELES.
		lado = Math.sqrt(Math.pow(base/2, 2)+Math.pow(altura, 2));
	}
	
	public double calcularArea () {		//CALCULAR ÁREA
		área = base * altura /2 ;
		return área;
	}
	public double calcularPerímetro () {	//CALCULAR PERÍMETRO.
		perímetro = base + 2*lado;
		return perímetro;
	}
}
