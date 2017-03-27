<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<frameset rows="5%,90%,5%">  
 	 <frame src = "top.jsp" scrolling=no noresize/> 
          <frameset cols="20%,*">  
                  <frame src="menu.jsp" name="menu" scrolling=no noresize>  
                  <frame src="main.jsp" name="main" noresize>  
          </frameset>  
	<frame src="bottom.jsp"  noresize scrolling=no>
    <noframes>
    <body>
    <p>This page uses frames. The current browser you are using does not support frames.</p>
    </body>
    </noframes>
  <div >
	<p>this is a top</p>
</div>
</html>