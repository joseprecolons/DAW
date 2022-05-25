<?php

    function valorDaus($nDaus) {
        //Tira les vegadas que li pasis, un dau de entre el 1 i el 6
        $array = array();
        for ($i = 0; $i < $nDaus; $i++) {
            $array[$i] = rand(1, 6);
         }

         return $array;
    }

    function mostrarDadesPartida($array, $nDaus) {

        for ($i = 0; $i < $nDaus; $i++) {
        echo '<img src="img/' . $array[$i] . '.svg">';
        }
    }

    function puntsPartida($nMenorDaus, $arrayAtacant, $arrayDefensor ) {

        $array = array();

        $array[0] = 0;
        $array[1] = 0;
        for ($i = 0; $i < $nMenorDaus; $i++) {
            $array[1] = $arrayAtacant[$i] > $arrayDefensor[$i] ? ($array[1] + 1) : $array[1];
            $array[0] = $arrayAtacant[$i] <= $arrayDefensor[$i] ? ($array[0] + 1) : $array[0];
         }

         return $array;
        
    }

    function mostrarResultat($array) {
        echo '<p>L\'atacant ha perdut ' . $array[0] . ' unitats';
        echo '<p>El defensor ha perdut ' . $array[1] . ' unitats';
    }
?>