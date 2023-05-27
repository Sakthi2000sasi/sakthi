package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.studentdao;

@WebServlet("/delete")
public class studentdelete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		
		String id=req.getParameter("id");
		int sid=Integer.parseInt(id);
		
		
		studentdao dao=new studentdao();
		dao.delete(sid);
	}

}
