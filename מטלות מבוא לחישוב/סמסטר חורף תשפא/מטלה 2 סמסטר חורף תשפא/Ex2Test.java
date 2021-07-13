
package Ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2Test {
	static double[] po1={2, 0, 3, -1, 0}, po2={0.1, 0, 1, 0.1, 3}, p03={0,0,0,0,0,1},po4={5,6,9,1},p05={0},p06={1,0,5,7,4},p7={5};
	double x1 = 1, x2 = 0, x3 = 2, x4=-2;

	static final double EPS = 0.0001;

	@Test
	void testF() {
		double fx0 = Ex2.f(po1, 0);
		double fx1 = Ex2.f(po1, 1);
		double fx2 = Ex2.f(po1, 2);
		assertEquals(fx0,2);
		assertEquals(fx1,4);
		assertEquals(fx2,6);
		double fx4 = 21;
		assertEquals(fx4,Ex2.f(po4,x1));
		double fx5 = 32;
		assertEquals(fx5,Ex2.f(p03,x3));
		double fx6 =0;
		assertEquals(fx6,Ex2.f(p05,x3));
		double fx7 =22;
		assertEquals(fx7,Ex2.f(po1,x4));


	}

	@Test
	void testRoot() {
		double x12 = Ex2.root(po1, 0, 10, EPS);
		assertEquals(x12, 3.1958, 0.001);
		double x13 = 0;
		assertEquals(x13 ,Ex2.root(p03,-10,10,EPS));
		double x14 = -8.353347778320312;
		assertEquals(x14 ,Ex2.root(po4,-10,10,EPS));


	}

	@Test
	void testDerivativeArrayDoubleArray() {
		double[] p = {1,2,3}; // 3X^2+2x+1
		double[] dp1 = {2,6}; // 6x+2
		double[] dp2 = Ex2.derivative(p);
		assertEquals(dp1[0], dp2[0],EPS);
		assertEquals(dp1[1], dp2[1],EPS);
		assertEquals(dp1.length, dp2.length);
		double[] polyDerivative1 = {0.0, 0.0, 0.0, 0.0, 5.0};
		assertArrayEquals(polyDerivative1,Ex2.derivative(p03));
		double[] polyDerivative2 = {6.0, 18.0, 3.0};
		assertArrayEquals(polyDerivative2,Ex2.derivative(po4));
		double[] polyDerivative3 = {};
		assertArrayEquals(polyDerivative3,Ex2.derivative(p7));



	}



	@Test
	void testAdd() {
		double[] polyadd1 = {2.1, 0.0, 4.0, -0.9, 3.0};
			assertArrayEquals(polyadd1,Ex2.add(po1,po2));
		double[] polyadd2 = {5.0, 6.0, 9.0, 1.0, 0.0, 1.0};
		assertArrayEquals(polyadd2,Ex2.add(p03,po4) );


	}

	@Test
	void testMultiplication() {
		double[]multi1 = {0.2, 0.0, 2.3, 0.1, 9.0, -0.7, 8.9, -3.0, 0.0};
			assertArrayEquals(multi1,Ex2.mul(po1, po2));
		double[]multi2 ={0.0, 0.0, 0.0, 0.0, 0.0};
		assertArrayEquals(multi2,Ex2.mul(po1,p05));
		double[]multi3 = {2.0, 0.0, 13.0, 13.0, 23.0, 16.0, 5.0, -4.0, 0.0};
		assertArrayEquals(multi3,Ex2.mul(po1,p06));


	}


	@Test
	void testStringPoly() {
		String poly5 = "";
		assertEquals(poly5, Ex2.poly(p05));
		String poly1 = "-1.0x^3+3.0x^2+2.0";
		assertEquals(poly1, Ex2.poly(po1));
	}
}