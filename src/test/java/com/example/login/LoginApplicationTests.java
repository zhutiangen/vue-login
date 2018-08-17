package com.example.login;

import com.example.login.pojo.Log;
import com.example.login.service.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginApplicationTests {

	@Resource
	private LogService logService;

	@Test
	public void contextLoads() {
		List<Log> all = logService.getAll();
		System.out.println(all.toString());
	}

}
