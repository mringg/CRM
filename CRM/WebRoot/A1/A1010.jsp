<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
	</head>
	<body>
		<TABLE border="1" align="center" width="850px">
		<caption>
		员工信息管理界面
		<hr width="320">
		</caption>
			<TR>
				<TD>员工编号</TD>
				<TD>
				<s:textfield name="lg2102"/>
				</TD>
				<TD>员工部门</TD>
				<TD>
				<select>
				<option value="a">行政部</option>				
				</select>
				</TD>
			</TR>
			<TR>
			<TD>员工姓名</TD>
			<TD><s:textfield name="lg0202"/></TD>
			<TD>员工状态</TD>
			<TD>
			<select>
				<option value="1">在职</option>				
				<option value="2">离职</option>				
				<option value="3">过世</option>				
				</select>
			</TD>
			</TR>
			<TR>
				<TD>入职时间(起始)</TD>
				<TD><s:textfield name="blg0208"/></TD>
				<TD>入职时间(结束)</TD>
				<TD><s:textfield name="elg0208"/></TD>
			</TR>
			<!-- 迭代数据 -->
			<TR>
			</TR>
			<!-- 按钮 -->
			<TR>
				<TD colspan="100" align="center">
					<s:submit value="查询" name="next"/>
					<s:submit value="添加" name="next2"/>
				</TD>
			</TR>
			
		</TABLE>
	</body>
</html>
