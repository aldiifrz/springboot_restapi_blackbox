package com.boniewijaya2021.springboot.entity;

import lombok.*;

import javax.persistence.*;

import java.time.LocalDate;


@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "karyawan", schema = "sample")
public class Karyawan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nama_karyawan")
    private String namaKaryawan;

    @Column(name = "nik")
    private String nik;

    @Column(name = "tanggal_lahir")
    private LocalDate tanggalLahir;

    @Column(name = "nomor_kk")
    private String nomorKk;

    // Getter dan Setter
}
