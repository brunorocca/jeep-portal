package br.com.isobar.jeep.portal.impl.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.ServletResolver;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.wrappers.SlingHttpServletRequestWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, metatype = true, label = "Concessionaria Servlet", description = "Concessionaria Servlet")
@Service
@Properties({
		@Property(name = "sling.servlet.paths", value = { "/painel/concessionaria" }),
		@Property(name = "sling.servlet.methods", value = { "GET", "POST", "PUT", "DELETE" }) })
public class ConcessionariaServlet extends SlingAllMethodsServlet {

	private static final long serialVersionUID = 8542332876733799623L;
	private static final Logger logger = LoggerFactory.getLogger(ConcessionariaServlet.class);
	
	@Reference
	private ServletResolver servletResolver;
	
	@Override
	protected void doGet(final SlingHttpServletRequest request,
			final SlingHttpServletResponse response) throws ServletException, IOException {
		
		final String msg = "Hello Broccaaaaaa!!! Im a Servlet!! METHOD GET";
		System.out.println(msg);
		logger.debug(msg);
		
		System.out.println("getClass: " + request.getClass());
		logger.debug("getClass: " + request.getClass());
		SlingHttpServletRequestWrapper requestWrapper = (SlingHttpServletRequestWrapper) request;
		
		final Resource resource = request.getResource();
		System.out.println(resource.getPath());
		logger.debug(resource.getPath());
//		response.getOutputStream().println(resource.toString());
//		response.getOutputStream().println(msg);
		
//		/painel/concessionaria.jsp
		RequestDispatcher dispatcher = requestWrapper.getRequestDispatcher(resource.getPath() + ".jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(SlingHttpServletRequest request,
			SlingHttpServletResponse response) throws ServletException,
			IOException {
		
		final String msg = "Hello Broccaaaaaa!!! Im a Servlet!! METHOD POST";
		System.out.println(msg);
		
		final Resource resource = request.getResource();
		response.getOutputStream().println(resource.toString());
		response.getOutputStream().println(msg);
	}

	@Override
	protected void doPut(SlingHttpServletRequest request,
			SlingHttpServletResponse response) throws ServletException,
			IOException {
		
		final String msg = "Hello Broccaaaaaa!!! Im a Servlet!! METHOD PUT";
		System.out.println(msg);
		
		final Resource resource = request.getResource();
		response.getOutputStream().println(resource.toString());
		response.getOutputStream().println(msg);
	}

	@Override
	protected void doDelete(SlingHttpServletRequest request,
			SlingHttpServletResponse response) throws ServletException,
			IOException {

		final String msg = "Hello Broccaaaaaa!!! Im a Servlet!! METHOD DELETE";
		System.out.println(msg);
		
		final Resource resource = request.getResource();
		response.getOutputStream().println(resource.toString());
		response.getOutputStream().println(msg);
	}
}
