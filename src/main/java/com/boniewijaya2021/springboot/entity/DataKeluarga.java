package com.boniewijaya2021.springboot.entity;

import lombok.*;

import javax.persistence.*;



@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "data_keluarga", schema = "sample")
public class DataKeluarga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomor_kk")
    private String nomorKk;

    @Column(name = "nama_keluarga")
    private String namaKeluarga;

    @Column(name = "hubungan_keluarga")
    private String hubunganKeluarga;

    @Column(name = "nik_anggota")
    private String nikAnggota;

    // Getter dan Setter

}
