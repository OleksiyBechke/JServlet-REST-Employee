package org.example.app.repository.employee;


import org.example.app.dto.employee.EmployeeDtoRequest;
import org.example.app.entity.Employee;
import org.example.app.repository.BaseRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends BaseRepository<Employee, EmployeeDtoRequest> {
    void save(EmployeeDtoRequest request);
    Optional<List<Employee>> getAll();

    // ---- Path Params ----------------------

    Optional<Employee> getById(Long id);
    void update(Long id, EmployeeDtoRequest request);
    boolean deleteById(Long id);

    // ---- Utils ----------------------

    Optional<Employee> getLastEntity();

}
