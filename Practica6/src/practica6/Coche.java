package practica6;

/**
 * 
 * @author Jose Angel Cabezas Arenas
 *
 */
public class Coche {
	//Constantes
	static final String cocheConMatricula = "El coche con matricula";
	static final String noTieneInformacion = "no dispone de informaci�n";
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
	 * @return devuelve el tipo de coche, seg�n e combustible que sea.
	 */
	public String combustibleCoche() {
		String resultado = "";
		
		if (combustible == "Gasolina") {
			resultado += cocheConMatricula + matricula + " ";
			resultado += metodoGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += cocheConMatricula + matricula + " ";
			resultado += metodoDiesel(modelo, fabricante);
		} else if (combustible == "H�brido") {
			resultado += cocheConMatricula + matricula + " ";
			resultado += metodoHibrido(modelo, fabricante);
		} else {
			resultado += cocheConMatricula + matricula + " ";
			resultado += noTieneInformacion;
		}
		return resultado;
	}
	/**
	 * M�todo para obtener el gasto de un coche de gasolina.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche de gasolina.
	 */
	private String metodoGasolina(String modelo2, String fabricante2) {
		return  "Es un "+fabricante2+modelo2+" y gasta 1,337 euros por litro.";
	}
	/**
	 * M�todo para obtener el gasto de un coche Diesel.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche Diesel.
	 */
	private String metodoDiesel(String modelo2, String fabricante2) {
		return "es un "+ fabricante2+modelo2+" y gasta 1,052 euros por litro.";
	}
	
	/**
	 * M�todo para obtener el gasto de un coche H�brido.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche H�brido.
	 */
	private String metodoHibrido(String modelo2, String fabricante2) {
		return "es un"+fabricante2+modelo2+" y no necesita combustible.";


	}

	
}
