<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h2  style="border: 2px solid cyan; color: red; background-color: yellow;">
  <c:if  test="${msg ne null}">
     <c:out  value="${msg}"/>
  </c:if>
</h2>

<form  action="checkLogin"  method="post">
 <table>
    <tr>
      <td>Email: </td>  <td> <input type="text" name="email"></td>
    </tr>
    <tr>
      <td>Password: </td>  <td> <input type="password" name="password"></td>
    </tr>
    <tr>
      <td colspan="2"> <input type="submit" value="LOGIN"> </td>
    </tr>
 </table>
</form>
