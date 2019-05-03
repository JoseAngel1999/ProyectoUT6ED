package practica6;

public class Coche {
	//Constantes
	static final String cocheConMatricula = "El coche con matricula";
	static final String noTieneInformacion = "no dispone de información";
	//Variables
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String combustibleCoche() {
		String resultado = "";
		//Si la variable combustible, es igual a Gasolina...
		if (combustible == "Gasolina") {
			resultado += cocheConMatricula + matricula + " ";
			resultado += metodoGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += cocheConMatricula + matricula + " ";
			resultado += metodoDiesel(modelo, fabricante);
		} else if (combustible == "Híbrido") {
			resultado += cocheConMatricula + matricula + " ";
			resultado += metodoHibrido(modelo, fabricante);
		} else {
			resultado += cocheConMatricula + matricula + " ";
			resultado += noTieneInformacion;
		}
		return resultado;
	}
	
	private String metodoGasolina(String modelo2, String fabricante2) {
		return null;
	}
	private String metodoDiesel(String modelo2, String fabricante2) {
		return null;
	}
	private String metodoHibrido(String modelo2, String fabricante2) {
		return null;
	}

	
}
