package com.unu.poo2.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.unu.poo2.model.AutoresModel;
import com.unu.poo2.beans.Autor;
import com.unu.poo2.controllers.AutoresController;

@WebServlet("/AutoresController")
public class AutoresController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AutoresModel modelo = new AutoresModel();
	
    public AutoresController() {
        super();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("op") == null) {
			listar (request, response);
			return;
		}
		String operacion = request.getParameter("op");
		switch (operacion) {

		case "listar":
			listar(request, response);
			break;

		case "nuevo":
			listar (request, response);
			break;

		}

	}
	
	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setAttribute("listaAutores", modelo.listarAutores());
			
			Iterator<Autor> it = modelo.listarAutores().iterator();
			while(it.hasNext()) {
				Autor a = it.next();
				System.out.println("Este es una prueba");
				System.out.println(a.getCodigoAutor()+" "+a.getNombreAutor()+" "+a.getNacionalidad());
			}
			request.getRequestDispatcher("/autores/listaAutores.jsp").forward(request, response);
			
		} catch (ServletException | IOException ex) {
			Logger.getLogger(AutoresController.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
