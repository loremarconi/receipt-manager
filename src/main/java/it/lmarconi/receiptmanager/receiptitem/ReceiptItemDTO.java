package it.lmarconi.receiptmanager.receiptitem;

import it.lmarconi.receiptmanager.item.Item;
import it.lmarconi.receiptmanager.receipt.Receipt;

public record ReceiptItemDTO(long itemId,
                             int itemAmount,
                             Item item,
                             Receipt receipt) {
}
