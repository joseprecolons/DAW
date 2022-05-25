Proceso act22
	Definir N, senar, parell, comptadorN, num, comptadorS Como Entero;
	
	comptadorS <- 0;
	comptadorN <- 0;
	parell <- 0;
	senar <- 1;
	
	Leer N;
	
	Repetir
		Leer num;
		
		Si num%2 = 0 Entonces
			parell <- parell + num;
		SiNo
			senar <- senar * num;
			comptadorS <- comptadorS + 1;
		FinSi
		
		comptadorN <- comptadorN + 1;
	Hasta Que comptadorN = N 
	Mostrar "El resultat de la suma dels numeros parells es " parell;
	
	Si comptadorS <> 0 Entonces
		
		Mostrar "El resultat de la multiplicació dels numeros senars es " senar;
		
	SiNo
		Mostrar "El resultat de la multiplicació dels numeros senars es " 0;
	FinSi
FinProceso
