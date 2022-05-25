Proceso Act18
	Definir num Como Entero;
	Definir N Como Entero;
	Definir contadornum Como Entero;
	Definir numprimer Como Entero;
	Definir num10 Como Entero;
	contadornum <- 0;
	num <- 1;
	numprimer <- 1;
	Mostrar "Introdueix un numero";
	Leer N;
	num10 <- N;
	Mientras numprimer <> 0 Hacer
		Mientras num10 >= num Hacer
			Si num10%num = 0 Entonces
				contadornum <- contadornum + 1;
			FinSi
			num <- num + 1;
		FinMientras
		Si contadornum = 2 Entonces
			Mostrar ConvertirATexto(numprimer) "es un numero primer";
		FinSi
		numprimer <- numprimer - 1;
		contadornum <- 1;
	FinMientras
FinProceso
