package HashTables;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

class DictionaryTests {

	@Test
	void test() {
		IDictionary<String, String> d = new Dict<String, String>();
		assertEquals(d.isEmpty(), true);
		d.insert("Marco", "Morazan");
		d.insert("James", "Kirk");
		d.insert("Kathryn", "Janeway");
		d.insert("Marco", "Morazan");
		d.insert("B'Elanna", "Torres");
		
		assertEquals(d.isEmpty(), false);
		assertEquals(d.size().intValue(), 5);
		assertEquals(d.findElement("Marco"), "Morazan");
		assertEquals(d.findElement("B'Elanna"), "Torres");
		assertEquals(d.findElement("Josie"), null);
		d.delete("Kathryn");
		assertEquals(d.findElement("Kathryn"), null);
		assertEquals(d.size().intValue(), 4);
		
		Iterator<String> klooper = d.keys();
		Iterator<String> elooper = d.elements();
		String res = "";
		
		while(klooper.hasNext()) {
			res = res + " "+ klooper.next() + " " + elooper.next();}
		
		assertEquals(res, " Marco Morazan James Kirk Marco Morazan B'Elanna Torres");

		HashComparator<String> scomp = new StringComparator();
		LPHash<String, String> ht = new LPHash<String,String>(101,scomp);
		
		assertEquals(ht.size().intValue(), 0);
		assertEquals(ht.isEmpty(),true);
		assertEquals(ht.findElement("Marco"), null);
		ht.insert("Marco", "Morazan");
		ht.insert("Nick", "Olsen");
		ht.insert("Jean Luc", "Picard");
		ht.insert("Kathryn", "Janeway");
		assertEquals(ht.size().intValue(), 4);
		assertEquals(ht.isEmpty(), false);
		assertEquals(ht.findElement("Marco"), "Morazan");
		assertEquals(ht.findElement("Cathryn"), null);
		assertEquals(ht.findElement("Kathryn"), "Janeway");
		ht.delete("Kathryn");
		assertEquals(ht.findElement("Kathryn"), null);
		
		Iterator<String> kklooper = ht.keys();
		Iterator<String> eelooper = ht.elements();
		String rres = "";
		
		while(kklooper.hasNext()) {
			rres=rres + "" + kklooper.next() + "" + eelooper.next();
		}
		
		assertEquals(rres, "Jean LucPicardNickOlsenMarcoMorazan");
		
		
			
	}

}
