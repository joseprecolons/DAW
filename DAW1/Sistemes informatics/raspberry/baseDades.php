<?php
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


$sql = "DROP TABLE IF EXISTS METEOROLOGIA;";

if(mysqli_query($conn, $sql)) 
{ 
    echo "La tabla ha sido eliminada correctamente.<br>"; 
}
else
{ 
    echo "Error en la eliminación de la tabla.<br>" . mysqli_error($conn); 
}

$sql = "CREATE TABLE METEOROLOGIA (
id int unsigned auto_increment primary key,
celsiu float not null,
fahrenheit float not null,
presure float not null,
data_hora datetime DEFAULT CURRENT_TIMESTAMP
)";

if ($conn->query($sql) === TRUE) {
  echo "Table METEOROLOGIA created successfully";
} else {  
  echo "Error creating table: " . $conn->error;
}
$conn->close();
?>