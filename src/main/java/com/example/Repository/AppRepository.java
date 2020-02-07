package com.example.Repository;
import org.springframework.stereotype.Repository;
import com.example.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AppRepository extends JpaRepository<Employee,Integer> {

	

}
