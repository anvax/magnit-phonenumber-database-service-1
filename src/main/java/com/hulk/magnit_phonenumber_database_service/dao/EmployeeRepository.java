package com.hulk.magnit_phonenumber_database_service.dao;

import com.hulk.magnit_phonenumber_database_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}