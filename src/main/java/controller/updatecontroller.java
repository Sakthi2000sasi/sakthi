package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.studentdao;

@WebServlet("/update")
public class updatecontroller extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid=req.getParameter("sid");
		int sid1 =Integer.parseInt(sid);
		String phone=req.getParameter("phone_no");
		 long phone1=Long.parseLong(phone);
		 
//		  studentdao dao=new studentdao();
//		  dao.update(sid1,phone1);
		
	}

}
