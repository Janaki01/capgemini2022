package ecommerce.com.businesslogic;
import ecommerce.com.Product;
import ecommerce.com.Rating;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;   
import org.hibernate.cfg.Configuration;


public class Service {
	
	private static SessionFactory sessionFactory = null;
	Transaction transaction = null;
	Session sessiong = null;
	
	public void addProduct(Product product) {
		// initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction = session.beginTransaction();	
		session.save(product);// this save() will form "insert into table " query	// automatically// in DB"
		transaction.commit();

	}
	
	public Product updateProductById(Product prod, int id) {
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction=session.beginTransaction();
		
		Product product = (Product)session.get(Product.class, id);
	
		product.setLaptopname(prod.getLaptopname());  // values are coming from client that isMainClas
		product.setColor(prod.getColor());
		product.setWeight(prod.getWeight());
		product.setModel(prod.getModel());
		product.setScreensize(prod.getScreensize());
		session.update(product);
		transaction.commit();
		return product;

	}
	
	/// this method is used for only retrieve the id from DB
	public Product findProductById(int productId) {
	
		sessionFactory = new Configuration().configure().buildSessionFactory();
		sessiong = sessionFactory.openSession();
		// begin transaction
		transaction=sessiong.beginTransaction();
		Product findbyid = (Product)sessiong.load(Product.class, productId);
		return findbyid;
	}
	
	//we need common session

	public void deleteProductRecordById(int productId) {
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		sessiong = sessionFactory.openSession();
		transaction=sessiong.beginTransaction();
	    Product deleteobj = findProductById(productId); //fetching existing id from the database with the help of findByIdMethod()
		sessiong.delete(deleteobj);
		transaction.commit();
		   
	}
	
	public String deleteAllProductRecord() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		sessiong = sessionFactory.openSession();
		transaction = sessiong.beginTransaction();
		Query query = sessiong.createQuery("DELETE FROM Product");
		Integer result = query.executeUpdate();
		transaction.commit();

		if (result > 0) {
			return "Sucessfully deleted all records";
		} else {
			return "No record found";
		}
	}
	
	public Product getProductDetailsById(int productId) {
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction=session.beginTransaction();
		return (Product)session.get(Product.class, productId);
	}
	
	public List<Product> getListOfAllProducts(){
			
			Session session = null;
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			
			Query q = session.createQuery("From Product");
			List<Product> prodList = q.list();
			return prodList;
			
			
		}
		
		
		// RATING METHODS
		
		
	public void  addRating(Rating rate) {
		// initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction = session.beginTransaction();	
		session.save(rate);// this save() will form "insert into table " query	// automatically// in DB"
		transaction.commit();

	}
	
	public Rating updateRatingById(Rating rate, int id) {
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction=session.beginTransaction();
		
		Rating rating = (Rating)session.get(Rating.class, id);
	
		rating.setNumberOfStars(rate.getNumberOfStars());  // values are coming from client that isMainClas
		rating.setRating(rate.getRating());
		
		session.update(rating);
		transaction.commit();
		return rating;

	}
	
	/// this method is used for only retrieve the id from DB
	public Rating findRatingById(int ratingId) {
	
		sessionFactory = new Configuration().configure().buildSessionFactory();
		sessiong = sessionFactory.openSession();
		// begin transaction
		transaction=sessiong.beginTransaction();
		return (Rating)sessiong.load(Rating.class, ratingId);
	}
	
	//we need common session

	public void deleteRatingRecordById(int ratingId) {
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		sessiong = sessionFactory.openSession();
		transaction=sessiong.beginTransaction();
	    Rating deleteobj = findRatingById(ratingId); //fetching existing id from the database with the help of findByIdMethod()
		sessiong.delete(deleteobj);
		transaction.commit();
		   
	}
	
	public String deleteAllRatingDetails() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		sessiong = sessionFactory.openSession();
		transaction = sessiong.beginTransaction();
		Query query = sessiong.createQuery("DELETE FROM Rating");
		Integer result = query.executeUpdate();
		transaction.commit();

		if (result > 0) {
			return "Sucessfully deleted all records";
		} else {
			return "No record found";
		}
	}
	
	public Rating getRatingById(int ratingId) {
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction=session.beginTransaction();
		return (Rating)session.get(Rating.class, ratingId);
	}
	
	public List<Rating> getListOfAllRating(){
				Session session = null;
				sessionFactory = new Configuration().configure().buildSessionFactory();
				session = sessionFactory.openSession();
				
				Query q = session.createQuery("From Rating");
				List<Rating> ratingList = q.list();
				return ratingList;
				
				
			}
		

}