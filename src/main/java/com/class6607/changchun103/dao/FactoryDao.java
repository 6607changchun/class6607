package com.class6607.changchun103.dao;

import com.class6607.changchun103.beans.Factory;
import com.class6607.changchun103.beans.Train;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FactoryDao {

    List<Factory> getAllFactory();
    @Select("select fid,factoryName,factoryLocation from factory where fid=#{fid}")
    Factory getFactory(Integer fid);
    List<Train> getTrains(Integer fid);
}
