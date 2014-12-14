/**
 * 
 */
package com.conmmon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * <p>Title: BaseDao</p>
 * <p>Description: </p>
 * @author GuoJM
 * @date 2014年12月14日
 */
public class BaseDao {  
    @Autowired  
    private SessionFactory sessionFactory;  
      
    public Session getCurrentSession(){  
        return sessionFactory.getCurrentSession();  
    }  
}  