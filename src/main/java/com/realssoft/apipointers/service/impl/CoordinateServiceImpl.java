package com.realssoft.apipointers.service.impl;

import com.realssoft.apipointers.mapper.impl.CoordinateMapperImpl;
import com.realssoft.apipointers.model.dto.CoordinateDTO;
import com.realssoft.apipointers.persistence.entity.Coordinate;
import com.realssoft.apipointers.persistence.repository.CoordinateRepository;
import com.realssoft.apipointers.service.CoordinateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CoordinateServiceImpl implements CoordinateService
{


    private final CoordinateRepository coordinateRepository;
    private final CoordinateMapperImpl coordinateMapper;

    @Override
    public List<CoordinateDTO> findAllCoordinates()
    {
        List<Coordinate> coordinates = coordinateRepository.findAll();
        return coordinates
                .stream()
                .map(coordinateMapper::mapToDto)
                .toList();
    }

}
