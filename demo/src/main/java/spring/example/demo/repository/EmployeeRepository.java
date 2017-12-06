package spring.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
