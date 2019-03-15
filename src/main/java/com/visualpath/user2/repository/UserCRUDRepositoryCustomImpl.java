package com.visualpath.user2.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.visualpath.user2.model.User;

public class UserCRUDRepositoryCustomImpl implements UserCRUDRepositoryCustom{
    EntityManager em; 

	
	@Override
	public List<User> getUsersByNameandCity(String name, String address){
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class); 
        Root<User> user = cq.from(User.class);
        Predicate cityPredicate = cb.equal(user.get("address"), address);
        Predicate namePredicate = cb.like(user.get("name"), "%" + name + "%");       
       if(name!=null && address!=null)
        cq.where(cityPredicate, namePredicate);
       else if(name!=null && address==null)
       	cq.where(namePredicate);
      else if(name==null && address!=null)
       	cq.where(cityPredicate); 
        TypedQuery<User> query = em.createQuery(cq);
        return query.getResultList();  		
	}

}
