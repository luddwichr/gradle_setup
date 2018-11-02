package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		assertThat(new DemoApplication().doSomething()).isTrue();
	}

}
