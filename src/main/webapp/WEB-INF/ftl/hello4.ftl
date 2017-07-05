<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>hello4</title>
</head>
<body>
<h1>hello4是個ftl頁面</h1>

<script src="http://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script>
    $.ajax({
        type: "post",
        url: "/hello5.do",
        data: {'id':'2321','name':'yzy,aaa','name2':'admin'},
        async: false,
        success: function (data) {
            data = JSON.parse(data);
            alert(data);
        }
    });
</script>
</body>
</html>