package geometria;

public class Circulo_FBA extends FiguraGeometrica_FBA {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_FBA(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		radio= (double) Math.abs(r);
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
