<hr/>
<b>FirstName:</b>   ${param.firstname}  <br>
<b>MiddleName:</b>  ${param.middlename} <br>
<b>LastName:</b>    ${param.lastname}
<hr/>

<hr/>
<%= request.getParameter("firstname")%><br>
<%= request.getParameter("middlename")%><br>
<%= request.getParameter("lastname")%>
<hr/>