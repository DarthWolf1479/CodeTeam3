
public class Persona {

	public String nombre;
	public String profesion;
	public int edad;
	
	public Persona(String _nombre,String _profesion,int _edad){
		nombre = _nombre;
		profesion = _profesion;
		edad = _edad;
	}
	public String getNombre() {
		return nombre;
	}

	public String getProfesion() {
		return profesion;
	}
	
	public int getEdad() {
		return edad;
	}
	
	
}