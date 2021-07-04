$(document).ready(function () {
    $.ajaxSetup({ cache: false }); //Avoids Internet Explorer caching!


    $(document).on("click", ".getList", function (event) {
        $("#content").load("GetTransactions");
        event.preventDefault();
    });
});

