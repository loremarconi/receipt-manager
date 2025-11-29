package it.lmarconi.receiptmanager.store;

import it.lmarconi.receiptmanager.employee.Employee;

import java.util.List;

public record StoreDTO(long storeId,
                       String city,
                       String address,
                       String phoneNumber,
                       String email,
                       List<Employee> employees) {

}
