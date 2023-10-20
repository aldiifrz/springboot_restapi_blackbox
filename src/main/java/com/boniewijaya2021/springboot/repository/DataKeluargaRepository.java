package com.boniewijaya2021.springboot.repository;

import com.boniewijaya2021.springboot.entity.DataKeluarga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DataKeluargaRepository extends JpaRepository<DataKeluarga, Long> {
}
