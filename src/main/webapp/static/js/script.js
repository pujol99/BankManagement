$(document).ready(function () {
    $.ajaxSetup({ cache: false }); //Avoids Internet Explorer caching!


    $(document).on("click", ".menu", function (event) {
        $("#content").load($(this).attr("id"));
        event.preventDefault();
    });
});

