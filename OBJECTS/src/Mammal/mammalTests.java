package Mammal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mammalTests {

	@Test
	void platpustests() {
		platpus p = new platpus(2.5, 12, "Female");
		assertEquals(p.getLength().doubleValue(), 2.5,0.01);
		assertEquals(p.getWeight().intValue(), 12);
		assertEquals(p.getSex(), "Female");
		assertEquals(p.getmglandnum().intValue(), 0);
		assertEquals(p.isTheriifomes(), false);
		assertEquals(p.isYinotheria(), true);
	}
	void hedgehogtests() {
		Hedgehog h = new Hedgehog(0.25, 1, "Brown");
		assertEquals(h.getLength().doubleValue(), 0.25, 0.01);
		assertEquals(h.getWeight().intValue(), 1);
		assertEquals(h.getColor(), "Brown");
		assertEquals(h.getmglandnum().intValue(), 10);
		assertEquals(h.isTheriifomes(), false);
		assertEquals(h.isYinotheria(), true);
	}
	void cowtests() {
		cow c = new cow(1200, "Brown");
		assertEquals(c.getWeight().intValue(),1200);
		assertEquals(c.getColor(), "Brown");
		assertEquals(c.getmglandnum().intValue(), 4);
		assertEquals(c.isTheriifomes(), true);
		assertEquals(c.isYinotheria(), false);
	}
	void humanstests() {
		human h = new human(6.8,"Male",165);
		assertEquals(h.getHeight().doubleValue(), 6.8, 0.01);
		assertEquals(h.getWeight().intValue(), 165);
		assertEquals(h.getSex(), "Male");
		assertEquals(h.getmglandnum().intValue(),2);
		assertEquals(h.isTheriifomes(), true);
		assertEquals(h.isYinotheria(), false);
	}
	void cattests() {
		cat c = new cat(4,"Black");
		assertEquals(c.getWeight().intValue(), 4);
		assertEquals(c.getColor(), "Black");
		assertEquals(c.getmglandnum().intValue(),8);
		assertEquals(c.isTheriifomes(), true);
		assertEquals(c.isYinotheria(), false);
	}
}
