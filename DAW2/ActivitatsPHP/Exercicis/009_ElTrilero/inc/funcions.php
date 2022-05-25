<?php
function recollirDades($nomCamp) {
    return isset($_POST[$nomCamp]) ? $_POST[$nomCamp]:"";
}

function afegirCartes() {
    for ($i = 0; $i < 3; $i++) {
        echo '<button type="submit" name="carta" id="carta'. $i .'" class="cartes" value="'. $i .'" style="font-size: 70px; width: 100px; height: 100px;border: 0;padding:0px 0px; ">
        <img src="imgs/carta.jpg" alt="" style="width: 200px;">
        </button>';
    }
}

?>