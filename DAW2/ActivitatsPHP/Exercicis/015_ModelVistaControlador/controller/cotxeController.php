<?php

class CotxeController
{
    var $cotxes;
    var $idCotxe;
    private $mysqli;

    function __construct()
    {
        $this -> mysqli = new mysqli("localhost", "daw2", "daw22021", "MCV_Cotxes");
        $this -> mysqli -> set_charset("utf8");
        $mysqli =  $this -> mysqli;

        $cotxeData = new CotxeData;
        $this -> cotxes = $cotxeData -> getAllCotxes($mysqli);
    }

    public function index() {
        $rowset = $this -> cotxes;
        $controller = $this;
        require("view/index.php");
    }

    public function visualitza($idCotxe) {
        $cotxe = $this -> cotxes[$idCotxe-1];
        $controller = $this;
        require("view/infoCotxe.php");
    }

    public function frmModificaCotxe($idCotxe) {
        $cotxe = $this -> cotxes[$idCotxe-1];
        $controller = $this;
        require("view/modificarCotxe.php");
    }

    public function modificaCotxe($idCotxe) {
        $cotxe = $this -> cotxes[$idCotxe-1];
        $controller = $this;
        $cotxeModificar = new CotxeData;
        $cotxe -> setMarca($_POST['marca']);
        $cotxe -> setModel($_POST['model']);
        $cotxe -> setColor($_POST['color']);
        $cotxe -> setPropietari($_POST['propietari']);
        if ($cotxeModificar -> modificaCotxe($this->mysqli, $cotxe)) {
            require("view/modificaCotxe.php");
        }
        
    }

}
?>