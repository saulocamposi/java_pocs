<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:ui="http://java.sun.com/jsf/facelets"
      xmlns:h="http://java.sun.com/jsf/html">
<body>

<ui:composition template="/template.jsp">

  <ui:define name="title">
    <h:outputText value="Here is the title" />
  </ui:define>
  
  <ui:define name="body">    
    <h:outputText value="Here is the body"/>
  </ui:define>  
  
 
</ui:composition>

</body>
</html>