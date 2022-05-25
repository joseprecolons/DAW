<?php
function recollirDades($nomCamp) 
{
    return isset($_POST[$nomCamp]) ? $_POST[$nomCamp]:"";
}

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
    
    $sql = "SELECT idsoci, nomsoci FROM " . _TABLESOCIS . " s WHERE avatar IS NULL";
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
                    "idsoci" => $row["idsoci"],
                    "nomsoci" => $row["nomsoci"] 
                ];
                array_push($return, $fila);
            }
            return $return;
        }
    }
}

function getAllProfessions($mysqli)
{
    
    $sql = "SELECT * FROM " . _TABLEPROFESSIONS;
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
                    "idprofessio" => $row["idprofessio"],
                    "nomprofessio" => $row["nomprofessio"] 
                ];
                array_push($return, $fila);
            }
            return $return;
        }
    }
}

function getAllSocis($mysqli)
{
    
    $sql = "SELECT nomsoci, nomprofessio, avatar FROM " . _TABLESOCIS . " s INNER JOIN " . _TABLEPROFESSIONS . " p";
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
                    "nomprofessio" => $row["nomprofessio"],
                    "avatar" => $row["avatar"]
                ];
                array_push($return, $fila);
            }
            return $return;
        }
    }
}

function getImagesProfessio($mysqli, $idprofessio) {
    $sql = "SELECT imatge FROM " . _TABLEGALERIA . " WHERE idprofessio = ".$idprofessio;
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
                    "imatge" => $row["imatge"]
                ];
                array_push($return, $fila);
            }
            return $return;
        }
    }
}

