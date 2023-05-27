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
@WebServlet("/pragiee1")
public class updatejsp extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		String id=req.getParameter("id");
		int sid=Integer.parseInt(id);
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String phone=req.getParameter("phone");
		long phone1=Long.parseLong(phone);
		
		
		studentdto dto=new studentdto();
		dto.setSid(sid);
		dto.setSname(name);
		dto.setPhone_no(phone1);
		dto.setGender(gender);
		
		studentdao dao=new studentdao();
		dao.update(dto);
		List<studentdto> l1=dao.fetchall1();
		
		req.setAttribute("student", l1);
		resp.getWriter().print("<h1>data inserted</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.include(req, resp);
	}
}
