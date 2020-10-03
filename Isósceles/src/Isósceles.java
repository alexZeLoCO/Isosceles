
public class Is�sceles {

	
//--------------------INICIALIZACI�N DE VARIABLES PRIVADAS-------------------------
	private double base;
	private double altura;
	private double �rea;
	private double per�metro;
	private double lado;

	
//----------------------M�TODOS GET-----------------------
	public double getBase() {
		return base;
	}
	public double getAltura () {
		return altura;
	}

	
//----------------------------M�TODOS SET-----------------
	public void setBase (double b) { 		//VARIABLE b TEMPORAL.
		if (b < 0) {		//CONDICI�N: SI b<0.
			System.out.print("El valor de la base introducido es inferior a 0. La base ha sido invalidada.");
			System.exit(0);		//CIERRA PROGRAMA.
		} else {
			System.out.println("El valor de la base ha sido validado.");
			base = b;		//ALMACENAR VALOR DE b EN VARIABLE PRIVADA B
		}
	}
	public void setAltura (double a) {		//VARIABLE a TEMPORAL.
		if (a < 0) {		//CONDICI�N: SI a<0.
			System.out.print("El valor de la altura introducido es inferior a 0. La altura ha sido invalidada.");
			System.exit(0);		//CERRAR PROGRAMA.
		} else {
			System.out.println("El valor de la altura ha sido validado.");
			altura = a;		//ALMACENAR VALOR DE a EN VARIABLE PRIVADA A.
		}
	}
	
	
//----------------------M�TODOS DE C�LCULO----------------------
	public void calcularLado () {		//CALCULAR LADO DE IS�SCELES.
		lado = Math.sqrt(Math.pow(base/2, 2)+Math.pow(altura, 2));
	}
	
	public double calcularArea () {		//CALCULAR �REA
		�rea = base * altura /2 ;
		return �rea;
	}
	public double calcularPer�metro () {	//CALCULAR PER�METRO.
		per�metro = base + 2*lado;
		return per�metro;
	}
}
