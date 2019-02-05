/**
 * 
 * @author Fran Bernabeu Agulló
 * @version 1.2
 * 
 */
public class Rectangulo_FBA extends FiguraGeometrica_FBA {
	private double l1;
	private double l2;
	
	public Rectangulo_FBA(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
 * Metodo que genera el area
 * @param l1
 * @param l2
 * Devuelve un double con el area (multiplicacion de los lados)
 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Metodo que genera el perimetro
	 * @param l1
	 * @param l2
	 * Devuelve un double con el perimetro (suma del doble de los lados)
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
