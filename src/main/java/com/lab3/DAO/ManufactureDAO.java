package com.lab3.DAO;

import java.util.List;

import org.hibernate.Session;

import com.lab3.entities.Manufacture;
import com.lab3.utils.HibernateUtils;

public class ManufactureDAO {
    public ManufactureDAO() {

    }

    public void addManufacture(String id, String name, String location, int employee) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Manufacture manufacture = new Manufacture();
            manufacture.setId(id);
            manufacture.setName(name);
            manufacture.setLocation(location);
            manufacture.setEmployee(employee);
            session.save(manufacture);
            session.getTransaction().commit();
        }
    }

    public void updateManufacture(String id, String name, String location, int employee) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Manufacture manufacture = session.find(Manufacture.class, id);
            manufacture.setName(name);
            manufacture.setLocation(location);
            manufacture.setEmployee(employee);
            session.update(manufacture);
            session.getTransaction().commit();
        }
    }

    public void deleteManufacture(String id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Manufacture manufacture = session.find(Manufacture.class, id);
            session.delete(manufacture);
            session.getTransaction().commit();
        }
    }

    public Manufacture getManufacture(String id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Manufacture manufacture = session.find(Manufacture.class, id);
            session.getTransaction().commit();
            return manufacture;
        }
    }

    public List<Manufacture> getAllManufacture() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            List<Manufacture> manufactures = session.createQuery("from Manufacture", Manufacture.class).getResultList();
            session.getTransaction().commit();
            return manufactures;
        }
    }
}
