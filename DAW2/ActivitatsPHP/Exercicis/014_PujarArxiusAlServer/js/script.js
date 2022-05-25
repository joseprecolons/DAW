$(document).ready(function () {
    $("#pujarAvatar").click(function () {
        var parametres = {
            "param": "1"
        };
        $.ajax({
            data: parametres,
            url: "getData.php",
            type: "post",
            dataType: "json",
            beforeSend: function () {
                $("#response-container").html("Processant, si us plau espera...");
            },
            success: function (response) {
                if (response.success == true) {
                    var socis = response.data.list;
                    var qttRegisters = Object.keys(socis).length;
                    buttonsStatus("#pujarAvatar");
                    $(".resMsg").remove();
                    $("#response-container").empty();
                    $("#response-container").append("<form action='pujarImatgeSoci.php' method='POST' enctype='multipart/form-data'>");
                    $("form").append("<label>Soci:");
                    $("form").append("<select id='soci' name='soci'>");

                    for (let i = 0; i < qttRegisters; i++) {
                        $("select").append("<option value='" + socis[i].idsoci + "'>" + socis[i].nomsoci);
                    }
                    $("form").append("<br><input type='file' name='img' accept='image/jpeg'>");

                    $("form").append("<br><input type='submit'>");

                } else {
                    $("#response-container").empty();
                    buttonsStatus("#pujarAvatar");
                    $("#response-container").html("<p>"+response.data.message+"</p>");
                }
            },
            fail: function () {
                $("#response-container").html("ERROR.....");
            },
        });
    });

    $("#pujarImatge").click(function () {
        var parametres = {
            "param": "2"
        };
        $.ajax({
            data: parametres,
            url: "getData.php",
            type: "post",
            dataType: "json",
            beforeSend: function () {
                $("#response-container").html("Processant, si us plau espera...");
            },
            success: function (response) {
                if (response.success == true) {
                    var professions = response.data.list;
                    var qttRegisters = Object.keys(professions).length;
                    buttonsStatus("#pujarImatge");
                    $(".resMsg").remove();
                    $("#response-container").empty();
                    $("#response-container").append("<form action='pujarImatgeProfessio.php' method='POST' enctype='multipart/form-data'>");
                    $("form").append("<label>Professió:");
                    $("form").append("<select id='professio' name='professio'>");

                    for (let i = 0; i < qttRegisters; i++) {
                        $("select").append("<option value='" + professions[i].idprofessio + "'>" + professions[i].nomprofessio);
                    }
                    $("form").append("<br><input type='file' name='img' accept='image/jpeg'>");

                    $("form").append("<br><input type='submit'>");

                } else {
                    $("#response-container").html(response.data.message);
                }
            },
            fail: function () {
                $("#response-container").html("ERROR.....");
            },
        });
    });

    $("#llistaSocis").click(function () {
        var parametres = {
            "param": "3"
        };
        $.ajax({
            data: parametres,
            url: "getData.php",
            type: "post",
            dataType: "json",
            beforeSend: function () {
                $("#response-container").html("Processant, si us plau espera...");
            },
            success: function (response) {
                if (response.success == true) {
                    var socis = response.data.list;
                    var qttRegisters = Object.keys(socis).length;
                    buttonsStatus("#llistaSocis")
                    $(".resMsg").remove();
                    var maxPages = Math.ceil(Object.keys(socis).length / 5) - 1;
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
                    $("#response-container").append("<table border=1>");

                    var pagTable = 0;
                    if (pagTable == maxPages) {
                        lastPageController = pagTable * 5 + qttRegisters - maxPages * 5;
                    } else {
                        lastPageController = pagTable * 5 + 5;
                    }
                    startTable();
                    for (let i = pagTable * 5; i < lastPageController; i++) {
                        tableStuff(socis[i].nomsoci, socis[i].nomprofessio, socis[i].avatar)
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
                            tableStuff(socis[i].nomsoci, socis[i].nomprofessio, socis[i].avatar)
                        }
                        disablePreviousBtns();
                    });

                    $("#btnPreviousPage").click(function () {
                        enableNextBtns();
                        pagTable -= 1;
                        startTable();
                        for (let i = pagTable * 5; i < pagTable * 5 + 5; i++) {
                            tableStuff(socis[i].nomsoci, socis[i].nomprofessio, socis[i].avatar)
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
                            tableStuff(socis[i].nomsoci, socis[i].nomprofessio, socis[i].avatar)
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
                            tableStuff(socis[i].nomsoci, socis[i].nomprofessio, socis[i].avatar)
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

    $("#galeriaProfessio").click(function () {
        var parametres = {
            "param": "2"
        };
        $.ajax({
            data: parametres,
            url: "getData.php",
            type: "post",
            dataType: "json",
            beforeSend: function () {
                $("#response-container").html("Processant, si us plau espera...");
            },
            success: function (response) {
                if (response.success == true) {
                    var professions = response.data.list;
                    var qttRegisters = Object.keys(professions).length;
                    buttonsStatus("#galeriaProfessio");
                    $(".resMsg").remove();
                    $("#response-container").empty();
                    $("#response-container").append("<h2>Professions</h2>");
                    $("#response-container").append("<ol>");
                    for (let i = 0; i < qttRegisters; i++) {
                        $("ol").append(
                            "<li style='width:fit-content' class='selectProfessio' id='openImgsProfessions'" +
                            " name='" + professions[i].idprofessio + "'>" + professions[i].nomprofessio +
                            "  <i class='fa-solid fa-arrow-up-right-from-square' id='openImgsProfessions'" +
                            " name='" + professions[i].idprofessio + "'></i></li>"
                        );

                        $("i").css("cursor", "pointer");
                    }

                } else {
                    $("#response-container").html(response.data.message);
                }
            },
            fail: function () {
                $("#response-container").html("ERROR.....");
            },
        });
    });

    $('body').on('click', '#openImgsProfessions', function () {
        // alert($(this).attr('name'));
        var parametres = {
            "param": "4",
            "idprofessio": $(this).attr('name')
        };
        $.ajax({
            data: parametres,
            url: "getData.php",
            type: "post",
            dataType: "json",
            beforeSend: function () {
                $("#response-container").html("Processant, si us plau espera...");
            },
            success: function (response) {
                if (response.success == true) {
                    var images = response.data.list;
                    var qttRegisters = Object.keys(images).length;
                    buttonsStatus("");
                    $("#response-container").empty();
                    $("#response-container").append('<div id="carrusel" class="carousel slide" data-ride="carousel">');
                    $("#carrusel").append('<ul class="carousel-indicators"></ul>');
                    $("#carrusel").append('<div class="carousel-inner">');

                    for (let i = 0; i < qttRegisters; i++) {
                        $(".carousel-indicators").append('<li id="carruselli" data-target="#carrusel" data-slide-to="' + i + '"></li>');
                        if (i == 0) {
                            $('#carruselli').addClass('active');
                        }
                        $(".carousel-inner").append('<div id="carousel-item' + i + '" class="carousel-item"></div>');
                        if (i == 0) {
                            $('.carousel-item').addClass('active');
                        }

                        $("#carousel-item" + i).append('<img class="img-fluid" src="' + images[i].imatge + '" alt="' + i + '" width="1100" height="500"></img>');
                        if (i == 0) {
                            $('.img-fluid').addClass('active');
                        }
                    }
                    $("#carrusel").append('<a class="carousel-control-prev" href="#carrusel" data-slide="prev">' +
                        '<span class="carousel-control-prev-icon"></span>' +
                        '</a>' +
                        '<a class="carousel-control-next" href="#carrusel" data-slide="next">' +
                        '<span class="carousel-control-next-icon"></span>' +
                        '</a>');


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
    $("table").append("<tr><th>Soci</th><th>Professió</th><th>Avatar</th></tr>");
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

function tableStuff(name, profesio, img) {
    if (img != null) {
        $("table").append(
            "<tr><td>" +
            name +
            "</td><td>" +
            profesio +
            "</td><td><a href='" +
            img +
            "' target='_blank'>Image<a/></td></tr>"
        );

    } else {
        $("table").append(
            "<tr><td>" +
            name +
            "</td><td>" +
            profesio +
            "</td><td>No image</td></tr>"
        );
    }
}

function buttonsStatus(item) {
    $("input").prop("disabled", false);
    $(item).prop("disabled", true);
}