package com.assignment.controller;



import com.assignment.model.Staffs;
import com.assignment.service.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StaffsController {
    @Autowired
    private StaffsService staffsService;
    @GetMapping("/staffs")
    public ModelAndView listProvinces(){
        Iterable<Staffs> staffs = staffsService.findAll();
        ModelAndView modelAndView = new ModelAndView("/staffs/list");
        modelAndView.addObject("staffs", staffs);
        return modelAndView;
    }
    @GetMapping("/create-staffs")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("staffs/create");
        modelAndView.addObject("staffs", new Staffs());
        return modelAndView;
    }

    @PostMapping("/create-staffs")
    public ModelAndView saveProvince(@ModelAttribute("staffs") Staffs staffs){
        staffsService.save(staffs);

        ModelAndView modelAndView = new ModelAndView("/staffs/create");
        modelAndView.addObject("staffs", new Staffs());
        modelAndView.addObject("message", "New staff created successfully");
        return modelAndView;
    }

}
