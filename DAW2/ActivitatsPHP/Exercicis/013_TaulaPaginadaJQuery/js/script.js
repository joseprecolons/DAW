$(document).ready(function () {
    $("#crearTaula").click(function () {
        $.ajax({
            url: "getSoci.php",
            type: "post",
            dataType: "json",
            beforeSend: function () {
                $("#response-container").html("Processant, si us plau espera...");
            },
            success: function (response) {
                if (response.success == true) {
                    var socis = response.data.soci;
                    var qttRegisters = Object.keys(socis).length;
                    var maxPages = Math.ceil(Object.keys(socis).length / 5) - 1;
                    $("#crearTaula").remove();
                    $("#response-container").empty();
                    $("#response-container").append(
                        "<input id='btnFirstPage' type='button' value='<<' />"
                    );
                    $("#response-container").append(
                        "<input id='btnPreviousPage' type='button' value='<' />"
                    );
                    $("#response-container").append(
                        "<input id='btnNextPage' type='button' value='>' />"
                    );
                    $("#response-container").append(
                        "<input id='btnLastPage' type='button' value='>>' />"
                    );
                    $("#response-container").append("<table>");

                    var pagTable = 0;
                    if (pagTable == maxPages) {
                        lastPageController = pagTable * 5 + qttRegisters - maxPages * 5;
                    } else {
                        lastPageController = pagTable * 5 + 5;
                    }
                    startTable();
                    for (let i = pagTable * 5; i < lastPageController; i++) {
                        $("table").append(
                            "<tr><td>" +
                            socis[i].nomsoci +
                            "</td><td>" +
                            socis[i].nomprofessio +
                            "</td></tr>"
                        );
                    }
                    disablePreviousBtns();

                    if (qttRegisters < 5) {  
                        disableNextBtns();
                        disablePreviousBtns();
                    }

                    $("#btnFirstPage").click(function () {
                        enableNextBtns();
                        pagTable = 0;
                        startTable();
                        for (let i = pagTable; i < pagTable * 5 + 5; i++) {
                            $("table").append(
                                "<tr><td>" +
                                socis[i].nomsoci +
                                "</td><td>" +
                                socis[i].nomprofessio +
                                "</td></tr>"
                            );
                        }
                        disablePreviousBtns();
                    });

                    $("#btnPreviousPage").click(function () {
                        enableNextBtns();
                        pagTable -= 1;
                        startTable();
                        for (let i = pagTable * 5; i < pagTable * 5 + 5; i++) {
                            $("table").append(
                                "<tr><td>" +
                                socis[i].nomsoci +
                                "</td><td>" +
                                socis[i].nomprofessio +
                                "</td></tr>"
                            );
                        }
                        if (pagTable == 0) {
                            disablePreviousBtns();
                        }
                    });

                    $("#btnNextPage").click(function () {
                        enablePreviousBtns();
                        pagTable += 1;

                        if (pagTable == maxPages) {
                            lastPageController = pagTable * 5 + qttRegisters - maxPages * 5;
                        } else {
                            lastPageController = pagTable * 5 + 5;
                        }

                        startTable();
                        for (let i = pagTable * 5; i < pagTable * 5 + 5 && i < lastPageController; i++) {
                            $("table").append(
                                "<tr><td>" +
                                socis[i].nomsoci +
                                "</td><td>" +
                                socis[i].nomprofessio +
                                "</td></tr>"
                            );
                        }
                        if (pagTable == maxPages) {
                            disableNextBtns();
                        }
                    });
                    $("#btnLastPage").click(function () {
                        enablePreviousBtns();
                        pagTable = maxPages;
                        lastPageController = pagTable * 5 + qttRegisters - maxPages * 5;
                        startTable();
                        for (let i = pagTable * 5; i < lastPageController; i++) {
                            $("table").append(
                                "<tr><td>" +
                                socis[i].nomsoci +
                                "</td><td>" +
                                socis[i].nomprofessio +
                                "</td></tr>"
                            );
                        }
                        disableNextBtns();
                    });
                } else {
                    $("#response-container").html(response.data.message);
                }
            },
            fail: function () {
                $("#response-container").html("ERROR.....");
            },
        });
    });
});

function startTable() {
    $("table").empty();
    $("table").append("<tr><th>Soci</th><th>Professió</th></tr>");
}
function disableNextBtns() {
    $("#btnLastPage").attr("disabled", true);
    $("#btnNextPage").attr("disabled", true);
}

function disablePreviousBtns() {
    $("#btnFirstPage").attr("disabled", true);
    $("#btnPreviousPage").attr("disabled", true);
}

function enableNextBtns() {
    $("#btnLastPage").attr("disabled", false);
    $("#btnNextPage").attr("disabled", false);
}

function enablePreviousBtns() {
    $("#btnFirstPage").attr("disabled", false);
    $("#btnPreviousPage").attr("disabled", false);
}
