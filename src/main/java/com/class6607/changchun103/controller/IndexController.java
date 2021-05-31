package com.class6607.changchun103.controller;

import com.class6607.changchun103.beans.Train;
import com.class6607.changchun103.dao.TrainDao;
import com.class6607.changchun103.util.ProxyConvert;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


@Controller
@RequestMapping("/train")
public class IndexController {

    private TrainDao trainDao;
    private Gson gson = new Gson();
    private ProxyConvert proxyConvert;

    @Autowired
    public void setTrainDao(TrainDao trainDao) {
        this.trainDao = trainDao;
    }

    @Autowired
    public void setProxyConvert(ProxyConvert proxyConvert) {
        this.proxyConvert = proxyConvert;
    }

    @GetMapping("")
    public String getTrains(Model model){
        List<Train> trains = trainDao.getAllTrains();
        for(int i = 0;i < trains.size();i++){
            Train train = trains.get(i);
            try {
                train = proxyConvert.convert(train,Train.class);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            trains.set(i,train);
        }
        String s = gson.toJson(trains);
        model.addAttribute("trains",s);
        return "thymeleaf/index";
    }

}
