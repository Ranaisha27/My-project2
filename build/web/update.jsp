<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.Session"%>
<%@page import="Model.schedule"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<!DOCTYPE html>
<html>
<head>
<style>
    
    body{
    background-size: cover;
    margin:0;
    padding: 0;
    font-family:sans-serif;
    background: url(images/too.jpg) no-repeat;
    background-size:cover;
    /*background-position:center;*/
  }
  .main{
    width:100%;
    height:100px;
    background-color:rgba(0,0,0,0.9);
  }
  .header{
    width:25%;
    line-height:80px;
    float:left;
     }
     .header h1{
      padding-left:70px;
      font-weight:bold;
      color:white;
      font-size:25px;
     }
  
  .nav
  {
    float:right;
    list-style:none;
    margin-top:30px;
  }
  .nav a{
    color:white;
    text-decoration: none;
    padding:5px 20px;
    font-family:"Roboto",sans-serif;
    font-size:22px;
    /*border:1px solid white;*/
  }
 
  .nav a:hover{
      border:1px solid white;
    
  }
    
    
    

h1{
  font-size: 40px;
  color: #fff;
  text-transform: uppercase;
  font-weight: 300;
  text-align: center;
  margin-bottom: 15px;
}
table{
  width:100%;
/*  table-layout: fixed;*/
}
.tbl-header{
  background-color: rgba(0,0,0,0.9);
 }
.tbl-content{
 /*height:300px;*/
  overflow-x:auto;
  margin-top: 0px;
  border: 1px solid rgba(0,0,0,0.9);
}
th{
 
  padding: 20px 15px;
  text-align: left;
  font-weight: 500;
  font-size: 16px;
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
    width:20%;
    margin:auto;
    margin-left:370px;
    box-sizing:border-box;
    padding: 10px,0;
    background: white;
    opacity:0.7;
    outline:none;
    border:none;
    border-bottom:1px  #fff;
    color:black;
    border-radius:20px;
    font-size:15px;

    height:35px;

  }
  .btn:hover
{
  background:grey;
  color:#000;
  cursor:pointer;
}
.demo
{
  display:flex;
      background-color: black;
      padding:20px;
            flex-wrap:wrap;
      flex-direction:row;
      justify-content: space-around;
      width:90%;
      margin-top: 50px;
      opacity:0.8;
     margin:auto;
}
 .demo input[type=text]
    {
      margin-top:3px;
       border-radius: 10px;
      width:200px;
      height:30px;
      
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
<div class="main">
<div class="header">
    <a href="admin.jsp"><h1>ADMIN</h1></a></div>
<div class="nav">
 
  <a href="viewall.html">ALL INFO</a>
  <a href="update.jsp">UPDATE SCHEDULE</a>
  <a href="display.jsp"> ADD SCHEDULE</a>
  <a href="delete.jsp">DELETE SCHEDULE</a>
 

</div>
</div>

<section>
  <!--for demo wrap-->
  <h1>BUS DETAILS</h1>
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
          
    <th>BUS NO</th>
  <th>FROM</th>
    <th>TO</th>
    <th>VIA</th>
    <th>TIME</th>
    
        </tr>
      </thead>
   
  </div>
  <div class="tbl-content">
   
      <tbody>
         <% 
                    String number,pick,drop,route,time;
                    Configuration cf = null;
                    SessionFactory sf = null;
                    Session s = null;
                    schedule sch = null;
                    try{
                        cf = new Configuration();
                        cf.configure();
                        sf = cf.buildSessionFactory();
                        s = sf.openSession();
                        Query q = s.createQuery("from schedule");
                        Iterator it = q.iterate();
                        while (it.hasNext()){
                            
                            sch = (schedule)it.next();
                            number = sch.getBusno();
                            pick = sch.getPickup();
                            drop = sch.getDropto();
                            route = sch.getVia();
                            time = sch.getTime();
                            System.out.println(number);
                            
                %>        
                
			<tr>
                            <td><%=number%></td>
                            <td><%=pick%></td>
                            <td><%=drop%></td>
                            <td><%=route%></td>
                            <td><%=time%></td>

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
 <div class="demo">
  <h1>UPDATE SCHEDULE</h1>
 <form  action ="update" method="get">
      <input type="text" placeholder="BUS NO" name="busno">
       <input type="text" placeholder="FROM" name="pickup">
        <input type="text" placeholder="TO" name="dropto">
         <input type="text" placeholder="VIA" name="via">
         <input type="text" placeholder="TIME" name="time">
         
         <br>
         <br>
         <div>
             <button class="btn" type="submit">UPDATE</button>  
         </div>
         

</form>
<div style="clear: both;"></div>
</div>

</body>
</html>
