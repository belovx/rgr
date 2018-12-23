package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//создание класса Test2
public class Test2 {

	@org.junit.Test
	public void test1() {
		
		
		// создание объекта Calc с передачей параметров
		Calc a = new Calc(2000, 30, 90);
		// сравнение результатов
		assertEquals(a.getCost(),"54000.0");
	}

}
