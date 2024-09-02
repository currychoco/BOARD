
function join() {
    const id =$("#id").val();
    const password = $("#password").val();
    const nickname = $("#nickname").val();

    $.ajax({
        type : "POST",
        url : "/join",
        contentType: "application/json",
        data : JSON.stringify({
            id : id,
            password : password,
            nickname : nickname
        })
    }).done(function(response){
        alert("회원가입 성공");
        location.href = "/login";
    }).fail(function (err){
        alert(err);
        location.href = "/join"
    });
}
