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

   ?>

      <div class="contenido">
        <form action="inc/modificarfoto.php" method='POST' enctype='multipart/form-data'>
            <table>
          <tbody>
            <tr>
              <td>Equip:</td>
              <td><select name="idcorredor" id="">
                <?php
                $mysqli = ConnexioalaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
                echo getAllCorredors($mysqli);
                ?>
              </select></td>
            </tr>
            <tr>
              <td>Foto:</td>
              <td><input type="file" name="img" id="fitxer"></td>
            </tr>
          </tbody>
        </table>
        <p>
           <input type="submit" value="Afegir">
        </p>
        </form>
      </div>

      <?php
        include("inc/peu.inc");
       ?>
    </div>

</body>
</html>
