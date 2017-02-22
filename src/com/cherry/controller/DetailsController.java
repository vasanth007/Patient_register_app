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
import com.cherry.model.Details;
import com.cherry.pojo.Appoint_Details;

@Path("/det")
public class DetailsController{

	@POST
	@Consumes(MediaType.APPLICATION_JSON) 
	public Response service(Appoint_Details appoint)
	{
		System.out.println("hi i am in register ");
		Session session = Config.Hiber();
		session.beginTransaction();
		
		 session.save(appoint);
	       session.getTransaction().commit();
	       session.close();
	       
	       System.out.println(appoint.getDate()+" "+appoint.getDisease());
			try{
				java.net.URI location;
				location = new java.net.URI("../Reg.jsp");
				return  Response.status(200).entity("").build();

				} catch (URISyntaxException e) {
				e.printStackTrace();

				}
		return null;
		}
}
