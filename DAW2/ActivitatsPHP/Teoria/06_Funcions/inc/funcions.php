<?php
    function sumaDigits($a, $b) {

        $resultat = $a + $b;

        return $resultat;
    }

    function mostrarSuma($a, $b) {

        echo "<h1> La suma dels valors ".$a." i ".$b." és ".sumaDigits($a, $b)."</h1>";
    }
?>