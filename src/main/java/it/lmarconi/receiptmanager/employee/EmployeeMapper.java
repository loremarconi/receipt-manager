package it.lmarconi.receiptmanager.employee;

import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {

    public EmployeeDTO toDto(Employee employee);

    public Employee toEntity(EmployeeDTO employeeDTO);

}
