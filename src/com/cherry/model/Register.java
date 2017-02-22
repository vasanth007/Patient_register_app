package com.cherry.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.cherry.connection.Close;
import com.cherry.connection.Config;
import com.cherry.pojo.Regist;

public class Register 
{
	public static void GetReg(String name, String pass, String address, String email)
	{
		Regist reg= new Regist();
		reg.setUsername(name);
		reg.setPass(pass);
		reg.setAddress(address);
		reg.setEmail(email);
		Session session=Config.Hiber();
		Transaction transaction = session.beginTransaction();
			session.save(reg);
		transaction.commit();
		
		session.close();
	}

}
