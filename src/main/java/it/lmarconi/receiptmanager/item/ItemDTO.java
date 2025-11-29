package it.lmarconi.receiptmanager.item;

import it.lmarconi.receiptmanager.receiptitem.ReceiptItem;

import java.math.BigDecimal;
import java.util.List;

public record ItemDTO(String itemName,
                      String description,
                      BigDecimal price,
                      List<ReceiptItem> receiptItems) {
}
