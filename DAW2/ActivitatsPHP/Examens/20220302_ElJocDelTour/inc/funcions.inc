<?php

function recollirDades($nomCamp) {
    return isset($_POST[$nomCamp]) ? $_POST[$nomCamp]:"";
}

function getSelectCorredors($mysqli, $nameSelect, $idSelect) {
    $return = "";
    $sql = "SELECT id, nom FROM ". _TABLECORREDORS;
    $result = $mysqli -> query($sql);
    
    if ($result -> num_rows == 0) {
        return $return;
    } else {
        $return .= '<select name="'.$nameSelect.'" id="'.$idSelect.'">';
        while ($row = $result -> fetch_array()) {
            $return .= '<option value="'.$row["id"].'">'.$row["nom"].'</option>';
        }

        $return .= '</select>';
        return $return;
    }
}

function numRandom($min, $max, $noRepetir) {
    do {
        $tenimNum = true;
        $num = rand($min, $max);
        for ($i = 0; $i < sizeof($noRepetir); $i++) {
            if ($num == $noRepetir[$i]) {
                $tenimNum = false;
            }
        }
    } while ($tenimNum == false);
    
    return $num;
}

function comprovarUserExistent($mysqli) {
    $sql = "SELECT * FROM ". _TABLEPARTIDES ." WHERE idusuari = ". $_SESSION['idJugador'];
    $result = $mysqli -> query($sql);

    if ($result -> num_rows == 0) {
        $sql = "INSERT INTO "._TABLEPARTIDES." (idusuari, numpartida, puntuacio) VALUES (".$_SESSION['idJugador'].", 1, 0)";
        $mysqli -> query($sql);
    }
}

function reiniciarPuntuacio($mysqli) {
    $sql = "UPDATE ". _TABLEPARTIDES ." SET puntuacio = 0 WHERE idusuari = ".$_SESSION['idJugador'];
    $mysqli -> query($sql);
}

function getPuntuacio($mysqli) {
    $sql = "SELECT * FROM ". _TABLEPARTIDES ." WHERE idusuari = ". $_SESSION['idJugador'];
    $result = $mysqli -> query($sql);

    while ($row = $result -> fetch_array()) {
        $puntuacio = $row["puntuacio"];
    }

    return $puntuacio;
}

function sumarPunt($mysqli) {

    $puntuacio = getPuntuacio($mysqli);
    $puntuacio++;
    $sql = "UPDATE ". _TABLEPARTIDES ." SET puntuacio = ".$puntuacio.", datahora = SYSDATE() WHERE idusuari = ".$_SESSION['idJugador'];
    $mysqli -> query($sql);
}

?>