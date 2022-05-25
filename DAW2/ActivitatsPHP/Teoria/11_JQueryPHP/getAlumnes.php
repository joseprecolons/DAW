<?php
$alumnes= array();

$alumnesG1[0]=array ("Nom" => "Tadej","Cognom"=>"Pogacar");
$alumnesG1[1]=array ("Nom" => "Primoz","Cognom"=>"Roglic");
$alumnesG1[2]=array ("Nom" => "Jonas","Cognom"=>"Vingegaard");

$alumnesG2[0]=array ("Nom" => "Richard","Cognom"=>"Carapaz");
$alumnesG2[1]=array ("Nom" => "Ben","Cognom"=>"O'Connor");
$alumnesG2[2]=array ("Nom" => "Wilco","Cognom"=>"Kelderman");

$alumnesG3[0]=array ("Nom" => "Enric","Cognom"=>"Mas");
$alumnesG3[1]=array ("Nom" => "Alexei","Cognom"=>"Lutsenko");
$alumnesG3[2]=array ("Nom" => "Guillaume","Cognom"=>"Martin");

$grup = isset($_POST["valgrp"])?$_POST["valgrp"]:"";

if ($grup ==""){
    echo "Error inesperat!!!!";
    exit();
} else {
    $arrayseleccionat = array();
    if ($grup == "1"){
        $arrayseleccionat = $alumnesG1;
    } else if ($grup == "2"){
        $arrayseleccionat = $alumnesG2;
    } else if ($grup == "3"){
        $arrayseleccionat = $alumnesG3;
    } else {
        echo "No tenim aquest grup d'alumnes!!!!";
        exit();
    }
    echo "<TABLE border=1><tr><td>Nom</td><td>Cognom</td></tr>";
    foreach ($arrayseleccionat as $key => $value) {
        echo "<tr><td>".$value["Nom"]."</td><td>".$value["Cognom"]."</td></tr>";
    }
    echo "</TABLE>";
    exit();
}





?>