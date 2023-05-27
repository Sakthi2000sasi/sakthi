package dao;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.studentdto;

public class studentdao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public String insert(studentdto dto) {
      
    	 et.begin();
         em.persist(dto);
         et.commit();
         
         return"data is inserted";
       
	}

//
//	public String delete(int sid1) {
//		studentdto sid=em.find(studentdto.class,sid1 );
//		if(sid!=null) {
//			et.begin();
//			em.remove(sid);
//			et.commit();
//			return"data is deleted";
//		}
//		return "no data is found";
//	}


//	public void update(int sid1, long phone1) {
//		studentdto d1=em.find(studentdto.class,sid1);
//		d1.setPhone_no(phone1);
//		et.begin();
//		em.persist(d1);
//		et.commit();
//		
//	
//	}
	public studentdto fetch(int sid1) {
		studentdto d1=em.find(studentdto.class,sid1);
		return d1;
		
	}

	public List fetchallByid() {
	 Query q=em.createQuery("select data from studentdto data");
	 List<studentdto>l=q.getResultList();
		
		return l;
	}


	public List<studentdto> fetchall1() {
		Query l=em.createQuery("select data from studentdto data");
		List<studentdto> li=l.getResultList();
		
		return li;
	}
	public void delete(int sid) {
		// TODO Auto-generated method stub
	studentdto	g=em.find(studentdto.class, sid);
	et.begin();
	em.remove(g);
	et.commit();
		
	}

	public void update(studentdto dto) {
		et.begin();
		em.merge(dto);
		et.commit();
		
		
	}
	
	
	
	

}
