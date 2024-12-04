package br.edu.ifgoiano.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet <ActionRequest> extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String responsavel = req.getParameter("responsavel");
		String nome = req.getParameter("nome");
		String telefone = req.getParameter("telefone");
		
		req.setAttribute("responsavel", responsavel);
		req.setAttribute("nome", nome);
		req.setAttribute("telefone", telefone);
		
		req.getRequestDispatcher("Cadastrado.jsp")
		.forward(req, resp);
		
		String html =  nome;
		
	}
}






