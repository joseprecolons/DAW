<?php
function recollirDades($nomCamp)
{
    return isset($_POST[$nomCamp]) ? $_POST[$nomCamp] : "";
}

function mostrarImatges($partCara) {
    $num = rand(1, 7);
    echo '<img src="imgs/retratos-' . $num. '-' . $partCara . '.jpg"></img>';
    return $num;
}

function mostrarImatgesNoRand($partCara, $persona) {
    echo '<img src="imgs/retratos-' . $persona. '-' . $partCara . '.jpg"></img>';
    return $persona;
}
?>