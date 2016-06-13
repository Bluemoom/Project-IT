package ProjectIT_DKKhamBenhTrucTuyen.controller;

import ProjectIT_DKKhamBenhTrucTuyen.data.*;
import ProjectIT_DKKhamBenhTrucTuyen.service.PhieuDatLichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/PhieuDatLich")
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

    @RequestMapping(value = "/list/{benhNhanId}",method = RequestMethod.GET)
    public String getPhieuDatLichByBenhNhanId(@PathVariable long benhNhanId,Model model) {
        List<Object[]> lst = (List<Object[]>) phieuDatLichService.findLichKhamByBenhNhanId(benhNhanId);


        List<LichKham> listLichKham = new ArrayList<LichKham>();
        for (Object o[] : lst) {
            PhieuDatLich p = (PhieuDatLich) o[0];
            CaLam calam = (CaLam) o[1];
            LichBieu l = (LichBieu) o[2];
            PhongKham pk = (PhongKham) o[3];
            BacSi b = (BacSi) o[4];
            LichKham temp = new LichKham();
            temp.setLichKhamId(p.getPhieuDatLichId());
            temp.setNgayKham(l.getNgayLam());
            temp.setBuoiKham(l.getBuoiLam());
            temp.setPhongKham(pk.getTenPhongKham());
            temp.setThoiGianKham(p.getThoiGianBatDau());
            temp.setBacSiKham(b.getHoTen());
            listLichKham.add(temp);
        }
        model.addAttribute("listLichKham",listLichKham);

        return "PhieuDatLich/list";
    }

    @RequestMapping(value="/Huy/{phieuDatLichId}",method = RequestMethod.GET)
    public String huyPhieuDatLich(@PathVariable long phieuDatLichId) {
        phieuDatLichService.capNhatTrangThaiPhieuDatLich(phieuDatLichId,2);
        return "redirect:/PhieuDatLich/list/3";
    }

}
