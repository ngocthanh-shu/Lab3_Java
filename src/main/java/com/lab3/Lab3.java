package com.lab3;

import java.util.List;
import java.util.Scanner;

import com.lab3.DAO.ManufactureDAO;
import com.lab3.entities.Manufacture;
import com.lab3.DAO.PhoneDAO;
import com.lab3.entities.Phone;

public class Lab3 {
    public static void main(String[] args) {
        System.out.println("-------------------- Lab 3 --------------------");
        System.out.println("1. Manage Manufacture");
        System.out.println("2. Manage Phone");
        System.out.println("3. Exit");
        System.out.print("Choose: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ManufactureDAO manufactureDAO = new ManufactureDAO();
                    System.out.println("-------------------- Manage Manufacture --------------------");
                    System.out.println("1. Add Manufacture");
                    System.out.println("2. Update Manufacture");
                    System.out.println("3. Delete Manufacture");
                    System.out.println("4. Get Manufacture");
                    System.out.println("5. Get All Manufacture");
                    System.out.println("6. Exit");
                    System.out.print("Choose: ");
                    int choice2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice2) {
                        case 1:
                            System.out.println("Add Manufacture");
                            System.out.print("Id: ");
                            String id = scanner.nextLine();
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Location: ");
                            String location = scanner.nextLine();
                            System.out.print("Employee: ");
                            int employee = scanner.nextInt();
                            manufactureDAO.addManufacture(id, name, location, employee);
                            break;
                        case 2:
                            System.out.println("Update Manufacture");
                            System.out.print("Id: ");
                            String id2 = scanner.nextLine();
                            System.out.print("Name: ");
                            String name2 = scanner.nextLine();
                            System.out.print("Location: ");
                            String location2 = scanner.nextLine();
                            System.out.print("Employee: ");
                            int employee2 = scanner.nextInt();
                            manufactureDAO.updateManufacture(id2, name2, location2, employee2);
                            break;
                        case 3:
                            System.out.println("Delete Manufacture");
                            System.out.print("Id: ");
                            String id3 = scanner.next();
                            manufactureDAO.deleteManufacture(id3);
                            break;
                        case 4:
                            System.out.println("Get Manufacture");
                            System.out.print("Id: ");
                            String id4 = scanner.next();
                            Manufacture manufacture = manufactureDAO.getManufacture(id4);
                            System.out.println("Manufacture Infomation");
                            System.out.println("Id: " + manufacture.getId());
                            System.out.println("Name: " + manufacture.getName());
                            System.out.println("Location: " + manufacture.getLocation());
                            System.out.println("Employee: " + manufacture.getEmployee());
                            break;
                        case 5:
                            System.out.println("Get All Manufacture");
                            List<Manufacture> lManufactures = manufactureDAO.getAllManufacture();
                            for (Manufacture manufacture2 : lManufactures) {
                                System.out.println("Manufacture Infomation");
                                System.out.println("Id: " + manufacture2.getId());
                                System.out.println("Name: " + manufacture2.getName());
                                System.out.println("Location: " + manufacture2.getLocation());
                                System.out.println("Employee: " + manufacture2.getEmployee());
                            }
                            break;
                        case 6:
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 2:
                    PhoneDAO phoneDAO = new PhoneDAO();
                    System.out.println("-------------------- Manage Phone --------------------");
                    System.out.println("1. Add Phone");
                    System.out.println("2. Update Phone");
                    System.out.println("3. Delete Phone");
                    System.out.println("4. Get Phone");
                    System.out.println("5. Get All Phone");
                    System.out.println("6. Exit");
                    System.out.print("Choose: ");
                    int choice3 = scanner.nextInt();
                    switch (choice3) {
                        case 1:
                            System.out.println("Add Phone");
                            System.out.print("Id: ");
                            String id = scanner.nextLine();
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Price: ");
                            int price = scanner.nextInt();
                            System.out.print("Color: ");
                            String color = scanner.nextLine();
                            System.out.print("Country: ");
                            String country = scanner.nextLine();
                            System.out.print("Quantity: ");
                            int quantity = scanner.nextInt();
                            phoneDAO.addPhone(id, name, price, color, country, quantity);
                            break;
                        case 2:
                            System.out.println("Update Phone");
                            System.out.print("Id: ");
                            String id2 = scanner.nextLine();
                            System.out.print("Name: ");
                            String name2 = scanner.nextLine();
                            System.out.print("Price: ");
                            int price2 = scanner.nextInt();
                            System.out.print("Color: ");
                            String color2 = scanner.nextLine();
                            System.out.print("Country: ");
                            String country2 = scanner.nextLine();
                            System.out.print("Quantity: ");
                            int quantity2 = scanner.nextInt();
                            phoneDAO.updatePhone(id2, name2, price2, color2, country2, quantity2);
                            break;
                        case 3:
                            System.out.println("Delete Phone");
                            System.out.print("Id: ");
                            String id3 = scanner.next();
                            phoneDAO.deletePhone(id3);
                            break;
                        case 4:
                            System.out.println("Get Phone");
                            System.out.print("Id: ");
                            String id4 = scanner.next();
                            Phone phone = phoneDAO.getPhone(id4);
                            System.out.println("Phone Infomation");
                            System.out.println("Id: " + phone.getId());
                            System.out.println("Name: " + phone.getName());
                            System.out.println("Price: " + phone.getPrice());
                            System.out.println("Color: " + phone.getColor());
                            System.out.println("Country: " + phone.getCountry());
                            System.out.println("Quantity: " + phone.getQuantity());
                            break;
                        case 5:
                            System.out.println("Get All Phone");
                            List<Phone> lPhones = phoneDAO.getAllPhone();
                            for (Phone phone2 : lPhones) {
                                System.out.println("Phone Infomation");
                                System.out.println("Id: " + phone2.getId());
                                System.out.println("Name: " + phone2.getName());
                                System.out.println("Price: " + phone2.getPrice());
                                System.out.println("Color: " + phone2.getColor());
                                System.out.println("Country: " + phone2.getCountry());
                                System.out.println("Quantity: " + phone2.getQuantity());
                            }
                            break;
                        case 6:
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
