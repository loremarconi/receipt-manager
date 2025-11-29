package it.lmarconi.receiptmanager.receipt;

import it.lmarconi.receiptmanager.employee.Employee;
import it.lmarconi.receiptmanager.item.Item;
import it.lmarconi.receiptmanager.receiptitem.ReceiptItem;
import it.lmarconi.receiptmanager.store.Store;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record ReceiptDTO(long receiptId,
                         BigDecimal totalAmount,
                         LocalDateTime transactionDate,
                         Store store,
                         Employee employee,
                         List<ReceiptItem> receiptItems) {
}
