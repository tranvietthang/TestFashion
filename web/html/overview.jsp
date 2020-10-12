<%-- 
    Document   : overview
    Created on : Oct 12, 2020, 12:05:20 AM
    Author     : ThangCoi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="./css/style.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="wrap">
            <%@include file="header.jsp" %>
            <div class="content">
                <table>
                    <td class="left">
                        <p class="page-title">Overview - Blog</p>
                        <div class="section2">
                            <div class="table-head">
                                <p>${mindate} - ${maxdate}<span class="date-title">Date</span></p>
                            </div>
                            <table>
                                <c:forEach var="a" items="${pagging}">
                                    <tr>
                                        <td class="table-data"><a href="detail?id=${a.getId()}">${a.getTitle()}</a></td>
                                        <td class="table-data"><div id="like" >${a.getLike()}</div></td>
                                        <td class="table-data"><div id="comment" >${a.getComment()}</div></td>
                                        <td class="table-data date2">${a.getDateFormat()}</td>
                                    </tr>
                                </c:forEach>    
                            </table>

                            <c:forEach var="i" begin="1" end="${maxpage}">
                                <c:if test="${i==currentPage}">
                                    <a href="overview?index=${i}" class="index current">${i}</a>
                                </c:if>
                                <c:if test="${i!=currentPage}">
                                    <a href="overview?index=${i}" class="index">${i}</a>
                                </c:if>
                            </c:forEach>
                        </div>
                    </td>
                    <td class="right">
                        <%@include file="box.jsp" %>
                    </td>
                </table>
            </div>
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
