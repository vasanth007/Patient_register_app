package com.cherry.controller;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cherry.model.*;
import com.cherry.pojo.Regist;

@Path("log")
public class LoginController
{
		static String name_1;
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON) 
		public Response doPost(Regist regist){
		
			System.out.println("inside login method");
			Boolean loginStatus = Login.GetLogin(regist.getUsername(),regist.getPass());
			
  
			if(loginStatus){
				return Response.status(200).entity("").build();
			}else{
				return Response.status(401).entity("").build();
			}
			
	
		}
		
		
		
}
