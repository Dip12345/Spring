
package com.mycompany.springconfiguration;

import com.mycompany.dao.CourseDao;
import com.mycompany.service.CourseService;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mycompany")
public class SpringConfiguration extends WebMvcConfigurerAdapter{
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
         viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    /*
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     *
     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
//    }
    
    
    @Bean
    public CourseDao courseDao(SessionFactory s) {
      CourseDao cdao = new CourseDao();
      cdao.setSessionFactory(s);
       return cdao;
    }
    @Bean
    public CourseService courseService(CourseDao cdao) {
      CourseService courseService = new CourseService();
      courseService.setCdao(cdao);
       return courseService;
    }

    
}
