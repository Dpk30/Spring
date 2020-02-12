package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Entity.Student;
import com.example.Service.AppService;

@RestController
public class AppController {

	@Autowired
	AppService service;

	@GetMapping("/home")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		System.out.println("welcome");
		mv.addObject("Student");
		mv.setViewName("welcome");

		return mv;

	}

	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(Student student) {
		return new ResponseEntity<Student>(service.saveStudent(student), HttpStatus.OK);
	}

	@GetMapping("/searchStudent/{id}")
	public ResponseEntity<Student> searchStudent1(@PathVariable("id") int id) {
		return new ResponseEntity<Student>(service.searchStudent(id), HttpStatus.OK);
	}

	@GetMapping("/searchStudent")
	public ResponseEntity<Student> searchStudent(@RequestParam("id") int id) {
		return new ResponseEntity<Student>(service.searchStudent(id), HttpStatus.OK);
	}
	
	@PutMapping("/updateStudent")
	public ResponseEntity<Student> updateStudent1(Student student) {
		return new ResponseEntity<Student>(service.updateStudent(student), HttpStatus.OK);
	}

	@PostMapping("/updateStudent")
	public ResponseEntity<Student> updateStudent(Student student) {
		return new ResponseEntity<Student>(service.updateStudent(student), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent1(@PathVariable("id") int id) {
		return service.deleteStudent(id);
	}

	@PostMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("id") int id) {
		return service.deleteStudent(id);
	}
	@GetMapping("/fetchAllStudent")
	public ResponseEntity<List<Student>> fetchAllStudent() {

		return new ResponseEntity<List<Student>>(service.fetchAllStudent(), HttpStatus.OK);
	}

	@RequestMapping("/redirect")
	public ModelAndView redirect(@RequestParam("click") String value) {
		System.out.println(value);
		ModelAndView mv = new ModelAndView();
		if (value.equals("ADD"))
			mv.setViewName("add");
		else if (value.equals("DELETE"))
			mv.setViewName("delete");
		else if (value.equals("SEARCH"))
			mv.setViewName("search");
		else if (value.equals("VIEW"))
			mv.setViewName("view");
		else if (value.equals("UPDATE"))
			mv.setViewName("update");
		else {
			System.out.println("else case "+ value);
			mv.setViewName("welcome");
		}
		return mv;
	}

}
