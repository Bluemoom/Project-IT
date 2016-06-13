package ProjectIT_DKKhamBenhTrucTuyen.controller;

import ProjectIT_DKKhamBenhTrucTuyen.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DichVuController {
    @Autowired
    private DichVuService dichVuService;

    @Autowired
    private void setDichVuService(DichVuService dichVuService){this.dichVuService=dichVuService;}




}
