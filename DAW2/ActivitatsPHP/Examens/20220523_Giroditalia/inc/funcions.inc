<?php
function recollirDades($nomCamp) 
{
    return isset($_POST[$nomCamp]) ? $_POST[$nomCamp]:"";
}

  function ConnexioalaBBDD($server, $user, $passwd, $namebbdd){
    $mysqli = new mysqli($server, $user, $passwd, $namebbdd);
    if (!$mysqli->connect_errno) {
        $mysqli->set_charset("utf8");
    } else {
        $mysqli = false;
    }
    return $mysqli;
  }

  function getAllequips ($mysqli)
{
    
    $sql = "SELECT * FROM " . _TAULAEQUIP;
    $result = $mysqli->query($sql);

    $return = [];

    if (!$result) {
        return false;
    } else {
        if ($result->num_rows == 0) {
            return -1;
        } else {
            while ($row = $result -> fetch_array()) {
                $return .= "<option value='".$row["id"]."'>".$row["nomequip"]."</option>";
            }
            return $return;
        }
    }
}

function getAllCorredors ($mysqli)
{
    
    $sql = "SELECT id, nom FROM " . _TAULACORREDOR;
    $result = $mysqli->query($sql);

    $return = [];

    if (!$result) {
        return false;
    } else {
        if ($result->num_rows == 0) {
            return -1;
        } else {
            while ($row = $result -> fetch_array()) {
                $return .= "<option value='".$row["id"]."'>".$row["nom"]."</option>";
            }
            return $return;
        }
    }
}

 ?>
