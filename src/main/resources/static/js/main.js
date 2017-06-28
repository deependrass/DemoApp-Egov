$(document).ready(function () {

    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {

    var search = {}
    search["username"] = $("#username").val();

    $("#btn-search").prop("disabled", true);
    var un=$("#username").val();
    var psw=$("#password").val()


    //var ex="{\"name\":\"hmkcode\",\"address\":\"Koramangala\"}";
    var jSon= "{\"name\":\""+un+"\",\"address\":\""+psw+"\"}";
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "http://localhost:8080/callAjax",
        data: jSon,
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            console.log("SUCCESS : ", data);
            if(data.status=="Ok")
            	{
                 window.location.href="http://localhost:8080/welcome";
            	}
            else
            	{
            	window.location.href="http://localhost:8080/";
            	}
            
            var json = "<h4>Ajax Response</h4><pre>"
                + JSON.stringify(data, null, 4) + "</pre>";
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}