package it.lmarconi.receiptmanager.employee;

import it.lmarconi.receiptmanager.receipt.Receipt;
import it.lmarconi.receiptmanager.role.Role;
import it.lmarconi.receiptmanager.store.Store;

import java.time.LocalDateTime;
import java.util.List;

public record EmployeeDTO(long employeeId,
                          String firstName,
                          String lastName,
                          LocalDateTime startDate,
                          Role role,
                          Store store,
                          List<Receipt> receipts) {

}
