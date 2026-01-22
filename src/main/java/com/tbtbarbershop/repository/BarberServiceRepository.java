package com.tbtbarbershop.repository;

import com.tbtbarbershop.model.BarberService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberServiceRepository extends JpaRepository<BarberService, Long> {
}
