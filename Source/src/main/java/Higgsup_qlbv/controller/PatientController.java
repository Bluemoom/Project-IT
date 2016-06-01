package Higgsup_qlbv.controller;

import Higgsup_qlbv.data.Patient;
import Higgsup_qlbv.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;
    public void setPatientService(PatientService patientService) {this.patientService = patientService;}

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String lissAll(Model model) {
        model.addAttribute("patients",patientService.listAllPatient());
        return "patients/list";
    }

    @RequestMapping(value="/{id}/delete",method = RequestMethod.GET)
    public ModelAndView deletePatient(@PathVariable long id) {
        patientService.deletePatient(id);
        return new ModelAndView("redirect:/patients");
    }

    @RequestMapping(value="/new", method = RequestMethod.POST)
    public String newPatient() {
        return "patients/new";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ModelAndView createPatient(@RequestParam("fullName") String fullname,
                                      @RequestParam("userName") String username,
                                      @RequestParam("password") String password,
                                      @RequestParam("address") String address,
                                      @RequestParam("phoneNumber") String phoneNumber,
                                      @RequestParam("email") String email,
                                      @RequestParam("sex") int sex,
                                      @RequestParam("status") int status,
                                      @RequestParam("userType") int userType) {
        Patient patient= new Patient(fullname,username,password,address,phoneNumber,
                email,sex,status,userType);
        patientService.savePatient(patient);
        return new ModelAndView("redirect:/patients");
    }

    @RequestMapping(value="/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient",patient);
        return "patients/edit";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("patient_id") long id,
                               @RequestParam("fullName") String fullname,
                               @RequestParam("userName") String username,
                               @RequestParam("password") String password,
                               @RequestParam("address") String address,
                               @RequestParam("phoneNumber") String phoneNumber,
                               @RequestParam("email") String email,
                               @RequestParam("sex") int sex,
                               @RequestParam("status") int status,
                               @RequestParam("userType") int userType){
        Patient patient = patientService.getPatientById(id);
        patient.setFullName(fullname);
        patient.setUserName(username);
        patient.setPassword(password);
        patient.setAddress(address);
        patient.setPhoneNumber(phoneNumber);
        patient.setEmail(email);
        patient.setSex(sex);
        patient.setStatus(status);
        patient.setUserType(userType);
        patientService.savePatient(patient);
        return new ModelAndView("redirect:/patients");
    }
}
