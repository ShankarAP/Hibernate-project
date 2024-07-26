package employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Operation
{
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("shankar");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	
	Employee e=new Employee();
	e.setId(2);
	e.setName("punith");
	e.setSal(5445);
	
	
	Employee e1=new Employee();
	e1.setId(1);
	e1.setName("shankar");
	e1.setSal(1111);
	
	Employee x =new Employee();
	x.setId(3);
	x.setName("dev");
	x.setSal(7899);
	
	
	
	
//	**************to save(insert)**********
	
	transaction.begin();
//	manager.persist(e);
//	manager.persist(e1);
	manager.persist(x);
	transaction.commit();
	
	
//	************* to UPDATE ***********
	Employee l1=manager.find(Employee.class, 2);
	l1.setName("Punith");
	
//	transaction.begin();
//	manager.merge(l1);
//	transaction.commit();

	
//	************  To Delete ***********
	
	Employee d1=manager.find(Employee.class, 3);
//	
//	transaction.begin();
//   manager.remove(d1);
//	transaction.commit();
	
	
//	*********** To fetch *****************
	
	Employee f=manager.find(Employee.class,2);
//	System.out.println(f);
	
//	*************** fetch all *************
	
//	Query q=manager.createQuery("select s from Employee s");
//	List<Employee> h=q.getResultList();
//	for(Employee p : h)
//	{
//		System.out.println(p);
//	}
}
}
