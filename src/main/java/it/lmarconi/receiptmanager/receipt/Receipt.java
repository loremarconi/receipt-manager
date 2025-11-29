package it.lmarconi.receiptmanager.receipt;

import it.lmarconi.receiptmanager.employee.Employee;
import it.lmarconi.receiptmanager.receiptitem.ReceiptItem;
import it.lmarconi.receiptmanager.store.Store;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "rm_receipt")
@Getter
@Setter
@NoArgsConstructor
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receipt_id")
    private long receiptId;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToMany(mappedBy = "receipt", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ReceiptItem> receiptItems;

}
