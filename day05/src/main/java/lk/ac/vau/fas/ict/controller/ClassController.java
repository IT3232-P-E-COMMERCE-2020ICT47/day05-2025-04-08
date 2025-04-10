package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Course;


@RestController
@RequestMapping("/course")
public class ClassController extends CRUDController<Course, String> {
	
    public ClassController()
    {
    	Course ecommerce = new Course("IT3232","E-Commerce",2);
    	Course webappservice = new Course("IT2234","Web Service And Server Technology",4);
    	Course webapplication = new Course("CSC3132","Web Application Development",2);
    	
    	items.put(ecommerce.getCode(),ecommerce);
    	items.put(webappservice.getCode(),webappservice);
    	items.put(webapplication.getCode(),webapplication);
    	
    	
    }
    
	

}
