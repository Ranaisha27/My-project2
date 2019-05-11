
package Model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class userDAO {
    
  
     public void AddSch(schedule s)
    {
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        Transaction t = null;
        user u = null;
        try{ 
            cf = new Configuration();
            cf.configure();
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            t = session.beginTransaction(); 
            session.save(s);
            t.commit();
        }
        catch(Exception e ){
             e.printStackTrace();
            }
        finally{
            session.close();
            sf.close();
        }
    }
     
    
     
     
        
   public user check(String id)
    {
         user u = null;
         Configuration cf=null;
         SessionFactory sf=null;
         Session session=null;
        
         try
         {
             cf=new Configuration();
             cf.configure();
             sf=cf.buildSessionFactory();
             session= sf.openSession();
             Transaction tx= session.beginTransaction();
             Query q = session.createQuery("from user where id =:id");
             q.setString("id", id);
             u = (user)q.uniqueResult();
             tx.commit();
             return u;
         }
           catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            session.close();
            sf.close();
        }
             
         return u;
    }

 
    public boolean auth(String id , String pass){
        
        user u = null;
        u = check(id);
        if(u!=null){
            if(u.getId().equals(id) && u.getPass().equals(pass)){
                return true;
            }
        }
           else{
        return false;
        }
        return false;
    }
        
        public Admin checkAdmin(String id)
    {
         Admin u = null;
         Configuration cf=null;
         SessionFactory sf=null;
         Session session=null;
        
         try
         {
             cf=new Configuration();
             cf.configure();
             sf=cf.buildSessionFactory();
             session= sf.openSession();
             Transaction tx= session.beginTransaction();
             Query q = session.createQuery("from Admin where id =:id");
             q.setString("id", id);
             u = (Admin)q.uniqueResult();
             System.out.println(u);
             tx.commit();
             return u;
         }
           catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            session.close();
            sf.close();
        }
             
         return u;
    }

 
    public boolean authAdmin(String id , String pass){
        
        Admin u = null;
        u = checkAdmin(id);
        if(u!=null){
            if(u.getId().equals(id) && u.getPass().equals(pass)){
                return true;
            }
        }
        else{
        return false;
        }
        return false;
    }
    
    public void AddDriver(driverclass s){
    
    Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        Transaction t = null;
        user u = null;
        try{ 
            cf = new Configuration();
            cf.configure();
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            t = session.beginTransaction(); 
            session.save(s);
            t.commit();
        }
        catch(Exception e ){
             e.printStackTrace();
            }
        finally{
            session.close();
            sf.close();
        }
}


}
