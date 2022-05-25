<?php
require_once("inc/constants.inc");
require_once("inc/functions.inc");

$param = $_POST["param"];
$idprofessio = $_POST["idprofessio"];

$jsonData = array();

    $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
    if (!$mysqli) {
        $jsonData["success"]= false;
        $jsonData["data"]["message"]= "Error: Connexió amb BBDD"; 
    } else {
        if ($param == "1") {
            $row = getSoci($mysqli);  
        } else if ($param == "2"){
            $row = getAllProfessions($mysqli);
        } else if ($param == "3"){
            $row = getAllSocis($mysqli);
        } else  if ($param == "4") {
            $row = getImagesProfessio($mysqli, $idprofessio);
        }
        if (!$row) {
            $jsonData["success"] = false;
            $jsonData["data"]["message"] = "Error: Consulta Select"; 
        } else if($row == -1) {
            $jsonData["success"] = false;
            $jsonData["data"]["message"] = "Tots els socis, ja tenen imatge assignada"; 
        } else {
            $jsonData["success"] = true;
            $jsonData["data"]["message"] = "Ok. S'ha trobat el valor";
            foreach ($row as $key => $value) {
                $jsonData["data"]["list"]["$key"] = $value;
            }

        }
    }


echo json_encode($jsonData);
?>