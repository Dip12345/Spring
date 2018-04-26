
package com.mycompany.dao;

import com.mycompany.model.Course;
import java.util.List;

public interface CourseDaoInterface {
     public void insert(Course c);
         public List<Course> display();
         public void delete(int cid);
         public Course display_by_id(int cid);
         public void update();
}
