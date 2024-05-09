package com.estate.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="estate")
@Table(name="estate")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstateEntity {
    @Id
    private Integer sequence;
    private String local;
    private String yearMonth;
    private Integer sale;                                         // 매매가
    private Integer lease;                                       // 전세가
    private Integer monthRent;                            // 월세 보증금
    private Integer monthRentFee;                     // 월세가
    private Double return40;                                 // 40m^2 이하 수익률
    private Double return4060;                             // 40m^2  초과 60m^2 이하 수익률
    private Double return6085;                             // 60m^2  초과 85m^2 이하 수익률
    private Double return85;                                  // 85m^2  초과 수익률
    private Double leaseRatio40;                        // 40m^2 이하 매매가 대비 전세가 비율
    private Double leaseRatio4060;                   // 40m^2 초과 60m^2 이하 매매가 대비 전세가 비율
    private Double leaseRatio6085;                    // 60m^2 초과 85m^2 이하 매매가 대비 전세가 비율
    private Double leaseRatio85;                         // 85m^2 초과 매매가 대비 전세가 비율
    private Double leaseRentRatio40;                // 40m^2 이하 전세가 대비 월세 보증금 비율
    private Double leaseRentRatio4060;           // 40m^2 초과 60m^2 이하 전세가 대비 월세 보증금 비율
    private Double leaseRentRatio6085;           // 60m^2 초과 85m^2 이하 전세가 대비 월세 보증금 비율
    private Double leaseRentRatio85;                // 85m^2 초과 전세가 대비 월세 보증금 비율
}
