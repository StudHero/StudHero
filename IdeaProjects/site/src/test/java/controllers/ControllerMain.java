package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by bohdan on 05.12.15.
 */
@Controller
public class ControllerMain {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List <Test> (ModelMap model){
        return "test";
    }
}
