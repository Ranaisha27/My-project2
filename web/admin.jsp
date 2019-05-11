<!DOCTYPE html>
<html>
<head>
  <title></title>
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
    background-color:rgba(0,0,0,0.6);
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
 
  .nav a:hover{border:1px solid white;
    
  }
  .hero{
    position:absolute;
    width:1000px;
    margin-left:170px;
    margin-top:0px;
  } 
  .hero h1{
    font-family:Calibri;
    font-size:70px;
    text-align:center;
    margin-top:50px;
  color: white;
  }

  .demo
    {
      display:flex;
      background-color: transparent;
      padding:20px;
            flex-wrap:wrap;
      flex-direction:row;
      justify-content: space-around;
      height:300px;
      width:100%;
      margin-top: 150px;
      
    }
    .demo div{

      background-color:white;
      text-align:center;
      margin:10px;
      font-size:50px;
      padding:10px;
      width:25%;
      height:300px;
      border-radius:40px;
      opacity:0.8;
      
    }
    .demo input[type=text]
    {
      margin-top:3px;
       border-radius: 10px;
      margin-bottom: 30%;
      width:200px;
      height:50px;
      
          }
    .demo h6
    {
   
   font-family:Adobe Gothic Std B;  
     }
    .btn{
      background: grey;
      border-bottom:1px  grey;
    color:#fff;
    border-radius:20px;
    height:60px;
    width:90px;
    }
   /* .btn
  {
    width:50%;
    box-sizing:border-box;
    padding: 10px,0;
    background: #60adde;
    opacity:0.7;
    outline:none;
    border:none;
    border-bottom:1px  #fff;
    color:#fff;
    border-radius:20px;
    font-size:20px;
    
  }
  .btn:hover
{
  background:#ffc107;
  color:#000;
  cursor:pointer;
}*/
  
      
</style>
</head>
<body>
<div class="main">
<div class="header"><h1>ADMIN</h1></div>
<div class="nav">

  <a href="viewall.html">ALL</a>
  <a href="update.jsp">UPDATE SCHEDULE</a>
  <a href="display.jsp"> ADD SCHEDULE</a>
  <a href="delete.jsp">DELETE SCHEDULE</a>
  <a href="login.jsp">LOGOUT</a>
 

</div>
</div>
<div class="hero">
  <h1 class="wow fadeInUp" data-wow-delay="0.6s">SEARCH HERE!</h1>
 </div>
 <div class="demo">
  <div class="A">
      <h6> BY BUS ROUTE
      <br>
     
    
    <form class="k" action="search"  method= "post">
      <input type="text" placeholder="Search.." name="search">
      <button class="btn" type="submit">SEARCH</button>
    </h6></form>
  </div>

  
  <div class="B">
    <h6>BY BUS NUMBER
    <br>
    
    <form class="k" action="search1" method="post" >
      <input type="text" placeholder="Search.." name="search">
     
     
      <button class="btn" type="submit">SEARCH</i></button>
    </form>
  </h6>
  </div>
  
  <div class="C"><h6>
  BY DROP POINT 
    <br>
   
    
    <form class="k" action="search2">
      <input type="text" placeholder="Search.." name="search">
      <button class="btn" type="submit">SEARCH</button>
    </form>
  </h6>
  </div>
 
  

</div>

</body>
</body>
</html>