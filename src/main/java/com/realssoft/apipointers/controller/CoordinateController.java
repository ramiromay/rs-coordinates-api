package com.realssoft.apipointers.controller;

import com.realssoft.apipointers.model.dto.CoordinateDTO;
import com.realssoft.apipointers.service.impl.CoordinateServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1/coordinates")
@RequiredArgsConstructor
public class CoordinateController
{

    private final CoordinateServiceImpl coordinateService;

    @GetMapping
    public ResponseEntity<List<CoordinateDTO>> getAllCoordinates()
    {
        List<CoordinateDTO> coordinates = coordinateService.findAllCoordinates();
        return new ResponseEntity<>(coordinates, HttpStatus.OK);
    }

}
