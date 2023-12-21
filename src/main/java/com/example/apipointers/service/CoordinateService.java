package com.example.apipointers.service;

import com.example.apipointers.model.dto.CoordinateDTO;
import com.example.apipointers.persistence.entity.Coordinate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface CoordinateService
{

    Page<CoordinateDTO> findAllCoordinates(Pageable pageable);

}
