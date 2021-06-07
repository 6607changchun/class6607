package com.class6607.changchun103.dao;

import com.class6607.changchun103.beans.Factory;
import com.class6607.changchun103.beans.Train;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
public interface TrainDao {
    @Results(
            id = "TrainFactoryMapping",
            value = {
                    @Result(property = "tid",column = "tid",id = true),
                    @Result(property = "typeName",column = "typename"),
                    @Result(property = "maxSpeed",column = "maxSpeed"),
                    @Result(property = "publicName",column = "publicName"),
                    @Result(property = "factory",column = "fid",javaType = Factory.class,
                            one = @One(select = "com.class6607.changchun103.dao.FactoryDao.getFactory",
                                        fetchType = FetchType.LAZY
                            )
                    )
            }
    )
    @Select("select tid,typename,maxSpeed,publicName,fid from train")
    @Cacheable(value = "trains")
    List<Train> getAllTrains();
    Train getTrain(Integer tid);
    Factory getFactory(Integer tid);
}
