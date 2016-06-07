package Higgsup_qlbv.controller;

import Higgsup_qlbv.data.Doctor;
import Higgsup_qlbv.repository.DoctorRepository;
import Higgsup_qlbv.service.DoctorService;
import Higgsup_qlbv.service.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newDoctor(){ return "doctors/new"; }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("username") String username,@RequestParam("password") String password,
                               @RequestParam("status") int status){
        doctorService.saveDoctor(new Doctor(username,password,status));
        return new ModelAndView("redirect:/doctors");
    }

    @RequestMapping(value="/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        Doctor doctor = doctorService.getDoctorById(id);
        model.addAttribute("doctor", doctor);
        return "doctors/edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("doctor_id") long id,
                               @RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("status") int status){
        Doctor doctor = doctorService.getDoctorById(id);
        doctor.setUsername(username);
        doctor.setPassword(password);
        doctor.setStatus(status);
        doctorService.saveDoctor(doctor);
        return new ModelAndView("redirect:/doctors");
    }
}

