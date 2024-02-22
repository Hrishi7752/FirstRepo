package in.ashokIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokIt.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
