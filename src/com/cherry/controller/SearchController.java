package com.cherry.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cherry.model.Search;

@Path("/ser")
public class SearchController
{
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	public Response doPost(@FormParam("t1") String name) throws IOException 
	{
		//String name = request.getParameter("t1");
		 Search.GetSearch(name);
		 
		 try{
				java.net.URI location;
				location = new java.net.URI("../Details.jsp");
				return Response.temporaryRedirect(location).build();

				} catch (URISyntaxException e) {
				e.printStackTrace();

				}
		return null;
		 
	}
}
