package it.lmarconi.receiptmanager.receipt;

import org.mapstruct.Mapper;

@Mapper
public interface ReceiptMapper {

    public ReceiptDTO toDto(Receipt receipt);

    public Receipt toEntity(ReceiptDTO receiptDTO);

}
