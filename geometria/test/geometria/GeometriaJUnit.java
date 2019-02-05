package geometria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeometriaJUnit {
	public double radio;
	//Constante pi
	static final double PI = 3.1416;

	private double res;

	@Test
	public void testarea() {
		Circulo_FBA cir = new Circulo_FBA (-3, null);
		res= cir.area();
		assertEquals(45.0,res);
	}
	@Test
	public void testperimetro() {
		Circulo_FBA cir= new Circulo_FBA (-3,null);
		res=cir.perimetro();
		assertEquals(20,res);

	}
}
