package com.class6607.changchun103.util;

import org.springframework.stereotype.Component;

import java.lang.reflect.*;

@Component
public class ProxyConvert {

    public ProxyConvert(){}
    public <E>E convert(Object obj,Class toClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object resultObject = toClass.getConstructor().newInstance();
        Field[] fields = toClass.getDeclaredFields();
        for(Field field:fields){
            String fieldName = field.getName();
            StringBuffer stringBuffer1 = new StringBuffer("set");
            StringBuffer stringBuffer2 = new StringBuffer("get");
            stringBuffer1.append(fieldName.substring(0,1).toUpperCase());
            stringBuffer1.append(fieldName.substring(1));
            stringBuffer2.append(fieldName.substring(0,1).toUpperCase());
            stringBuffer2.append(fieldName.substring(1));
            Method setMethod = toClass.getMethod(stringBuffer1.toString(),field.getType());
            Method getMethod = toClass.getMethod(stringBuffer2.toString());
            setMethod.invoke(resultObject,getMethod.invoke(obj));
        }
        return (E)resultObject;
    }
}
