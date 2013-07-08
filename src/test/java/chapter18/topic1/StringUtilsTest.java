package chapter18.topic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void _should_return_snake_case_input_aaa() {
		assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
	}

	@Test
	public void _should_return_snake_case_input_HelloWorld() {
		assertThat(StringUtils.toSnakeCase("HelloWorld"), is("hello_world"));
	}

	@Test
	public void _should_return_snake_case_input_practiceJunit() {
		assertThat(StringUtils.toSnakeCase("practiceJunit"),
				is("practice_junit"));
	}
	@Test
	public void _should_return_snake_case_input_HogeFugaPiyo() {
		assertThat(StringUtils.toSnakeCase("HogeFugaPiyo"),
				is("hoge_fuga_piyo"));
	}

}
