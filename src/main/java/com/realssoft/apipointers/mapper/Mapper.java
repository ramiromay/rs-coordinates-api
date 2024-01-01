package com.realssoft.apipointers.mapper;

public interface Mapper <E, DTO>
{

    E mapToEntity(DTO dto);
    DTO mapToDto(E entity);

}
