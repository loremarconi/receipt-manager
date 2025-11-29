package it.lmarconi.receiptmanager.item;

import org.mapstruct.Mapper;

@Mapper
public interface ItemMapper {

    public ItemDTO toDto(Item item);

    public Item toEntity(ItemDTO itemDTO);

}
