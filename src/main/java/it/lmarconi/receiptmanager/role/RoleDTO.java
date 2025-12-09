package it.lmarconi.receiptmanager.role;

import it.lmarconi.receiptmanager.employee.Employee;

import java.util.List;

public record RoleDTO(String roleId,
                      String description,
                      List<Employee> employees) {
}
