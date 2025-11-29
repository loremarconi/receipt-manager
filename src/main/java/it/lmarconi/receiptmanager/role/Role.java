package it.lmarconi.receiptmanager.role;

import it.lmarconi.receiptmanager.employee.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "rm_role")
@Getter
@Setter
@NoArgsConstructor
public class Role {

    @Id
    @Column(name = "role_id")
    private String roleId;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Employee> employees;

}
