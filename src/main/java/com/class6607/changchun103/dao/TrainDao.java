package com.class6607.changchun103.dao;

import com.class6607.changchun103.beans.Factory;
import com.class6607.changchun103.beans.Train;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrainDao {
    List<Train> getAllTrains();
    Train getTrain(Integer tid);
    Factory getFactory(Integer tid);
}
