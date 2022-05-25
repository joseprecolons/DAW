<?php

//Operadors d'increment i decrement

$a = 9;
$a++; //Post-increment

echo "El valor de a és " . $a; //valor = 10

++$a; //Pre-increment

echo "El valor de a és " . $a; //valor = 11

$b = $a++; //Primer retorna el valor i després incrementa
echo "El valor de a és " . $a;
echo "El valor de b és " . $b; //El valor de b = 11 i Valor de a = 12

$b = ++$a; //Primer incrementa i després assigna
echo "El valor de a és " . $a; //El valor de a = 13
echo "El valor de b és " . $b; //El valor de b = 13
?>