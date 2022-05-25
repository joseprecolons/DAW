<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Latest compiled and minified CSS -->

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.1/css/all.css" integrity="sha384-vp86vTRFVJgpjF9jiIGPEEqYqlDwgyBgEF109VFjmqGmIY/Y4HV4d3Gp2irVfcrp" crossorigin="anonymous">

    <?php
        use PHPMailer\PHPMailer\PHPMailer;
        use PHPMailer\PHPMailer\SMTP;
        use PHPMailer\PHPMailer\Exception;

        require_once "vendor/autoload.php";

        $mail = new PHPMailer(true);

        //Configurar PHPMailer para usar SMTP.
        $mail->isSMTP();
        //Configurar el nombre de host SMTP
        $mail->Host = "smtp.gmail.com";
        //Pon esto en true si el host SMTP requiere autenticación para enviar el correo electrónico
        $mail->SMTPAuth = true;
        //Proporciona el nombre de usuario y la contraseña
        $mail->Username = "joseprecolons2000@ginebro.cat";
        $mail->Password = "redslader99";
        //Si el SMTP requiere una encriptación TLS, entonces configúralo
        $mail->SMTPSecure = "tls";
        //Configurar el puerto TCP para conectarse a
        $mail->Port = 587;

        $mail->From = "joseprecolons2000@ginebro.cat";
        $mail->FromName = "Josep Recolons";

        $mail->addAddress("joseprecolons2000@ginebro.cat", "Josep Recolons");

        $mail->isHTML(true);
        
        $myfile = fopen("dadesT.txt", "r") or die("Unable to open file!");
        $t = fgets($myfile); 
        fclose($myfile);

        $myfile = fopen("dadesP.txt", "r") or die("Unable to open file!");
        $p = fgets($myfile);
        fclose($myfile);

        $myfile = fopen("dadesH.txt", "r") or die("Unable to open file!");
        $h = fgets($myfile);
        fclose($myfile);

        $mail->Subject = "meteorologia Pol i Josep";
        $mail->Body = "$t $p $h";
        $mail->AltBody = "Esta es la versión de texto simple del contenido del correo electrónico";

            try {
                $mail->send();
                echo "El mensaje ha sido enviado correctamente";
            } catch (Exception $e) {
                echo "Mailer Error: " . $mail->ErrorInfo;
            }
        ?>
</head>
<body class="bg-dark">
    <main class="container-flex">
        <div class="row justify-content-center">
        <h1 class="display-1 text-white bg-danger pt-3 pb-3"> <i class="fas fa-thermometer-half ml-3 mr-3"></i> TEMPERATURES <i class="fas fa-thermometer-half  ml-3 mr-3"></i></h1> 
        </div>
        
        <div class="container">
                <div class="row justify-content-center">
                  <div class="card col-4">
                    <div class="card-body text-center">
                      <h4 class="card-title text-dark">
                            <?php $myfile = fopen("dadesT.txt", "r") or die("Unable to open file!");
                            echo fgets($myfile);
                            fclose($myfile);
                            ?>
                        </h4>
                    </div>
                  </div>
                  <div class="card col-4">
                    <div class="card-body text-center">
                    <h4 class="card-title text-dark">
                            <?php  
                                $myfile = fopen("dadesP.txt", "r") or die("Unable to open file!");
                                echo fgets($myfile);
                                //$p = fgets($myfile);
                                fclose($myfile);
                            ?>
                        </h4>
                    </div>
                  </div>
                  <div class="card col-4">
                    <div class="card-body text-center">
                    <h4 class="card-title text-dark">
                            <?php 
                                $myfile = fopen("dadesH.txt", "r") or die("Unable to open file!");
                                echo fgets($myfile);
                                //$h = fgets($myfile);
                                fclose($myfile);
                            ?>
                        </h4>
                    </div>
                  </div>

                  <input type="submit" name="" value="Envíar Informació" id="boton1" onclick = "enviarCorreu();">
            </div>
    </main>
</body>
</html>
