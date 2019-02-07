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
	public void testarea1() {
		Circulo_FBA cir = new Circulo_FBA (7, null);
		res= cir.area();
		assertEquals(153.9384,res,0);
	}
	@Test
	public void testperimetro1() {
		Circulo_FBA cir= new Circulo_FBA (7,null);
		res=cir.perimetro();
		assertEquals(43.9824,res,0);

	}
	@Test
	public void testarea2() {
		Circulo_FBA cir = new Circulo_FBA (0, null);
		res= cir.area();
		assertEquals(0,res,0);
	}
	@Test
	public void testperimetro2() {
		Circulo_FBA cir= new Circulo_FBA (0,null);
		res=cir.perimetro();
		assertEquals(0,res,0);

	}
	@Test
	public void testarea3() {
		Circulo_FBA cir = new Circulo_FBA (-3, null);
		res= cir.area();
		assertEquals(28.2744,res,0);
	}
	@Test
	public void testperimetro3() {
		Circulo_FBA cir= new Circulo_FBA (-3,null);
		res=cir.perimetro();
		assertEquals(18.8496,res,0);

	}
}
