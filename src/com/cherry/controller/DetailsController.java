package com.cherry.controller;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cherry.model.Details;

@Path("/det")
public class DetailsController{

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	public Response service(@FormParam("n1") String name,@FormParam("a1") String age,@FormParam("d") String disease ,@FormParam("d1") String date)
	{
		Details.GetDetails(name, age, disease, date);
		try{
			System.out.println("inside details");
			java.net.URI location;
			location = new java.net.URI("../DetailStored.html");
			return Response.temporaryRedirect(location).build();

			} catch (URISyntaxException e) {
			e.printStackTrace();

			}

		return null;
		}
}
