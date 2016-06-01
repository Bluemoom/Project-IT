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
import java.util.concurrent.atomic.AtomicLong;


@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    public void setPatientRepository(PatientService patientService){
        this.patientService = patientService;
    }

    //TODO: show a list of Patient
    @RequestMapping(value="",method = RequestMethod.GET)
    public String listPatients(Model model) {
        model.addAttribute("patients",patientService.listAllPatient());
        return "patients/list";
    }

    @RequestMapping(value="/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        patientService.deletePatient(id);
        return new ModelAndView("redirect:/patients");
    }

    @RequestMapping(value="new",method = RequestMethod.GET)
    public String newProject(){
        return "patients/new";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("name") String name) {
        patientService.savePatient(new Patient(name));
        return  new ModelAndView("redirect:/patients");
    }

    @RequestMapping(value="/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        Patient patientEntity = patientService.getPatientById(id);
        model.addAttribute("patient",patientEntity);
        return "patients/edit";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("patient_id") long id,
                               @RequestParam("name") String name){
        Patient patientEntity = patientService.getPatientById(id);
        patientEntity.setName(name);
        patientService.savePatient(patientEntity);
        return new ModelAndView("redirect:/patients");
    }
}
