<?php
require_once("inc/constants.inc");
require_once("inc/functions.inc");

$jsonData = array();

    $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
    if (!$mysqli) {
        $jsonData["success"]= false;
        $jsonData["data"]["message"]= "Error: Connexió amb BBDD"; 
    } else {
        $row = getSoci($mysqli);  
        if (!$row) {
            $jsonData["success"] = false;
            $jsonData["data"]["message"] = "Error: Consulta Select"; 
        } else if($row == -1) {
            $jsonData["success"] = false;
            $jsonData["data"]["message"] = "Error: No s'ha trobat el soci"; 
        } else {
            $jsonData["success"] = true;
            $jsonData["data"]["message"] = "Ok. S'ha trobat el soci";
            foreach ($row as $key => $value) {
                $jsonData["data"]["soci"]["$key"] = $value;
            }

        }
    }


echo json_encode($jsonData);

?>