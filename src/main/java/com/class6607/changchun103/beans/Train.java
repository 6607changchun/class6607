package com.class6607.changchun103.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Train implements Serializable {

    @Serial
    private static final long serialVersionUID = -5479314192085296627L;
    private Integer tid;
    private String typeName;
    private Integer maxSpeed;
    private String publicName;
    private Factory factory;
}
