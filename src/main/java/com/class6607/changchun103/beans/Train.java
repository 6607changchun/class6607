package com.class6607.changchun103.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Train {
    private Integer tid;
    private String typeName;
    private Integer maxSpeed;
    private String publicName;
    private Factory factory;
}
