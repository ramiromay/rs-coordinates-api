package com.example.apipointers.controller;

import com.example.apipointers.model.dto.CoordinateDTO;
import com.example.apipointers.service.impl.CoordinateServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/coordinates")
@RequiredArgsConstructor
public class CoordinateController
{

    private final CoordinateServiceImpl coordinateService;

    @GetMapping
    public ResponseEntity<Page<CoordinateDTO>> getAllCoordinates(
            @RequestParam (value = "page", defaultValue = "1", required = false) Integer page,
            @RequestParam (value = "size", defaultValue = "10", required = false) Integer size,
            @RequestParam (value = "sortBy", defaultValue = "id", required = false) String sortBy,
            @RequestParam (value = "sortOrder", defaultValue = "ASC", required = false) Sort.Direction sortOrder
    )
    {
        Sort sort = sortOrder.isAscending()
                ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<CoordinateDTO> coordinates = coordinateService.findAllCoordinates(pageable);
        return new ResponseEntity<>(coordinates, HttpStatus.OK);
    }

}
