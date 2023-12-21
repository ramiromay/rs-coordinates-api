package com.example.apipointers.service.impl;

import com.example.apipointers.mapper.impl.CoordinateMapperImpl;
import com.example.apipointers.model.dto.CoordinateDTO;
import com.example.apipointers.persistence.entity.Coordinate;
import com.example.apipointers.persistence.repository.CoordinateRepository;
import com.example.apipointers.service.CoordinateService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CoordinateServiceImpl implements CoordinateService
{


    private final CoordinateRepository coordinateRepository;
    private final CoordinateMapperImpl coordinateMapper;

    @Override
    public Page<CoordinateDTO> findAllCoordinates(Pageable  pageable)
    {
        Page<Coordinate> page = coordinateRepository.findAll(pageable);
        List<CoordinateDTO> coordinates = page.getContent()
                .stream()
                .map(coordinateMapper::mapToDto)
                .toList();
        return new PageImpl<>(coordinates, pageable, page.getTotalElements());
    }

}
