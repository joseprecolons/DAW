<?php
require_once("config.inc");
require_once("funcions.inc");

$nomcorredor = recollirDades("nomcorredor");
$puntuacio = recollirDades("puntuacio");
$idequip = recollirDades("equip");
if (isset($_FILES["img"])) {
    $directori = "imgfotocorredor/";
    $source_file = $_FILES["img"]["tmp_name"];
    $mysqli = ConnexioalaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
    $sql = "SELECT COUNT(*) FROM "._TAULACORREDOR;
    $res = $mysqli->query($sql);
    $row = $res->fetch_array();
    $tmp = $row["0"]+1;
    $dest_file = $directori.$tmp."_".$_FILES['img']['name'];

    move_uploaded_file($source_file, "../".$dest_file);
    $mysqli = ConnexioalaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
    
    $sql = "INSERT INTO "._TAULACORREDOR." (nom, puntuacio, idequip, foto) VALUES ('".$nomcorredor."', ".$puntuacio.", ".$idequip.",  '".$dest_file."')";
    $res = $mysqli->query($sql);
    header("location:../resultat.php?corredor=OK"); 
    exit();
} else {
    header("location:../resultat.php?corredor=KO"); 
    exit();
}

 ?>
