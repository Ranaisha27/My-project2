<%@page import="Model.driverclass"%>
<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.Session"%>

<%@page import="org.hibernate.cfg.Configuration"%>
<html>
<head>
<style>

h1{
  font-size: 30px;
  color: #fff;
  text-transform: uppercase;
  font-weight: 300;
  text-align: center;
  margin-bottom: 15px;
}
table{
  width:100%;
  table-layout: fixed;
}
.tbl-header{
  background-color: rgba(0,0,0,0.9);
 }
.tbl-content{
  
  overflow-x:auto;
  margin-top: 0px;
  border: 1px solid rgba(0,0,0,0.9);
}
th{
  padding: 20px 15px;
  text-align: left;
  font-weight: 500;
  font-size: 12px;
  color: #fff;
  text-transform: uppercase;
}
td{
  background-color: rgba(0,0,0,0.7);
  

  padding: 15px;
  text-align: left;
  vertical-align:middle;
  font-weight: 300;
  font-size: 12px;
  color: #fff;
  border-bottom: solid 1px rgba(0,0,0,0.7);
}
.btn
  {
    width:100%;
    box-sizing:border-box;
    padding: 10px,0;
    background: black;
    opacity:0.7;
    outline:none;
    border:none;
    border-bottom:1px  #fff;
    color:#fff;
    border-radius:20px;
    font-size:20px;
    margin-top:30px;
    height:50px;
  }
  .btn:hover
{
  background:grey;
  color:#000;
  cursor:pointer;
}



body{
  background: url(images/welcome1.jpg)no-repeat;
 background-size:cover;
  font-family: 'Roboto', sans-serif;
}
section{
  margin: 50px;
}

</style>
</head>
<body>


<section>
 
  <h1>Driver details</h1>
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
          
    <th> ID</th>
  <th> NAME</th>
    <th>CONTACT</th>
    <th>BUS NO</th>
    <th>ROUTE</th>
        </tr>
      </thead>
    
  </div>
  <div class="tbl-content">
    
      <tbody>
       <% 
                    String driverid,drivername,contact,busno,route;
                    Configuration cf = null;
                    SessionFactory sf = null;
                    Session s = null;
                    driverclass sch = null;
                    try{
                        cf = new Configuration();
                        cf.configure();
                        sf = cf.buildSessionFactory();
                        s = sf.openSession();
                        Query q = s.createQuery("from driverclass");
                        Iterator it = q.iterate();
                        while (it.hasNext()){
                            
                            sch = (driverclass)it.next();
                            driverid = sch.getDriverid();
                            drivername = sch.getDrivername();
                            contact = sch.getContact();
                            busno = sch.getBusno();
                            route = sch.getRoute();
                            System.out.println(driverid);
                            
                %>        
                
			<tr>
                            <td><%=driverid%></td>
                            <td><%=drivername%></td>
                            <td><%=contact%></td>
                            <td><%=busno%></td>
                            <td><%=route%></td>

			</tr>
                        
                        <%
                            }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                %>
         
         
      </tbody>

    </table>

  </div>
</section>
 <a href="student.html"><button class="btn" type="submit">back</button></a>




</body>
</html>
