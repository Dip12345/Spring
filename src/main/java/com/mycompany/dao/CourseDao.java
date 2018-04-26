
package com.mycompany.dao;

import com.mycompany.model.Course;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class CourseDao implements CourseDaoInterface{

    @Autowired
    private SessionFactory sessionFactory;   

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
   
    private Session getSession(){
        Session sess=getSessionFactory().getCurrentSession();
        if(sess==null){
            sess=getSessionFactory().openSession();
        }
        return sess;
    }
 
    @Override
    public void insert(Course c) {
        getSession().saveOrUpdate(c);
    }

    @Override
    public List<Course> display() {
      List<Course> courses = getSession().createCriteria(Course.class).list();
        return courses;
    }

    @Override
    public void delete(int cid) {
        Course c=new Course();
        c.setCid(cid);
        getSession().delete(c);
    }

    @Override
    public Course display_by_id(int cid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
