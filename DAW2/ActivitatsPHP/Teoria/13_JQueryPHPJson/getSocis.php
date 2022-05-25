<?php
require_once("inc/constants.inc");
require_once("inc/functions.inc");

$idSoci = isset($_POST["valIdSoci"])? $_POST["valIdSoci"]: "";
$jsonData = array();

if ($idSoci == "") {
    $jsonData["success"]= false;
    $jsonData["data"]["message"]= "No s'ha rebut el id soci"; 
} else {
    $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
    if (!$mysqli) {
        $jsonData["success"]= false;
        $jsonData["data"]["message"]= "Error: Connexió amb BBDD"; 
    } else {
        $row = getSoci($mysqli, $idSoci);  
        if (!$row) {
            $jsonData["success"] = false;
            $jsonData["data"]["message"] = "Error: Consulta Select"; 
        } else if($row == -1) {
            $jsonData["success"] = false;
            $jsonData["data"]["message"] = "Error: No s'ha trobat el soci"; 
        } else {
            $jsonData["success"] = true;
            $jsonData["data"]["message"] = "Ok. S'ha trobat el soci";
            $jsonData["data"]["soci"] = $row;

        }
    }
}

echo json_encode($jsonData);

?>