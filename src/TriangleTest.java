import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.company.domain.Triangle;

class TriangleTest {

	@Test
	void testTriangleExists() {
		Triangle triangle = new Triangle(12.0, 12.0, 12.0);
		assertTrue(triangle.isTriangle());
	}
	
	@Test
	void testTriangleIsEquilateral() {
		Triangle triangle = new Triangle(12.0, 12.0, 12.0);
		assertTrue(triangle.isEquilateral());
	}
	
	@Test
	void testTriangleIsScalene() {
		Triangle triangle = new Triangle(12.0, 12.0, 12.0);
		assertTrue(triangle.isScanele() == true );
	}

}
