<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoang
  Date: 08-Oct-17
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Class</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<aside class="right-side">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            General Form Elements
            <small>Preview</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Forms</a></li>
            <li class="active">General Elements</li>
        </ol>
    </section>
<!-- Main content -->
<section class="content">
    <div class="row">
        <!-- left column -->
        <div class="col-md-6">
            <!-- general form elements -->
            <div class="box box-primary">
                <div class="box-header">
                    <h3 class="box-title">Quick Example</h3>
                </div><!-- /.box-header -->
                <!-- form start -->
                <form:form method="post" action="edit" role="form">
                    <div class="box-body">
                        <div class="form-group">
                            <label >Class name</label>
                            <form:input path="name" cssClass="form-control"/>
                        </div>
                        <div class="form-group">
                            <label>Group</label>
                            <form:select path="cate" cssClass="form-control">
                                <form:option value="${command.cate.name}"/>
                                <form:options items="${groups.get(1)}"/>
                            </form:select>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputFile">File input</label>
                            <input type="file" id="exampleInputFile">
                            <p class="help-block">Example block-level help text here.</p>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox"> Check me out
                            </label>
                        </div>
                    </div><!-- /.box-body -->

                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form:form>
            </div><!-- /.box -->
        </div>
    </div>
</section>
</aside>
<jsp:include page="footer.jsp"/>
</body>
</html>
