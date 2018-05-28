<html>
    <head>
        <title>test</title>
        <script type="text/javascript" src="/hello.js"></script>
    </head>
    <body>

        <h1>Test /index/test</h1>

        <#list Request.bList as b>
            ${b.id} -- ${b.title}
        </#list>
        <br>
        ${Request.bList[0]}
        <br>
        ${bList[0]}

    </body>
</html>