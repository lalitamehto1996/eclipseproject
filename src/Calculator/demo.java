package Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class demo {
	
	public void testAdd() {
		demo math = new demo();
        int result = math.add(3, 4);
        assertEquals(8, result);
    }

    private int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Test
    public void testSubtract() {
    	demo math = new demo();
        int result = math.subtract(8, 3);
        assertEquals(5, result);
    }

    private int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Test
    public void testMultiply() {
		demo math = new demo();
        int result = math.multiply(2, 6);
        assertEquals(12, result);
    }

    private int multiply(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Test
    public void testDivide() {
		demo math = new demo();

        // Test normal division
        double result = math.divide(10, 2);
        assertEquals(5.0, result, 0.0001);

        // Test division by zero (expecting an exception)
        assertThrows(IllegalArgumentException.class, () -> math.divide(5, 0));
    }

	private double divide(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}


