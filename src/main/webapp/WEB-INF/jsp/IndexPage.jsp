<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
    <title>Spring Boot ajax example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>
</head>
<body>


<div class="container" style="min-height: 500px">

    <div class="starter-template">
        <h1>Spring Boot AJAX Example</h1>

        <div id="feedback"></div>

        <form class="form-horizontal" id="search-form">
            <div class="form-group form-group-lg">
                <label class="col-sm-2 control-label">Username</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="username"/>
                </div>
                
                 <label class="col-sm-2 control-label">password</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="password"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" id="bth-search"
                            class="btn btn-primary btn-lg">Search
                    </button>
                </div>
            </div>
        </form>

    </div>

</div>

<div class="container">
    <footer>
        <p>
            � <a href="http://www.mkyong.com">Mkyong.com</a> 2017
        </p>
    </footer>
</div>

<script type="text/javascript"
        src="webjars/jquery/2.2.4/jquery.min.js"></script>

<script type="text/javascript" src="js/main.js"></script>

</body>
</html>