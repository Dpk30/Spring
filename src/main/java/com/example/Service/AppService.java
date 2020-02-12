package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Student;
import com.example.Repository.AppRepository;

@Service
public class AppService {
	@Autowired
	AppRepository repo;

	public Student saveStudent(Student student) {
		repo.save(student);
		return student;
	}

	public Student searchStudent(int id) {
		Optional<Student> student = repo.findById(id);
		if (student.isPresent()) {

			System.out.println("Found");
			return student.get();
		}

		return student.get();
	}

	public Student updateStudent(Student student) {
		Optional<Student> entity = repo.findById(student.getId());

		if (entity.isPresent()) {
			Student stu = entity.get();
			stu.setId(student.getId());
			stu.setCourse(student.getCourse());
			stu.setName(student.getName());
			repo.save(stu);
		} else {
			repo.save(student);
		}

		return student;
	}

	public String deleteStudent(int id) {
		
		repo.deleteById(id);
		
		return "delete successfully";
		}

	public List<Student> fetchAllStudent() {
	
		return repo.findAll();
	}

}
