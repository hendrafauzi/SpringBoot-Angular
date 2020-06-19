package com.hendra.fullstack.repository;

import com.hendra.fullstack.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    //Repository of Employee
}
