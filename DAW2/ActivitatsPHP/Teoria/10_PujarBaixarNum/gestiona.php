<?php
    session_start();
    $contador = isset($_SESSION["contador"]) ? $_SESSION["contador"] : 0;
    $accio = isset($_POST["accio"]) ? $_POST["accio"] : "";

    if ($accio == "") {
        echo 'Error en la connexió amb el formulari';
        exit();

    } else if ($accio == "pujar") {
        if ($contador == 50) {
            $contador = -1;
        }
        $contador++;
    } else if ($accio == "baixar") {
        if ($contador == 0) {
            $contador = 51;
        }
        $contador--;
    }
    
    $_SESSION["contador"] = $contador;

    if ($accio == 1) {
        unset($_SESSION["contador"]);
    }
    
    header("location:index.php");

?>