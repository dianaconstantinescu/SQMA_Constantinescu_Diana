
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;


public class TestCaseStudent2 extends TestCase {
	Student student;
	public void testAddNotaRandom() throws IllegalArgumentException {
		Random rand=new Random();
		int valoareNormala=rand.nextInt(11);
		student.addNota(valoareNormala);
		assertEquals(valoareNormala,student.getNota(0));		
	}
	
	public void testAddNotaRightNotaMaxima() throws IllegalArgumentException {
		int valoareNormala=10;
		student.addNota(valoareNormala);
		assertEquals(valoareNormala,student.getNota(0));		
	}
	public TestCaseStudent2(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		student=new Student("Constantinescu");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
public int generareValoareRandomPeste5() {
	Random rand=new Random();
	return (rand.nextInt(6)+5);
}
public int generareValoareRandomSub5() {
	Random rand=new Random();
	return rand.nextInt(5);
}
	public void testMedieAritmeticaraPromovatUnSingurExamen() throws IllegalArgumentException {
		
		int notaRandom=generareValoareRandomPeste5();
		student.addNota(notaRandom);
		student.addNota(generareValoareRandomSub5());		
		student.addNota(generareValoareRandomSub5());
		float medieAsteptata=notaRandom;
		student.medieAritmetica();
		assertEquals(medieAsteptata,student.getMedie());
		
	}
	public void testMedieAritmeticaNiciunExamenPromovat() throws IllegalArgumentException {
		student.addNota(generareValoareRandomSub5());
		student.addNota(generareValoareRandomSub5());
		student.addNota(generareValoareRandomSub5());
		float medieAsteptata=0.0f;
		student.medieAritmetica();
		assertEquals(medieAsteptata,student.getMedie());
	}
	
	public void testMedieAritmeticaExceptieNiciunExamenSustinut() throws IllegalArgumentException {
		ArrayList<Integer> noteStudent=new ArrayList<>();		
		student=new Student("Constantinescu",noteStudent);
		try {
			student.medieAritmetica();
			fail("Testul a trecut desi trebuie sa esueze");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}catch(Exception e) {
			fail("Testul a esuat din alt motiv");
		}
		
	
}
