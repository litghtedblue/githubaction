package com.example.demo;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class WebdemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void exampleTest2() {
		assertThat(true,is(NumberUtils.isDigits("123456")));
		assertThat(5,is(5));
	}

}
