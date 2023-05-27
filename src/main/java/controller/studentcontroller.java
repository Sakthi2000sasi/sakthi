package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.studentdao;
import dto.studentdto;

@WebServlet("/insert")
public class studentcontroller extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid=req.getParameter("sid");
        String	sname=req.getParameter("sname");
        int sid1 =Integer.parseInt(sid);
        String gender=req.getParameter("gender");
        String phone=req.getParameter("phone_no");
        
         long phone1=Long.parseLong(phone);
             
             
             studentdto dto=new studentdto();
             dto.setSid(sid1);
             dto.setSname(sname);
             dto.setGender(gender);
             dto.setPhone_no(phone1);
             
             studentdao dao=new studentdao();
             String msg=dao.insert(dto);
             res.getWriter().print(msg);
             
		
		
	}

}
