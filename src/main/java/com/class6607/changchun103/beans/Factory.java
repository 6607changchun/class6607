package com.class6607.changchun103.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factory {
    private Integer fid;
    private String factoryName;
    private String factoryLocation;
    private List<Train> trains;
}
