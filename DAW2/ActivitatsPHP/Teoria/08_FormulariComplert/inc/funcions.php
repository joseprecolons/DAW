<?php
function getDesplegable($nom, $id, $valors) {
    $return = '<select name"' . $nom. '" id = "'.$id.'">';

    foreach ($valors as $clau => $valor) {
        $return .= '<option value = "' . $clau . '"> ' .$valor. '</option>';
    }

    $return .= '</select>';
    return $return;
}

function recollirDades($nomCamp) {
    return isset($_POST[$nomCamp]) ? $_POST[$nomCamp]:"";
}

?>