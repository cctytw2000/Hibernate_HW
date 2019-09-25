package com.eeit109team6.memberDao;

import java.io.IOException;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MemberDaoFactoery {
	public static IMemberDao createMember(SessionFactory sessionFactory) throws IOException, SQLException {
		IMemberDao MEMDao;
		MEMDao = new MemberDaoJdbcImpl(sessionFactory);
		return MEMDao;

	}
}
