Proceso Act17
	Definir contadorleer Como Entero;
	Definir num Como Entero;
	contadorleer <- 0;
	Mientras contadorleer < 100 Hacer
		Leer num;
		Si num < 15 Entonces;
			Mostrar "aquest numero es menor de 15";
		FinSi
		Si num > 50 Entonces
			Mostrar "aquest numero es més gran de 50";
		FinSi
		Si num <= 55 y num >= 45 Entonces
			Mostrar "aquest numero està entre 45 y 55";
		FinSi
		contadorleer <- contadorleer + 1;
	FinMientras
FinProceso