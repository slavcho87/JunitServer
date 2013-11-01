package iw7i;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;

public class JunitServidor  extends AbstractHandler {
	private Server server;
	
	/**
	 * Constructo de la clase JunitTest. Recibe como parametro
	 * el puerto del servidor
	 * @throws Exception 
	 */
	public JunitServidor(int puerto) throws Exception{
		server = new Server(puerto);
		server.setHandler(this);
		server.start();	
	}
	
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("<html><body><h2>Testing Web Services with junit</h2>");
        response.getWriter().println("</body></html>");
	}
}
