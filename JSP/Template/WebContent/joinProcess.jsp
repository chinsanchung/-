<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>
<%@ page import="member.MemberDBBean"%>
<% request.setCharacterEncoding ("utf-8"); %>
<jsp:useBean id="memberBean" class="member.MemberDataBean" scope="page">
	<jsp:setProperty name="memberBean" property="*" />
</jsp:useBean>
<%
	MemberDBBean manager= MemberDBBean.getInstance();
	int res=manager.insertMember(memberBean);
	
	if(res!=0) {
		out.println("<script>");
		out.println("alert('회원가입 성공')");
		out.println("location.href='./template.jsp?page=loginForm'");
		out.println("</script>");
	} else {
		out.println("<script>");
		out.println("alert('회원가입 실패')");
		out.println("history.back();");
		out.println("</script>");	
	}
%>

