package it.lmarconi.receiptmanager.receiptitem;

import it.lmarconi.receiptmanager.item.Item;
import it.lmarconi.receiptmanager.receipt.Receipt;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rm_receipt_item")
@Getter
@Setter
@NoArgsConstructor
public class ReceiptItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private long itemId;

    @Column(name = "item_amount")
    private int itemAmount;

    @ManyToOne
    @JoinColumn(name = "item_name")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "receipt_id")
    private Receipt receipt;

}
