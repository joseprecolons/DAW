<?php
require_once("inc/constants.inc");
require_once("inc/functions.inc");

$idsoci = recollirDades("soci");

if (isset($_FILES["img"])) {
    $directori = "imatges/";
    $source_file = $_FILES["img"]["tmp_name"];
    $dest_file = $directori.$idsoci."_".$_FILES['img']['name'];
    if (file_exists($dest_file)) {
        header("location:index.php?img=KO");
        //En aquest cas es imposible repetir el nom de l'arxiu, perquè porta el id del usuari
    }else {
        move_uploaded_file($source_file, $dest_file);
        $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
        $sql = "UPDATE "._TABLESOCIS." SET avatar = '".$dest_file."' WHERE idsoci = ".$idsoci.";";
        $res = $mysqli->query($sql);
        header("location:index.php?img=OK"); 
    }
} else {
    header("location:index.php?img=KO"); 
}
?>