package com.realssoft.apipointers.service;

import com.realssoft.apipointers.model.dto.CoordinateDTO;
import java.util.List;

public interface CoordinateService
{

    List<CoordinateDTO> findAllCoordinates();

}
