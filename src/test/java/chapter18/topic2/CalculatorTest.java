package chapter18.topic2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CalculatorTest {

	public static class _HappyPassTest {
		@Test
		public void _should_return_1_when_1_divide_1() {
			Calculator sut = new Calculator();
			assertThat(sut.divide(1, 1), is(1));
		}

		@Test
		public void _should_return_3_when_6_divide_2() {
			Calculator sut = new Calculator();
			assertThat(sut.divide(6, 2), is(3));
		}
	}

	public static class _ExceptionTest {

		@Rule
		public ExpectedException exception = ExpectedException.none();

		@Test
		public void _should_throw_exception_when_2_divide_0() {
			exception.expect(IllegalArgumentException.class);
			exception.expectMessage("y is zero.");
			
			Calculator sut = new Calculator();
			sut.divide(2, 0);
		}
	}

}
