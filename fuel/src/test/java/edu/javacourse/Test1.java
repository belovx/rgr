package edu.javacourse;

import static org.junit.Assert.*;

import org.junit.Test;

//создание класса Test1
public class Test1 {

	@org.junit.Test
	public void test1() {
		
		// создание объекта Calc с передачей параметров
		Calc a = new Calc(500, 30, 150);
		// сравнение результатов
		assertEquals(a.getFuel(),"150.0");
	}

}
