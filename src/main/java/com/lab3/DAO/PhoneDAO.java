package com.lab3.DAO;

import java.util.List;

import org.hibernate.Session;

import com.lab3.entities.Phone;
import com.lab3.utils.HibernateUtils;

public class PhoneDAO {
    public PhoneDAO() {

    }

    public void addPhone(String id, String name, int price, String color, String country, int quantity) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Phone phone = new Phone();
            phone.setId(id);
            phone.setName(name);
            phone.setPrice(price);
            phone.setColor(color);
            phone.setCountry(country);
            phone.setQuantity(quantity);
            session.save(phone);
            session.getTransaction().commit();
        }
    }

    public void updatePhone(String id, String name, int price, String color, String country, int quantity) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Phone phone = session.find(Phone.class, id);
            phone.setName(name);
            phone.setPrice(price);
            phone.setColor(color);
            phone.setCountry(country);
            phone.setQuantity(quantity);
            session.update(phone);
            session.getTransaction().commit();
        }
    }

    public void deletePhone(String id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Phone phone = session.find(Phone.class, id);
            session.delete(phone);
            session.getTransaction().commit();
        }
    }

    public Phone getPhone(String id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Phone phone = session.find(Phone.class, id);
            session.getTransaction().commit();
            return phone;
        }
    }

    public List<Phone> getAllPhone() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            List<Phone> phones = session.createQuery("from Phone", Phone.class).getResultList();
            session.getTransaction().commit();
            return phones;
        }
    }
}
