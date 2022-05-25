function cridaAjax(){

    var parametres = {
            "param1" : "VALOR1",
            "param2" : "VALOR2"
    };
    $.ajax({
            data:  parametres,
            url:   'getinfo.php',
            type:  'post',
            dataType: 'html', 
            beforeSend: function () {
                    $("#resultado").html("Processant, espera si us plau...");
            },
            success:  function (response) {
                    $("#resultat").html(response);
            }
    });
}

function getAlumnes(grup){
    var parametres = {
        "valgrp" : grup
    };
    $.ajax({
        data:  parametres,
        url:   'getalumnes.php',
        type:  'post',
        dataType: 'html', 
        beforeSend: function () {
                $("#contenttable").html("Processant, si us plau espera...");
        },
        success:  function (response) {
                $("#contenttable").html(response);
        }
});
    
}

/*-------------*/

function getSoci() {
    let idSoci = document.getElementById("soci").value;

    var parametres = {
        "valIdSoci" : idSoci
    };
    $.ajax({
        data:  parametres,
        url:   'getSocis.php',
        type:  'post',
        dataType: 'json', 
        beforeSend: function () {
            $("#response-container").html("Processant, si us plau espera...");
        },
        success:  function (response) {
            if (response.success) {
                $("#response-container").html(response.data.soci.nom_soci + " | " + response.data.soci.nom_professio);    
            } else {
                $("#response-container").html(response.data.message); 
            }
        },
        fail:  function () {
            $("#response-container").html("ERROR....");
    }
});
}