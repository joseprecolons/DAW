Proceso inici
	NUM Entero
	Quadrat Entero;
	Doble Entero;
	Leer NUM;
	Quadrat<-NUM * NUM;
	Doble<-NUM + NUM;
	Si NUM > 21 Entonces
		Mostrar Doble
	SiNo
		Mostrar Quadrat
	Fin Si
FinProceso

Proceso inici
	NUM1 Entero
	NUM2 Entero;
	Leer NUM1;
	Leer NUM2;
	Si NUM1 = NUM2 Entonces
		Mostrar "Els dos n�meros son iguals";
	SiNo
		Si NUM1 > NUM2 Entonces
			Mostrar "El n�mero 1 es m�s gran que el n�mero 2";
		SiNo
			Mostrar "El n�mero 2 es m�s gran que el n�mero 1";
		Fin Si
	Fin Si
FinProceso

Proceso inici
	NUM Entero
	Leer NUM; 1
	Si (NUM > 0) Entonces 2
		Mostrar "Es positiu"; 3
	SiNo
		Si (NUM < 0) Entonces 4
			Mostrar "Es negatiu"; 5
		SiNo
			Mostrar "Es 0"; 6
		Fin Si
	Fin Si
FinProceso

