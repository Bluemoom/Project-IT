package Higgsup_qlbv.controller;

import Higgsup_qlbv.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;
    @Autowired
    public void setDoctorService(DoctorService doctorService) {this.doctorService=doctorService;}

    @RequestMapping(value="",method = RequestMethod.GET)
    public String listDoctors(Model model) {
        model.addAttribute("doctors",doctorService.listAllDoctor());
        return "doctors/list";
    }


}
