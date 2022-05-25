<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="css/estils.css">
</head>

<body>
<div class="ejf giro">
  <?php
    require_once("inc/config.inc");
    require_once("inc/funcions.inc");
    include("inc/capcalera.inc");
    $resultat = $_GET["corredor"];
   ?>

      <div class="contenido">

        <?php
           if ($resultat == 'OK') {
               echo "<p style='color:green;'>El corredor s'ha registrat correctament :)</p>";
           } else if ($resultat == 'KO') {
            echo "<p style='color:red;'>Hi ha agut algun error, i el corredor no ha sigut registrat :(</p>";
           }
         ?>

    </div>
    <?php
      include("inc/peu.inc");
     ?>
    </div>
</body>
</html>
