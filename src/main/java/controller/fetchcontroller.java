package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.studentdao;
import dto.studentdto;

@WebServlet("/fetch")
public class fetchcontroller extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid=req.getParameter("sid");
		int sid1=Integer.parseInt(sid);
		
    	studentdao dao=new studentdao();
		studentdto de=dao.fetch(sid1);
		res.getWriter().print(de);
		
		
	
		
	}

}
