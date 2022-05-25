Proceso Act16
	Definir N Como Entero;
	Definir suma Como Entero;
	Definir contador Como Entero;
	suma <- 0;
	contador <- 0;
	Leer N;
	Mientras contador < N Hacer
		contador <- contador +1;
		suma <- suma + contador;
	FinMientras
	Mostrar "Aquest es el resultat de la suma dels numeros: "+ConvertirATexto(suma);
FinProceso

	