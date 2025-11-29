package it.lmarconi.receiptmanager.employee;

import it.lmarconi.receiptmanager.role.Role;
import it.lmarconi.receiptmanager.store.Store;

import java.time.LocalDateTime;

public record EmployeeDTO(long employeeId,
                          String firstName,
                          String lastName,
                          LocalDateTime startDate,
                          Role role,
                          Store store) {

}
