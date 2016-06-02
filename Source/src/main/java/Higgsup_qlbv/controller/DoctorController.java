package Higgsup_qlbv.controller;

import Higgsup_qlbv.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/{id}/delete",method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id){
        doctorService.deleteDoctor(id);
        return new ModelAndView("redirect:/doctors");
    }


}
