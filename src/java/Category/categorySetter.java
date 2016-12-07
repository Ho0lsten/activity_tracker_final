/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Category;

import Hibernate.Category;
import Hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author MM-Produktion
 */
public class categorySetter {

    public static void createCat(String categoryName, String categoryType, String categoryDescription ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Category cat = new Category();     
        cat.setCategoryName(categoryName);
        cat.setCategoryType(categoryType);
        cat.setCategoryDescription(categoryDescription);
        session.save(cat);
        session.getTransaction().commit();

    }
}
