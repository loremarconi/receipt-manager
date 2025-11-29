package it.lmarconi.receiptmanager.store;

import it.lmarconi.receiptmanager.employee.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "rm_store")
@Getter
@Setter
@NoArgsConstructor
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private long storeId;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "store", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Employee> employees;

}
