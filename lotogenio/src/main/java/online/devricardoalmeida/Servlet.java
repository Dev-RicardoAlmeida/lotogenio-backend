package online.devricardoalmeida;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

import java.io.IOException;

import com.google.gson.Gson;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
        java.util.List<Integer> numeros;

        if ("lotofacil".equalsIgnoreCase(tipo)) {
            numeros = Sorteador.gerarLotoFacil();
        } else {
            numeros = Sorteador.gerarSena(); // padrão
        }
        
        // Retorna como JSON para o JavaScript
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Formata a resposta em JSON usando
        String json = new Gson().toJson(numeros); // Use a lib Gson do Google
        response.getWriter().write(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
