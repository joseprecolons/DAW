<?php

    function recollirDades($nomCamp) {
        return isset($_POST[$nomCamp]) ? $_POST[$nomCamp]:"";
    }
    
    function connectaBBDD($server, $user, $passwd, $namebbdd) {

        //Sempre amb aquest ordre
        $mysqli = new mysqli($server, $user, $passwd, $namebbdd);
        if (!$mysqli -> connect_errno) {
            $mysqli -> set_charset("utf8");
        } else {
            $mysqli = false;
        }
        return $mysqli;
    }

    function getSelectDataSocis($mysqli, $nameSelect, $idSelect) {
        $return = "";
        $sql = "SELECT id_soci, nom_soci FROM ". _TABLESOCIS;
        $result = $mysqli -> query($sql);

        if (!$result) {
            return false;
        } else {
            if ($result -> num_rows == 0) {
                return $return;
            } else {
                $return .= '<select name="'.$nameSelect.'" id="'.$idSelect.'">';
                while ($row = $result -> fetch_array()) {
                    $return .= '<option value="'.$row["id_soci"].'">'.$row["nom_soci"].'</option>';
                }

                $return .= '</select>';
                return $return;
            }
        }
    }

    function getSelectDataProfessions($mysqli, $nameSelect, $idSelect, $defaultValue = null) {
        $return = "";
        $sql = "SELECT id_professio, nom_professio FROM ". _TABLEPROFESSIONS;
        $result = $mysqli -> query($sql);

        if (!$result) {
            return false;
        } else {
            if ($result -> num_rows == 0) {
                return $return;
            } else {
                $return .= '<select name="'.$nameSelect.'" id="'.$idSelect.'">';
                while ($row = $result -> fetch_array()) {
                    $return .= '<option value="'.$row["id_professio"].'"'.
                    (($row["id_professio"] == $defaultValue)?"selected":"").'>'.$row["nom_professio"].'</option>';
                }

                $return .= '</select>';
                return $return;
            }
        }
    }
?>  