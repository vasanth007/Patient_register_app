package com.cherry.model;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.cherry.connection.Close;
import com.cherry.connection.Config;
import com.cherry.pojo.Regist;

public class Login 
{

	public static Boolean GetLogin(String username, String password) 
	{
		Session session=Config.Hiber();
		Transaction transaction = session.beginTransaction();
		
	        Query query = session.createQuery("from Register where username=:u and password=:p");
	        query.setParameter("u",username);
	        query.setParameter("p",password);
	       List list=query.list(); 
	        System.out.println(list);
	        transaction.commit();
			session.close();
         if(list.toString()=="[]")
         {
        	 return true;
         }
         else
         {
        	 return false;
         }
			
	}
}
