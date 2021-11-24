package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HttpControllerTest {
	
	private static final String TAG ="HttpControllerTest : ";

	@GetMapping("http/get")
	public String getTest(Member m) {
		System.out.println(TAG+"getter : "+m.getId());
		m.setId(5000);
		System.out.println(TAG+"setter : "+m.getId());

		
		return "GET 요청 : "+m.getId()+","+m.getUsername()+","+m.getPassword()+",'"+m.getEmail();
	}
	@PostMapping("http/post")
	public String postTest(@RequestBody Member m) {
		return "post 요청 : "+m.getId()+","+m.getUsername()+","+m.getPassword()+",'"+m.getEmail();
	}
	@PutMapping("http/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청 : "+m.getId()+","+m.getUsername()+","+m.getPassword()+",'"+m.getEmail();
	}
	@DeleteMapping("http/delete")
	public String deleteTest() {
		return "DELETE요청";
	}
	
	
}
