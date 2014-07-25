package com.smartapp.api;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * User: sridhar.anumandla
 * Date: 7/8/14
 * Time: 7:49 AM
 */
public class EmployeeController {

	/* Method to CREATE an employee in the database */
    public Integer addEmployee(String firstName, String lastName, int salary) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer employeeId = null;
        try {
            tx = session.beginTransaction();
            Employee employee = new Employee();
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setSalary(salary);
            employeeId = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeId;
    }

}
