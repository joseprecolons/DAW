<?php
require_once("config.inc");
require_once("funcions.inc");

$idcorredor = recollirDades("idcorredor");

if (isset($_FILES["img"])) {
    $mysqli = ConnexioalaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);

    $sql = "SELECT foto, id FROM "._TAULACORREDOR." WHERE id = $idcorredor";
    $res = $mysqli->query($sql);
    if ($res) {
        $row = $res->fetch_array();
        unlink("../".$row[0]);
    }
    $directori = "imgfotocorredor/";
    $source_file = $_FILES["img"]["tmp_name"];
    $tmp = $row[1];
    $dest_file = $directori.$tmp."_".$_FILES['img']['name'];

    move_uploaded_file($source_file, "../".$dest_file);
    
    $sql = "UPDATE "._TAULACORREDOR." SET foto = '".$dest_file."' WHERE id = $idcorredor";
    $res = $mysqli->query($sql);
    header("location:../resultat.php?corredor=OK"); 
    exit();
} else {
    header("location:../resultat.php?corredor=KO"); 
    exit();
}

 ?>
