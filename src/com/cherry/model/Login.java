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

	public static Boolean GetLogin(String name, String pass) 
	{
//		String n = ""; 
//		String p = "";
		 String searchName = name;
		Session session=Config.Hiber();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("FROM Regist where pname=:n and password=:p");
		 query.setParameter("n",name);
		 query.setParameter("p",pass);
         List list = query.list();
         System.out.println(list);
         
Iterator iterator = list.iterator();
         
         while (iterator.hasNext()) {//is next data exist? then loop
             Regist obj = (Regist) iterator.next();//cast and assign next data to Person type object
             
             int id =obj.getId();
             System.out.println("inside iterator "+id);
         }
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
//         String searchId = "1";
//         String query = "from Register as r where r.id = :sId";
//         List list = session.createQuery(query)
//                     .setString("sId", searchId).list();
//         
         
		
		//session.save(object)
	
	
	
		//Close.Close1(transaction,reg,session);
			
	}
}
