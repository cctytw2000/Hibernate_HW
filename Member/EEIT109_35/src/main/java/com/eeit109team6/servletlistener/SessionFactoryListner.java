package com.eeit109team6.servletlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.eeit109team6.memberDao.HibernateUtil;

public class SessionFactoryListner implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		HibernateUtil.getSessionfactory();
		System.out.println("Session Factory is Created");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		HibernateUtil.closeFactory();
		System.out.println("Session Factory is Closed");

	}

}
