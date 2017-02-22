package com.cherry.controller;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.Session;

import com.cherry.connection.Config;
import com.cherry.model.*;
import com.cherry.pojo.Regist;

@Path("reg")
public class RegisterController
{
	@POST
	@Consumes(MediaType.APPLICATION_JSON) 
	public Response service(Regist regist)  
	  {
		System.out.println("hi i am in register ");
		Session session = Config.Hiber();
		session.beginTransaction();
		  System.out.println("session created");
		  
		       session.save(regist);
		       session.getTransaction().commit();
		       session.close();
		       
		       System.out.println(regist.getUsername()+ " Registered");
			try{
				java.net.URI location;
				location = new java.net.URI("../Reg.jsp");
				return Response.status(200).entity("").build();

				} catch (URISyntaxException e) {
				e.printStackTrace();

				}
			return null;
	  }
	
	static String name_1;	
	
	public static String getName()
	{
		return name_1;
	}
	
}
