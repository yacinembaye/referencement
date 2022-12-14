package com.webgram.Referencement.Repository;

import com.webgram.Referencement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee  getByName ( String name  );


    Employee  findByName ( String  name );

}
