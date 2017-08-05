<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>APLICACION PARA CONSUMOS DE SW</title>
<script type="text/javascript">

$(document).ready(function(){
	   $("a").click(function(evento){
		   var soapRequest = "<?xml version='1.0' encoding='utf-8'?><soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.uniajc.com"><soapenv:Header/><soapenv:Body><ws:getDocente><ws:id>??????</ws:id></ws:getDocente></soapenv:Body></soapenv:Envelope>";	
				
				var timeUpdate = 1;
				var lastUpdate;
				
				$.ajax({
					url : 'http://localhost:8080/docenteWS/services/DocenteServiceImpl',
					type: "POST",
					contentType: 'text/xml',
					dataType: "xml",
					data: soapRequest,

					success : function(data, status, req) {
						if (status == "success"){

							jsonFormater = xmlToJson(parseXml('<personalization>'+$(req.responseXML).find('return').html()+'</personalization>'));
							jsonString = JSON.stringify(jsonFormater.personalization).replace(/#text/g,"val");
							jsonOK = JSON.parse( jsonString );
							//console.log("Json Parameters",jsonOK);
							
							localStorage.setItem('dataPersonalization',jsonString);
							localStorage.setItem('lastUpdate',new Date());
							localStorage.setItem('timeUpdate',jsonOK.timeUpdate.val);
						}
					
					},
					error : function(data, status, req) {
						/*
						console.log(data);
						console.log(status);
						console.log(req);
						console.log('Disculpe, existio un problema');
						*/
					},
					complete : function(xhr, status) {
						//console.log('Petición realizada');
					}
				});
	      evento.preventDefault(); 
	      
	   });
	   
});




</script>
</head>
<body>



</body>
</html>