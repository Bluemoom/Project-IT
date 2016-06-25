package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.proxy.HibernateProxyHelper;

import dao.*;
import model.*;
import util.SentMail;

//Thêm sửa xóa lịch khám
//select caKham
//select ChiPhi in DichVu
//insert into PhieuDatLich
//select BenhNhan by benhNhanId -> getEmail
//sent email to BenhNhan
//update trangThai caKham

@WebServlet("/DatLichController")
public class DatLichController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        
        CaKhamDAO caKhamDAO = new CaKhamDAOImpl();
        DichVuDAO dichVuDAO = new DichVuDAOImpl();
        PhieuDatLichDAO phieuDatLichDAO = new PhieuDatLichDAOIpml();
        BenhNhanDAO benhNhanDAO = new BenhNhanDAOImpl();
       
        
        String command = request.getParameter("command");
        
        if(command.equalsIgnoreCase("addNew")) {
        	int caKhamId = Integer.parseInt(request.getParameter("caKham_Id"));
			String phongKhamId = request.getParameter("phongKham_Id");
			int benhNhanId = 100000; //set tam thoi
			String dichVuId = request.getParameter("dichVu_Id");			
			DichVu dichVu = dichVuDAO.findDichVuById(dichVuId);
			
			PhieuDatLich phieuDatLich = new PhieuDatLich(phongKhamId, benhNhanId, caKhamId, 0, dichVu.getChiPhi(),1, 1);
			int result = phieuDatLichDAO.addNewPhieuDatLich(phieuDatLich);			
			
			int maPhieuDatLich = phieuDatLichDAO.findLastestPhieuDatLichByBenhNhan(benhNhanId).getPhieuDatLich_Id();
			String email = benhNhanDAO.findBenhNhanById(benhNhanId).getEmail();
			
			try {
				SentMail.send("smtp.gmail.com", email, "tq1417@gmail.com", "quyenthuan1714", "Ma dat lich", "Ma dat lich cua ban la: MSPDL"+maPhieuDatLich+"");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			result = caKhamDAO.updateCaKham(caKhamId, 0); 
			
			RequestDispatcher rd = request.getRequestDispatcher("DatLichThanhCong.jsp");
	        rd.forward(request, response);	
        }
        
        else if(command.equalsIgnoreCase("delete")) {
        	int phieuDatLichId = Integer.parseInt(request.getParameter("phieuDatLich_Id"));
        	int result = phieuDatLichDAO.deletePhieuDatLich(phieuDatLichId);
        	
        	PhieuDatLich phieuDatLich = phieuDatLichDAO.findPhieuDatLichById(phieuDatLichId);
        	int caKhamId = phieuDatLich.getCaKham_Id();
        	result = caKhamDAO.updateCaKham(caKhamId, 1);
        	
        	RequestDispatcher rd = request.getRequestDispatcher("/DanhSachLichKham.jsp");
	        rd.forward(request, response);	
        }
        else if(command.equalsIgnoreCase("viewDetail")) {
        	
        }
        else if(command.equalsIgnoreCase("delete")) {
        	
        }	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
