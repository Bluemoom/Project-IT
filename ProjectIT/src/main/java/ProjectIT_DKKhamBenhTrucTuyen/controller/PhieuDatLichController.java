package ProjectIT_DKKhamBenhTrucTuyen.controller;

import ProjectIT_DKKhamBenhTrucTuyen.data.PhieuDatLich;
import ProjectIT_DKKhamBenhTrucTuyen.service.PhieuDatLichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/LichKham")
public class PhieuDatLichController {
    @Autowired
    private PhieuDatLichService phieuDatLichService;
    @Autowired
    public void setPhieuDatLichService(PhieuDatLichService phieuDatLichService) {this.phieuDatLichService = phieuDatLichService;}

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("listLichKham");
        return "LichKham/list";
    }
}
