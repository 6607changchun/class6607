package com.class6607.changchun103.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factory implements Serializable {

    @Serial
    private static final long serialVersionUID = -6300896953673101599L;
    private Integer fid;
    private String factoryName;
    private String factoryLocation;
    private List<Train> trains;
}
