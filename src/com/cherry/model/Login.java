package com.cherry.model;

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
		
	        Query query = session.createQuery("from Regist as r where r.username=:u and r.pass=:p");
	        query.setParameter("u",username);
	        query.setParameter("p",password);
	       List<Regist> list=query.list(); 
	        System.out.println(list);
	        transaction.commit();
			session.close();
         if(!list.isEmpty())
         {
        	 return true;
         }
         else
         {
        	 return false;
         }
			
	}
}
