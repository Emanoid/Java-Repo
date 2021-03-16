package Student_Package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Student_test {

	@Test
	public void testStudentMethods() {
		Student S1 = new Student("Shamil","Dzhatdoyev", 3.98,20);
		Student S2 = new Student("Jsie","Des Resiers",9);
		
		assertEquals(S1.getName(),"Shamil");
		assertEquals(S1.getLastname(), "Dzhatdoyev");
		assertEquals(S1.getAge(), 20);
		assertEquals(S1.getGpa(), 3.98,0.01);
		assertEquals(S1.convert2String(), "Shamil"+""+"Dzhatdoyev"+" has a "+3.98+" gpa and is "+20+" years old. ");
		assertEquals(S2.getGpa(), 0, 0.01);
		S2.setName("Josie");
		S2.setLastname("Des Rosiers");
		S2.setGpa(4.0);
		S2.setAge(19);
		assertEquals(S2.convert2String(), "Josie"+""+"Des Rosiers"+" has a "+4.0+" gpa and is "+19+" years old. ");
	}

}
