package com.realssoft.apipointers.persistence.repository;

import com.realssoft.apipointers.persistence.entity.Coordinate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinateRepository extends JpaRepository<Coordinate, Long>
{

}
