package com.example.apipointers.mapper;

public interface Mapper <E, DTO>
{

    E mapToEntity(DTO dto);
    DTO mapToDto(E entity);

}
