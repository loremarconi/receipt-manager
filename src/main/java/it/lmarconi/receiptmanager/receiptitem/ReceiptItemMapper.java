package it.lmarconi.receiptmanager.receiptitem;

import org.mapstruct.Mapper;

@Mapper
public interface ReceiptItemMapper {

    public ReceiptItemDTO toDto(ReceiptItem receiptItem);

    public ReceiptItem toEntity(ReceiptItemDTO receiptItemDTO);

}
