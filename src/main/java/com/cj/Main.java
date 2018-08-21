package com.cj;

import com.cj.hibernate.HibernateUtil;
import com.cj.hibernate.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Message message = new Message("Hello world");
        Long msgId = (Long) session.save(message);

        tx.commit();
        session.close();
        LOGGER.info("Successully executed.");
        HibernateUtil.shutdown();
    }
}
