package com.example.AddTwoNumbers;

import com.example.AddTwoNumbers.domain.Addition;
import com.example.AddTwoNumbers.utility.AdditionUtility;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class AddTwoNumbersApplicationTests {
	AdditionUtility addition = new AdditionUtility();
	//
	@Test
	public void testAdd() {

		assertEquals(7, addition.add(3, 4));

	}
	@Test
	public void testAddNeg() {

		assertNotEquals(7, addition.add(1, 3));
	}
}
