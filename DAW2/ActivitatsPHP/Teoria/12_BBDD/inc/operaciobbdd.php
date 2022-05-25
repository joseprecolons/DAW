<?php
    require_once("funcions.php");
    require_once("constant.php");

    $operacio = recollirDades("operacio");

    if ($operacio != "nou") {
        header("location:error.html");
        exit();
    } else {
        $nomSoci = recollirDades("nomSoci");
        $idProfessio = recollirDades("idProfessio");
        $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
    }
    if (!$mysqli) {
        header("location:../insert.php?error=1");
        exit();
    }
    $sql = "INSERT INTO "._TABLESOCIS." (nom_soci, id_professio) VALUES ('$nomSoci', $idProfessio)";

    $result = $mysqli -> query($sql);

        if (!$result) {
            header("location:../insert.php?error=2");
            exit();
        } else {
            header("location:../insert.php?error=0");
            exit();
        }
?>