package com.smartapp.api;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.smartapp.api.EmployeeController;

@Path("/view")
public class ServiceRequest {

	@GET
	@Path("/{param}")
	@Produces(MediaType.TEXT_HTML)
	public String view(@PathParam("param") String name) {
		EmployeeController employeeController = new EmployeeController();
        Integer employeeId = employeeController.addEmployee(name, "__LastName__", 100000);
        
		return "<html> " + "<title>" + "Hello " + name + "</title>"
				+ "<body><h1>" + "Hello " + name + " !! Here is your employeeId = " + employeeId + "</body></h1>" + "</html> ";
	}
	
}
