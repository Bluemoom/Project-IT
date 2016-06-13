package ProjectIT_DKKhamBenhTrucTuyen.controller;

import ProjectIT_DKKhamBenhTrucTuyen.data.DichVu;
import ProjectIT_DKKhamBenhTrucTuyen.service.DichVuService;
import ProjectIT_DKKhamBenhTrucTuyen.service.PhongKhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/PhongKham")
public class PhongKhamController {
    @Autowired
    private PhongKhamService phongKhamService;

    @Autowired
    private DichVuService dichVuService;

    @Autowired
    public void setPhongKhamService (PhongKhamService phongKhamService) {this.phongKhamService = phongKhamService;}

    @Autowired
    public void setDichVuService (DichVuService dichVuService) {this.dichVuService = dichVuService;}

    @RequestMapping(value = "/FindByDichVu/{dichVuId}",method = RequestMethod.GET)
    public String findPhongKhamByDichVuId(@PathVariable long dichVuId, Model model){
        model.addAttribute("listPhongKham",phongKhamService.findPhongKhamByDichVuId(dichVuId));
        //model.addAttribute("dichVu",dichVuService.findDichVubyID(dichVuId));
        return "PhongKham/list";
    }
}
