package com.realssoft.apipointers.mapper.impl;

import com.realssoft.apipointers.mapper.Mapper;
import com.realssoft.apipointers.model.dto.CoordinateDTO;
import com.realssoft.apipointers.persistence.entity.Coordinate;
import org.springframework.stereotype.Service;

@Service
public class CoordinateMapperImpl
        implements Mapper<Coordinate, CoordinateDTO>
{

    @Override
    public Coordinate mapToEntity(CoordinateDTO coordinateDTO)
    {
        return null;
    }

    @Override
    public CoordinateDTO mapToDto(Coordinate entity)
    {
        return CoordinateDTO.builder()
                .lat(entity.getLat())
                .lng(entity.getLng())
                .date(entity.getDate())
                .build();
    }

}
