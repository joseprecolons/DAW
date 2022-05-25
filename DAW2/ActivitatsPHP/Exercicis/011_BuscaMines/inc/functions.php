<?php
function getDesplegable($nom, $id, $valors) {
    $return = '<select name ="'. $nom. '" id = "'. $id. '">';

    foreach ($valors as $clau => $valor) {
        $return .= '<option value = "'. $clau. '"> '. $valor. '</option>';
    }

    $return .= '</select>';
    return $return;
}

function recollirDades($nomCamp) {
    return isset($_POST[$nomCamp]) ? $_POST[$nomCamp]:"";
}

function omplirBombes($arrayInicial, $nivell) {
    for ($i = 0, $bombs = $nivell[2]; $i < $bombs; $i++) {
        $n1 = rand(0, $nivell[0]-1);
        $n2 = rand(0, $nivell[1]-1);
        if ($arrayInicial[$n1][$n2] != "*") {
            $arrayInicial[$n1][$n2] = "*";
        } else {
            $i--;
        }
    }
    return $arrayInicial;
}

function comrovarBombes($arrayInicial, $nivell) {
    for ($i = 0; $i < $nivell[0]; $i++) {
        for ($j = 0; $j < $nivell[1]; $j++) {
            $numBombes = 0;
            if ($arrayInicial[$i][$j] != "*") {
                
                if ($i-1 >= 0 && $j-1 >= 0 && $arrayInicial[$i-1][$j-1] == "*") {
                    $numBombes++;
                }
                if ($i-1 >= 0 && $arrayInicial[$i-1][$j] == "*") {
                    $numBombes++;
                }
                if ($i-1 >= 0 && $j+1 < $nivell[1] && $arrayInicial[$i-1][$j+1] == "*") {
                    $numBombes++;
                }
                if ($j-1 >= 0 && $arrayInicial[$i][$j-1] == "*") {
                    $numBombes++;
                }
                if ($j+1 < $nivell[1] && $arrayInicial[$i][$j+1] == "*") {
                    $numBombes++;
                }
                if ($i+1 < $nivell[0] && $j-1 >= 0 && $arrayInicial[$i+1][$j-1] == "*") {
                    $numBombes++;
                }
                if ($i+1 < $nivell[0] && $arrayInicial[$i+1][$j] == "*") {
                    $numBombes++;
                }
                if ($i+1 < $nivell[0] && $j+1 < $nivell[1] && $arrayInicial[$i+1][$j+1] == "*") {
                    $numBombes++;
                }
                $arrayInicial[$i][$j] = $numBombes;
            }
        }
    }
    return $arrayInicial;
}
