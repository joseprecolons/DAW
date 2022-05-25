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

function getSoci($mysqli)
{
    
    $sql = "SELECT nomsoci, nomprofessio FROM " . _TABLESOCIS . " s INNER JOIN " . _TABLEPROFESSIONS . " p";
    $sql .= " ON s.idprofessio = p.idprofessio";
    $result = $mysqli->query($sql);

    $return = [];

    if (!$result) {
        return false;
    } else {
        if ($result->num_rows == 0) {
            return -1;
        } else {
            while ($row = $result -> fetch_array()) {
                $fila = [
                    "nomsoci" => $row["nomsoci"], 
                    "nomprofessio" => $row["nomprofessio"]
                ];
                array_push($return, $fila);
            }
            return $return;
        }
    }
}

