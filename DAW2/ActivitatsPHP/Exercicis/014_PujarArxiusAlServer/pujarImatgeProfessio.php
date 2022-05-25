<?php
require_once("inc/constants.inc");
require_once("inc/functions.inc");

$idprofessio = recollirDades("professio");

if (isset($_FILES["img"])) {
    $directori = "imatges/";
    $source_file = $_FILES["img"]["tmp_name"];
    $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
    $sql = "SELECT COUNT(*) FROM "._TABLEGALERIA." WHERE idprofessio = ".$idprofessio;
    $res = $mysqli->query($sql);
    $row = $res->fetch_array();
    $tmp = $row["0"]+1;
    $dest_file = $directori.$tmp."_".$idprofessio."_".$_FILES['img']['name'];
    if (file_exists($dest_file)) {
        header("location:index.php?error=1");
        //En aquest cas es imposible repetir el nom de l'arxiu, perquè porta el id del usuari
    }else {
        move_uploaded_file($source_file, $dest_file);
        $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);

        $sql = "INSERT INTO "._TABLEGALERIA." (idprofessio, imatge) VALUES (".$idprofessio.", '".$dest_file."')";
        $res = $mysqli->query($sql);
        header("location:index.php?img=OK"); 
    }
} else {
    header("location:index.php?img=KO"); 
}
?>