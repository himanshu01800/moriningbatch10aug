package com.example.use.repository;

import com.example.use.entity.Standered;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StanderedRepository extends JpaRepository<Standered,Integer> {
}
