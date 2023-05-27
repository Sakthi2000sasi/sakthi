package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.studentdao;
import dto.studentdto;


@WebServlet("/pragiee")
public class fetchall1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		studentdao dao=new studentdao();
	   List<studentdto>	d=dao.fetchall1();
	   
	   
	   req.setAttribute("student", d);
	   
	   RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
	   rd.forward(req, resp);
	   
	   
	   
	   
	   for(studentdto dto:d) {
		   resp.getWriter().print("dto");
	   }
	}

	
}
