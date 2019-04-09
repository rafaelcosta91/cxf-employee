package employee;

import javax.xml.ws.Endpoint;

import employee.service.EmployeeService;
import employee.service.EmployeeServiceImpl;

public class EmployeeServer {
    public static void main(String args[]) throws InterruptedException {
    	EmployeeService implementor = new EmployeeServiceImpl();
        String address = "http://localhost:8080/employee";
        Endpoint.publish(address, implementor);
        System.out.println("Server ready...");
        Thread.sleep(60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
