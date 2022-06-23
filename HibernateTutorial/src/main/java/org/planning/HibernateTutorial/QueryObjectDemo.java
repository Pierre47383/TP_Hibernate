package org.planning.HibernateTutorial;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.planning.HibernateTutorial.HibernateUtils;
import org.planning.HibernateTutorial.Client;

public class QueryObjectDemo {

public static void main(String[] args) {
       SessionFactory factory = HibernateUtils.getSessionFactory();

       Session session = factory.getCurrentSession();

       try {
           
           // All the action with DB via Hibernate
           // must be located in one transaction.
           // Start Transaction.            
           session.getTransaction().begin();

   
           
           // Create an HQL statement, query the object.
           // Equivalent to the SQL statement:
           // Select e.* from EMPLOYEE e order by e.EMP_NAME, e.EMP_NO
           String sql = "Select e from " + Client.class.getName() + " e "
                   + " order by e.empName, e.empNo ";

  
           // Create Query object.
           Query<Client> query = session.createQuery(sql);

   
           // Execute query.
           List<Client> Clients = query.getResultList();

           for (Client c : Clients) {
               System.out.println("Emp: " + c.getNumClient() + " : "
                       + c.getNomClient() + c.getPrenomClient());
           }
 
           // Commit data.
           session.getTransaction().commit();
       } catch (Exception e) {
           e.printStackTrace();
           // Rollback in case of an error occurred.
           session.getTransaction().rollback();
       }
   }
   
}