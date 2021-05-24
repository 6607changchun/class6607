package com.class6607.changchun103.controller;

import com.class6607.changchun103.beans.Expression;
import com.class6607.changchun103.config.TrainConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private TrainConfig trainConfig;

    @Autowired
    public void setTrainConfig(TrainConfig trainConfig) {
        this.trainConfig = trainConfig;
    }

    @RequestMapping("/name")
    public String getName(Model model){
        model.addAttribute("name",trainConfig.getName());
        return "/thymeleaf/index";
    }

    @RequestMapping("/expr")
    public String getExpr(Model model){
        model.addAttribute("expr",new Expression("test Expression","op1"));
        return "/thymeleaf/expression";
    }
}
