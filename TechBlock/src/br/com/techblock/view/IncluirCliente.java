package br.com.techblock.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Autor Daniela e Danilo
 */

/**
 * Servlet implementation class IncluirCliente
 */
@WebServlet("/IncluirCliente")
public class IncluirCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String get_name=request.getParameter("nome");
		String get_cpfcnpj=request.getParameter("cpfcnpj");
		String get_responsavel=request.getParameter("responsavel");
		String get_numeroconta=request.getParameter("numeroconta");
		String get_banco=request.getParameter("banco");
		String get_endereco=request.getParameter("endereco");
		String get_telefone1=request.getParameter("telefone1");
		String get_telefone2=request.getParameter("telefone2");
		String get_email=request.getParameter("email");
		String get_senha=request.getParameter("senha");
		String get_senha1=request.getParameter("senha1");
		
		writer.println("<h1>Seus dados cadastrados</h1>");
		writer.println("<p>Confira todas os seus dados antes de finalizar :)</p>");
		writer.println("<span>Nome: </span>" + get_name);
		writer.println("<span>E-mail: </span>" + get_cpfcnpj);
		writer.println("<span>Respons�vel: </span>" + get_responsavel);
		writer.println("<span>N�mero da conta: </span>" + get_numeroconta);
		writer.println("<span>Banco: </span>" + get_banco);
		writer.println("<span>Endere�o: </span>" + get_endereco);
		writer.println("<span>Telefone: </span>" + get_telefone1);
		writer.println("<span>Telefone: </span>" + get_telefone2);
		writer.println("<span>E-mail: </span>" + get_email);
		writer.println("<span>Senha: </span>" + get_senha);
		writer.println("<span>Repetir senha: </span>" + get_senha1);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
