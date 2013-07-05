package chapter18.topic1;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void _should_return_snake_case_input_aaa() {
		assertThat(StringUtils.toSnakeCase("aaa"), CoreMatchers.is("aaa"));
	}

}
