import java.text.SimpleDateFormat;
import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;

public class Main {
	public static void main(String[] args) {
		// UnitTest

		// Edad
		// System.out.println("Su edad es: " + edad("19/07/1996"));

		// Primo
		// System.out.println(esPrimo(24));
		// System.out.println(esPrimo(19));
		// System.out.println("15");
		//Persona p1 = new Persona("Mauricio", "Industrial", 22);
		//Persona p2 = new Persona("Kevin", "Industrial", 25);
		//Persona p3 = new Persona("Adolfo", "Kami", 19);
 
		//System.out.println(AplicaPersona(p1, p2, "Industrial").getNombre());
		//System.out.println(AplicaPersona(p1, p2, "Sistemas").getNombre());
		//System.out.println(AplicaPersona(p1, p3, "kami").getNombre());
		
	}

	public static boolean esPrimo(int num) {
		int cont = 2;
		boolean esPrimo = true;

		while ((esPrimo) && (cont != num)) {
			if (num % cont == 0) {
				esPrimo = false;
			}
			cont++;
		}
		return esPrimo;
	}

	public static int edad(String fecha_nac) { // fecha_nac debe tener el
												// formato dd/MM/yyyy

		Date fechaActual = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String hoy = formato.format(fechaActual);
		String[] dat1 = fecha_nac.split("/");
		String[] dat2 = hoy.split("/");
		int años = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
		int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
		if (mes < 0) {
			años = años - 1;
		} else if (mes == 0) {
			int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
			if (dia > 0) {
				años = años - 1;
			}
		}
		return años;
	}

	public static Persona AplicaPersona(Persona A, Persona B, String valor) {
		//System.out.println("valor " + valor);
		//System.out.println("Entre a la 1");
		if ((A.getProfesion() == valor) && (B.getProfesion() != valor)) {
			return A;
		}
		//System.out.println("Entre a la 2");
		if ((A.getProfesion() != valor) && (B.getProfesion() == valor)){
			return B;	
		}
		//System.out.println("Entre a la 3");
		if((A.getProfesion() == valor) && (B.getProfesion() == valor)) {
			//System.out.println("Entre a la 3.1");
			if (A.getEdad() > B.getEdad()) {
				return A;
			} else {
				//System.out.println("Entre a la 3.2");
				return B;
			}
		} else {
			return null;
		}
	}
	
	

}
