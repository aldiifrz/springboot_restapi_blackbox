package com.boniewijaya2021.springboot.repository;

import com.boniewijaya2021.springboot.entity.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {

}
