<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="css/estils.css">

</head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #66CC99;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #66CC99;
}
</style>

<body>
<div class="ejf giro">
  <?php
    require_once("inc/config.inc");
    require_once("inc/funcions.inc");
    include("inc/capcalera.inc");
   ?>

      <div class="contenido">

        <?php
        $mysqli = ConnexioalaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
        if (!$mysqli) {
          echo "Error! No es pot conectar a la base de dades";
          exit();
        } else {
          echo "<TABLE >";
          $sql = "SELECT * FROM "._TAULACORREDOR." c INNER JOIN "._TAULAEQUIP." e ON c.idequip = e.id";
          $resultat = mysqli_query($mysqli, $sql);
          while ($row = mysqli_fetch_array($resultat, MYSQLI_ASSOC)) {
            echo "<TR>";
            echo "<TD>".$row["nom"]."</TD>";
            echo "<TD>".$row["puntuacio"]."</TD>";
            echo"<TD>".$row["nomequip"]."</TD>";
            if (!$row["foto"]) {
                echo"<TD>No image</TD>";
            } else {
                echo"<TD><a href='".$row["foto"]."' target='_blank'>Image</a></TD>";
            }
            echo "</TR>";
          }
          echo "</TABLE>";
        }

         ?>

      </div>

      <?php
        include("inc/peu.inc");
       ?>
    </div>

</body>
</html>
