package Higgsup_qlbv.controller;

import Higgsup_qlbv.data.Patient;
import Higgsup_qlbv.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunny on 30/05/2016.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/patientsrest")
public class PatientRestController {
    @Autowired
    PatientService patientService;
    @Autowired
    public void setPatientService(PatientService patientService) {this.patientService = patientService;}

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Patient> getAll(){
        return (List<Patient>) patientService.listAllPatient();
    }

    @RequestMapping(value ="new",method = RequestMethod.GET)
    public String newProject() {return "patientsrest/new";}

    @RequestMapping(value="/create",method = RequestMethod.POST)
    public ModelAndView create(@RequestBody Patient patient){
        patientService.savePatient(patient);
        return new ModelAndView("redirect:/patientsrest");
    }

    @RequestMapping(value = "/{id}/delete",method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id)    {
        patientService.deletePatient(id);
        return new ModelAndView("redicrect:/patientsrest");
    }

    @RequestMapping(value = "{id}/edit",method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient",patient);
        return "patientsrest/edit";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("patient_id") long id,
                               @RequestParam("name") String name){
        Patient patientEntity = patientService.getPatientById(id);
        patientEntity.setName(name);
        patientService.savePatient(patientEntity);
        return new ModelAndView("redirect:/patientsrest");
    }


}
