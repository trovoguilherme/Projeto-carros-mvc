<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Carros</title>
		
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
            <a class="btn-cadastro" href="${contextPath}/carro/form?page=carro-novo">Cadastrar Veículo</a>
        </div>
    </header>
    
    <!-- Inicio Main -->
    <section class="main">
    	<h1>Veículos Cadastrados</h1>
    	<c:if test="${not empty messages}">
  			<p>${messages}</p>
    	</c:if>
	    	<div class="container">
				 <div class="cars">
					 <c:forEach items="${carros}" var="carro">
		                <div class="item-cars">
			                <div class="infos">
			                	<div class="info">
				                    <h3>Marca</h3>
				                    <p>${carro.marca}</p>
				                </div>

			                   <div class="info">
				                    <h3>Modelo</h3>
				                    <p>${carro.modelo}</p>
			               	   </div>
								
							   <div class="info">
				                    <h3>Ano</h3>
				                    <p>${carro.anoFabricacao}</p>
				               </div>			           
			      			</div>
			      			
			      			<div class="btns">
								<form:form action="${contextPath}/carro/${carro.id}" method="delete">
									<a class="btn-detalhes" href="${contextPath}/carro/${carro.id}">Detalhes</a>
									<a class="btn-editar" href="${contextPath}/carro/form?page=carro-editar&id=${carro.id}">Editar</a>
									<input type="submit" value="excluir">
								</form:form>
							</div>   
		                </div>
		             </c:forEach>
	            </div>
            </div>
		</section>
		<!-- Fim Main -->
	</body>
</html>