<?php
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

require("./model/cotxe.php");
require("./service/cotxeData.php");
require("./controller/cotxeController.php");

//Instancia el controlador
$controller = new CotxeController;

if ($_SERVER['QUERY_STRING']) {
    $navigation = explode("/", $_SERVER['QUERY_STRING']);
    if ($navigation[0] == 'veure') {
        $controller -> visualitza($navigation[1]);
    } else if ($navigation[0] == 'frmmodifica') {
        $controller -> frmModificaCotxe($navigation[1]);
    } else if ($navigation[0] == 'modificar') {
        $controller -> modificaCotxe($navigation[1]);
    }
} else {
    //Executa el mètode
    $controller -> index();
}



?>