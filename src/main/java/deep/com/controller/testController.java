package deep.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import java.util.ArrayList;
import java.util.Iterator;

import deep.com.EmployeeInterfaces.EmployeeInterface;
import deep.com.Models.Employee;
import deep.com.Models.EmployeeData;
import deep.com.ServiceImplementations.AddEmployees;
import deep.com.service.testService;

@RestController
public class testController {

	@Autowired
	testService ts;
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView LandingPage(ModelMap model)  {
    	
    	System.out.println("INSIDE CONTROLLER");
        return new ModelAndView("welcome");
    }

    @RequestMapping(value="/singh")
    public String mainPage() {
    	System.out.println("INSIDE CONTROLLER SinghSingh");
		return "welcome Deependra";
        
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView WelcomePage(ModelMap model) {
    	
    	return new ModelAndView("IndexPage");
    }
    
    
    @RequestMapping(value = "/shekhawat", method = RequestMethod.GET)
	public ModelAndView printWelcome(ModelMap model) {
    	AddEmployees add=new AddEmployees();
        List<Employee> emp=new ArrayList<Employee>();
        emp=add.addEmployees();
		//model.addAttribute("message", "Spring 3 MVC Hello World");
        Iterator itr=emp.iterator();
        while(itr.hasNext())
        {
        	Employee e=(Employee) itr.next();
        	System.out.println("Name is: "+e.getName() +" Arddress: "+e.getAddress());
        	
        }
        
        
    	System.out.println("Inside Shekhawat");
    	ts.display();
    	return new ModelAndView("welcome");


	}
    
    @RequestMapping(value="/callAjax",method=RequestMethod.POST)
    public  String   getSearchUserProfiles(@RequestBody @Valid EmployeeData emp ,HttpServletRequest request, BindingResult result) {
       
        String status=ts.validate(emp);
        String message="";
        if(status.equalsIgnoreCase("Ok"))
        {
        	message="Welcome"+emp.getName();
        System.out.println("Status :: "+status);
        return "{\"status\":\""+status+"\",\"address\":\""+message+"\"}";
        }
        else
        {
        	message="Wrong Username/Password";
            System.out.println("Status :: "+status);
            return "{\"status\":\""+status+"\",\"address\":\""+message+"\"}";
        }
       //var jSon= "{\"name\":\""+un+"\",\"address\":\""+psw+"\"}";
        
    }
    

}