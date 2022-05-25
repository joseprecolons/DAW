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
        $myfile = fopen("dadesT.txt", "r") or die("Unable to open file!");
        $t = fgets($myfile); 
        fclose($myfile);

        $myfile = fopen("dadesP.txt", "r") or die("Unable to open file!");
        $p = fgets($myfile);
        fclose($myfile);

        $myfile = fopen("dadesH.txt", "r") or die("Unable to open file!");
        $h = fgets($myfile);
        fclose($myfile);

        $servername = "localhost";
        $username = "newuser";
        $password = "password";

        // Create connection
        $conn = new mysqli($servername, $username, $password);
        // Check connection
        if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
        }

        echo "Connected successfully";


        $sql = "USE DBPolJosep;";

        if(mysqli_query($conn, $sql)) 
        { 
            echo "La base de datos ha sido seleccionada correctamente.<br>"; 
        }
        else
        { 
            echo "Error en la eliminación en la seleccion de la base de datos.<br>" . mysqli_error($conn); 
        }

        $sql = "CREATE TABLE METEOROLOGIA (
        id int unsigned auto_increment primary key,
        celsius float not null,
        fahrenheit float not null,
        presure float not null,
        data_hora datetime DEFAULT CURRENT_TIMESTAMP
        )";

        if ($conn->query($sql) === TRUE) {
        echo "Table METEOROLOGIA created successfully";
            $sql = "INSERT INTO METEOROLOGIA(celsius, fahrenheit, presure) VALUES
            ($t, $p, $h)";

            if ($conn->query($sql) === TRUE) {
                echo "Table METEOROLOGIA created successfully";
                } else {  
                echo "Error creating table: " . $conn->error;
                }
        } else {  
            $sql = "INSERT INTO METEOROLOGIA(celsius, fahrenheit, presure) VALUES
            ($t, $p, $h)";
    
            if ($conn->query($sql) === TRUE) {
                echo "Table METEOROLOGIA created successfully";
                } else {  
                echo "Error creating table: " . $conn->error;
                }
        }
        $conn->close();
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
                            echo fgets($myfile) + "C";
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
                                echo fgets($myfile + "F");
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
                                echo fgets($myfile + "P");
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
