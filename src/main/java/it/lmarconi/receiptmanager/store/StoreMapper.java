package it.lmarconi.receiptmanager.store;

import org.mapstruct.Mapper;

@Mapper
public interface StoreMapper {

    public StoreDTO toDto(Store store);

    public Store toEntity(StoreDTO storeDTO);

}
