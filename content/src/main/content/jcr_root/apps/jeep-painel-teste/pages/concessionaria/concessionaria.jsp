<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<slice:lookup var="concessionaria" type="<%=br.com.isobar.jeep.portal.model.Concessionaria.class%>"/>
<p>${concessionaria.nome}</p>
<p>${concessionaria.nomeFantasia}</p>
<p>${concessionaria.endereco}</p>
<p>${concessionaria.bairro}</p>
<p>${concessionaria.cidade}</p>
<p>${concessionaria.uf}</p>