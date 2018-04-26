
package com.mycompany.service;

import com.mycompany.dao.CourseDao;
import com.mycompany.model.Course;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


public class CourseService {
    
     private CourseDao cdao;
    
    public void setCdao(CourseDao cdao){
    
    this.cdao=cdao;
    }
    
    @Transactional
    public void insert(Course c){
    cdao.insert(c);
    
    }
    
     @Transactional
     public List<Course> display() {
        return cdao.display();
    }

     @Transactional
     public void delete(int cid) {
        cdao.delete(cid);
    }
}
