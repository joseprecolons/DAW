<?php
class CotxeData
{
    function __construct() {

    }

    function getAllCotxes($mysqli) {
        $sql = "SELECT * FROM cotxes";
        $result = $mysqli->query($sql);
        $cotxes = array();
        while ($row = $result -> fetch_array()) {
            array_push($cotxes, new cotxe($row[0], $row[1], $row[2], $row[3], $row[4]));
        }
        return $cotxes;
    }

    function insertCotxes() {

    }

    function modificaCotxe($mysqli, $cotxe) {
        $sql = "UPDATE cotxes SET marca = '".$cotxe -> getMarca()."', model = '".$cotxe -> getModel()."', 
        color = '".$cotxe -> getColor()."', idpropietari = ".$cotxe -> getPropietari()." WHERE idcotxe = ".$cotxe -> getId();
        $result = $mysqli->query($sql);
        return $result;
    }
}
?>