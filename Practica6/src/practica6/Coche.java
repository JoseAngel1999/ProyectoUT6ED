package practica6;

/**
 * 
 * @author Jose ANgel Cabezas Arenas
 *
 */
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
	/**
	 * 
	 * @return devuelve el tipo de coche, según e combustible que sea.
	 */
	public String combustibleCoche() {
		String resultado = "";
		
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
	/**
	 * 
	 * @param El modelo del coche
	 * @param El fabricante del coche
	 * @return 
	 */
	private String metodoGasolina(String modelo2, String fabricante2) {
		return null;
	}
	/**
	 * 
	 * @param El modelo del coche
	 * @param El fabricante del coche
	 * @return
	 */
	private String metodoDiesel(String modelo2, String fabricante2) {
		return null;
	}
	
	/**
	 * 
	 * @param El modelo del coche
	 * @param El fabricante del coche
	 * @return
	 */
	private String metodoHibrido(String modelo2, String fabricante2) {
		return null;
	}

	
}
