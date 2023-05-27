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

@WebServlet("/fetchall")
public class fetchall extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		studentdao dao=new studentdao();
		List<studentdto> de=dao.fetchallByid();
		res.getWriter().print(de);
		
	}

}
