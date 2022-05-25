<?php
function connectaBBDD($server, $user, $passwd, $namebbdd)
{

    //Sempre amb aquest ordre
    $mysqli = new mysqli($server, $user, $passwd, $namebbdd);
    if (!$mysqli->connect_errno) {
        $mysqli->set_charset("utf8");
    } else {
        $mysqli = false;
    }
    return $mysqli;
}

function getSoci($mysqli, $idSoci)
{
    $sql = "SELECT nom_soci, nom_professio FROM " . _TABLESOCIS . " s INNER JOIN " . _TABLEPROFESSIONS . " p";
    $sql .= " ON s.id_professio = p.id_professio WHERE id_soci = $idSoci";
    $result = $mysqli->query($sql);

    if (!$result) {
        return false;
    } else {
        if ($result->num_rows == 0) {
            return -1;
        } else {
            $row = $result->fetch_array();
            return $row;
        }
    }
}
