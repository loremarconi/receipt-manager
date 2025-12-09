package it.lmarconi.receiptmanager.role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

}
