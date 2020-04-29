<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Editar veículo</title>
		<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
		
		<spring:url value="/resources/img" var="img"/>
		<spring:url value="/resources/img" var="img"/>
		<spring:url value="/resources/css"  var="css"/>
		
		<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
		
		 <link href="${css}/style.css" rel="stylesheet">
	</head>
	<body>
		<header class="header">
	        <div class="container menu">
	            <div class="logo">
	                <a class="logo" href="${contextPath}/carro"><img src="${img}/logo.png"></a>
	            </div>
	            <a class="btn-back" href="${contextPath}/carro">Voltar</a>
	        </div>
	    </header>
		
		<h1>Editar veículo</h1>
		
		<section class="cd-ed container">	
		<form:form modelAttribute="carroModel" action="${contextPath}/carro/${carroModel.id}" method="put" class="form-cd-ed">
			
			<form:input type="hidden" path="id"/>
			
			<label for="marca">Marca:</label>
			<form:input type="text" id="marca" path="marca"/> <br>
			<font color="red"><form:errors path="marca"/></font><br/>
			
			<label for="modelo">Modelo:</label>
			<form:input type="text" path="modelo"/> <br>
			<font color="red"><form:errors path="modelo"/></font><br/>
			
			<label for="anoFabricacao">Ano de fabricação:</label>
			<form:input type="number" path="anoFabricacao"/> <br>
			<font color="red"><form:errors path="anoFabricacao"/></font><br/>
			
			<label for="motor">Motor:</label>
			<form:input type="text" path="motor"/> <br>
			<font color="red"><form:errors path="motor"/></font><br/>
			
			<label for="combustivel">Combustível:</label>
			<form:input type="text" path="combustivel"/> <br>
			<font color="red"><form:errors path="combustivel"/></font><br/>
			
			<label for="cambio">Câmbio:</label>
			<form:input type="text" path="cambio"/> <br>
			<font color="red"><form:errors path="cambio"/></font><br/>
			
			<label for="consumoMedio">Consumo Médio:</label>
			<form:input type="text" path="consumoMedio"/> <br>
			<font color="red"><form:errors path="consumoMedio"/></font><br/>
			
			<label for="preco">Preço:</label>
			<form:input type="number" step="0.01" path="preco"/> <br>
			<font color="red"><form:errors path="preco"/></font><br/>
			
			<label for="descricao">Descricação:</label>
			<form:textarea class="desc" type="text" path="descricao"/> <br>
			<font color="red"><form:errors path="descricao"/></font><br/>
			
			
			<div class="opc">
				<a class="btn-cancelar" href="${contextPath}/carro">Cancelar</a>
				<div class="btn-cd-ed">
					<input type="submit" value="Gravar">
				</div>
			</div>
		
		</form:form>
		</section>
	</body>	
</html>