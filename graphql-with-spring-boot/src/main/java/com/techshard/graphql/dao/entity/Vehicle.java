package com.techshard.graphql.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle implements Serializable {

    private int id;

    private String type;

    private String modelCode;

    private String brandName;

}
