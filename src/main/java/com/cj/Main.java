package com.cj;

import com.cj.hibernate.HibernateUtil;
import com.cj.hibernate.Message;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Message message = new Message("Hello world");
        Long msgId = (Long) session.save(message);

        tx.commit();
        session.close();
    }
}
