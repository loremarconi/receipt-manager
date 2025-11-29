package it.lmarconi.receiptmanager.item;

import it.lmarconi.receiptmanager.receiptitem.ReceiptItem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "rm_item")
@Getter
@Setter
@NoArgsConstructor
public class Item {

    @Id
    @Column(name = "item_name")
    private String itemName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ReceiptItem> receiptItems;

}
