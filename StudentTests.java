
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;


public class StudentTests extends TestCase {
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
	public TestCaseStudent(String name) {
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
	public void testMedieAritmeticaPromovatToateExamenele() throws IllegalArgumentException {		
		int suma=0;
		int notaRandom=generareValoareRandomPeste5();
		student.addNota(notaRandom);
		suma+=notaRandom;
		notaRandom=generareValoareRandomPeste5();
		student.addNota(notaRandom);
		suma+=notaRandom;
		notaRandom=generareValoareRandomPeste5();
		student.addNota(notaRandom);
		suma+=notaRandom;
		float medieAsteptata=suma/3.0f;
		student.medieAritmetica();
		assertEquals(medieAsteptata,student.getMedie(),0.01);
	}
	
	
	
	
		
		
		
	}
	
	
	
	
}
