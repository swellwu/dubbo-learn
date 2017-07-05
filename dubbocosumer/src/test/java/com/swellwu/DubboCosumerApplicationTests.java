package com.swellwu;

import com.swellwu.service.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboCosumerApplicationTests {

	@Autowired
	HelloWorldService helloWorldService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void hello(){
		String hello = helloWorldService.hello();
		System.out.println(hello);
	}
}
