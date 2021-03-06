<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
	<head>
		<script type="text/javascript">
	function onEdit(obj)
	{
		with(document.forms[0])
		{
			action="<%=path%>/c3040Action.action?lg0701="+obj;
			submit();
		}
	}
</script>
	</head>
	<body>
		<s:form action="c3031Action">
			<TABLE border="1" align="center" width="1000px">
				<caption>
					活动信息管理界面
					<hr width="320">
				</caption>
				<TR>
					<TD>
						活动名称
					</TD>
					<TD>
						<s:textfield name="qlg0702" />
					</TD>
					<TD>
						活动内容
					</TD>
					<TD>
						<s:textfield name="qlg0703" />
					</TD>
				</TR>
				<TR>
					<TD>
						负责人
					</TD>
					<TD>
						<s:textfield name="qlg0302" />
					</TD>
					<TD>
						活动状态
					</TD>
					<TD>
						<s:select name="qlg0707" list="oclg0707" listKey="key"
							listValue="value" headerKey="" headerValue="==不限=="
							cssStyle="width:153px" />
					</TD>
				</TR>
				<TR>
					<TD>
						报名开始时间
					</TD>
					<TD>
						<s:textfield name="blg0706" />
					</TD>
					<TD>
						报名截止时间
					</TD>
					<TD>
						<s:textfield name="elg0706" />
					</TD>
				</TR>
				<TR>
					<TD>
						活动开始时间
					</TD>
					<TD>
						<s:textfield name="blg0708" />
					</TD>
					<TD>
						活动截止时间
					</TD>
					<TD>
						<s:textfield name="elg0708" />
					</TD>
				</TR>
				<!-- 迭代数据 -->
				<s:if test="rows!=null">
				<TR><TD colspan="100"><table border="1" width="100%">
					<TR>
		

						<TD>
							序号
						</TD>

						<TD>
							活动名称
						</TD>

						<TD>
							活动内容
						</TD>

						<TD>
							预算
						</TD>

						<TD>
							人数
						</TD>

						<TD>
							报名截止时间
						</TD>

						<TD>
							举行活动时间
						</TD>

						<TD>
							负责人
						</TD>
						
						<TD>
							详情
						</TD>

					</TR>
					<s:iterator value="rows" status="st">
						<TR>
					
							<TD>
								<s:property value="#st.count" />
							</TD>

							<TD>
								<s:property value="lg0702" />
							</TD>

							<TD>
								<s:property value="lg0703" />
							</TD>

							<TD>
								<s:property value="lg0704" />
							</TD>

							<TD>
								<s:property value="lg0705" />
							</TD>

							<TD>
								<s:property value="lg0706" />
							</TD>

							<TD>
								<s:property value="lg0708" />
							</TD>

							<TD>
								<s:property value="lg0302" />
							</TD>

							<TD>
								<a href="#" onclick="onEdit(<s:property value="lg0701"/>)">详情</a>
							</TD>
							
						</TR>
					</s:iterator>
					</table>
					${requestScope.pageinfo }
					</TD></TR>
				</s:if>
				<!-- 按钮 -->
				<TR>
					<TD colspan="100" align="center">
						<s:submit value="查询" name="next" />
					</TD>
				</TR>
			</TABLE>
			<input type="hidden" name="parsList">
		</s:form>
	</body>
</html>
