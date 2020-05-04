<%@taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>

<h3  style="border:2px solid cyan;">
  <c:if  test="${message ne null}">
     <c:out  value="${message}"/>
  </c:if>
</h3>

<form:form  action="saveUser"  method="post"   modelAttribute="customer">
 <table>
    <tr>
       <td>
          FirstName:
       </td>  
       <td>
          <form:input  path="firstName"/> 
       </td>
       <td>
          <form:errors  path="firstName"/>
       </td>
    </tr>
    
    <tr>
       <td>
          LastName:
       </td>  
       <td>
          <form:input  path="lastName"/> 
       </td>
       <td>
          <form:errors  path="lastName"/>
       </td>
    </tr>
    
    <tr>
       <td>
          Email:
       </td>  
       <td>
          <form:input  path="email"/> 
       </td>
       <td>
          <form:errors  path="email"/>
       </td>
    </tr>
    
    <tr>
       <td>
          Password:
       </td>  
       <td>
          <form:password  path="password"/> 
       </td>
       <td>
          <form:errors  path="password"/>
       </td>
    </tr>
    
    <tr>
       <td>
          Gender:
       </td>  
       <td>
          <form:radiobutton  path="gender" value="MALE"  label="male"/>
          <form:radiobutton  path="gender" value="FEMALE"  label="female"/>
          <form:radiobutton  path="gender" value="OTHER"  label="other"/>
       </td>
       <td>
          <form:errors  path="gender"/>
       </td>
    </tr>
    
    <tr>
       <td>
           Country:
       </td>
       <td>
           <form:select  path="country">
              <form:option  value="">---select country---</form:option>
              <form:options  items="${customer.countries}"/>
           </form:select>
       </td>
       <td>
           <form:errors  path="country"/>
       </td>
    </tr>
    
    <tr>
       <td  colspan="3"  align="center">
          <input  type="submit"  value="REGISTER">  
       </td>
    </tr>
 </table>
</form:form><%@taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>

<h3  style="border:2px solid cyan;">
  <c:if  test="${message ne null}">
     <c:out  value="${message}"/>
  </c:if>
</h3>

<form:form  action="saveUser"  method="post"   modelAttribute="customer">
 <table>
    <tr>
       <td>
          FirstName:
       </td>  
       <td>
          <form:input  path="firstName"/> 
       </td>
       <td>
          <form:errors  path="firstName"/>
       </td>
    </tr>
    
    <tr>
       <td>
          LastName:
       </td>  
       <td>
          <form:input  path="lastName"/> 
       </td>
       <td>
          <form:errors  path="lastName"/>
       </td>
    </tr>
    
    <tr>
       <td>
          Email:
       </td>  
       <td>
          <form:input  path="email"/> 
       </td>
       <td>
          <form:errors  path="email"/>
       </td>
    </tr>
    
    <tr>
       <td>
          Password:
       </td>  
       <td>
          <form:password  path="password"/> 
       </td>
       <td>
          <form:errors  path="password"/>
       </td>
    </tr>
    
    <tr>
       <td>
          Gender:
       </td>  
       <td>
          <form:radiobutton  path="gender" value="MALE"  label="male"/>
          <form:radiobutton  path="gender" value="FEMALE"  label="female"/>
          <form:radiobutton  path="gender" value="OTHER"  label="other"/>
       </td>
       <td>
          <form:errors  path="gender"/>
       </td>
    </tr>
    
    <tr>
       <td>
           Country:
       </td>
       <td>
           <form:select  path="country">
              <form:option  value="">---select country---</form:option>
              <form:options  items="${customer.countries}"/>
           </form:select>
       </td>
       <td>
           <form:errors  path="country"/>
       </td>
    </tr>
    
    <tr>
       <td  colspan="3"  align="center">
          <input  type="submit"  value="REGISTER">  
       </td>
    </tr>
 </table>
</form:form>