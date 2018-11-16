package helloWorld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestKlasse {


	@Test
	void test() {
		Klasse x = new Klasse();
		assertEquals(11, x.addiere(6, 5));
	}
	@Test
	void test2() {
		Klasse xy = new Klasse();
		assertEquals(16, xy.subtrahiere(20, 4));
	}
	@Test
	void test3() {
		Klasse xy = new Klasse();
		assertEquals(8, xy.multipliziere(2, 4));
	}
	

}
