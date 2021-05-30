package com.class6607.changchun103.controller;

import com.class6607.changchun103.beans.Train;
import com.class6607.changchun103.dao.TrainDao;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/train")
public class IndexController {

    private TrainDao trainDao;
    private Gson gson = new Gson();

    @Autowired
    public void setTrainDao(TrainDao trainDao) {
        this.trainDao = trainDao;
    }

    @GetMapping("")
    public String getTrains(Model model){
        List<Train> trains = trainDao.getAllTrains();
        String s = gson.toJson(trains);
        model.addAttribute("trains",s);
        return "thymeleaf/index";
    }

}
