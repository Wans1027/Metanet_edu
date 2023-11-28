<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>jQuery Servlet 예제</title>
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
</head>
<body>

<div id="response"></div>

<script>
    $(document).ready(function() {
        // 서블릿에 Ajax 요청을 보냅니다.
        $.ajax({
            url: "${pageContext.request.contextPath}/YourServletURL", // 여기에 서블릿 URL을 입력하세요.
            type: 'GET', // 또는 'POST' 등 요청 메서드를 선택합니다.
            dataType: "json",
            success: function(data) {
                // 서블릿에서 받은 응답을 처리합니다.
                //$('#response').html(data);
                $.each(data, function (index, obj) {
                    $('#response').append(obj.writedate + "<br>");
                });
            },
            error: function(xhr, status, error) {
                // 오류가 발생한 경우 처리합니다.
                console.error('Error:', status, error);
            }
        });
    });
</script>

</body>
</html>