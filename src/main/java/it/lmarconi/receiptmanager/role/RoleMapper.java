package it.lmarconi.receiptmanager.role;

import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper {

    public RoleDTO toDto(Role role);

    public Role toEntity(RoleDTO roleDTO);

}
