package com.lab3;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.lab3.entities.User;
import com.lab3.utils.HibernateUtils;

public class HibernateExample {
    public static void main(String[] args) {
        try (Session session = HibernateUtils.getSessionFactory().openSession();) {
            session.beginTransaction();

            Date currDate = new Date();
            User user1 = new User();
            user1.setFullname("Nguyen Van A");
            user1.setUsername("user1");
            user1.setPassword("123456");
            user1.setCreatedAt(currDate);
            user1.setUpdatedAt(currDate);
            Long id1 = (Long) session.save(user1);
            System.out.println("User 1: " + id1);

            // Count user from database
            Long numberOfUser = session.createQuery("SELECT COUNT(id) FROM User", Long.class).uniqueResult();
            System.out.println("Number of user in database: " + numberOfUser);

            // Get user by id
            User savedUser = session.find(User.class, id1);
            System.out.println("savedUser: " + savedUser);

            // Update user
            savedUser.setFullname("GP Coder");
            session.update(savedUser);

            // Get users
            List<User> users = session.createQuery("FROM User", User.class).list();
            users.forEach(System.out::println);

            // Delete user
            //session.delete(savedUser);

            // Count user from database
            numberOfUser = session.createQuery("SELECT COUNT(id) FROM User", Long.class).uniqueResult();
            System.out.println("Number of user in database: " + numberOfUser);

            // Commit the current resource transaction, writing any unflushed changes to the
            // database.
            session.getTransaction().commit();
        }
    }
}
