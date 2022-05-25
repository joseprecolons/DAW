Proceso Act19
	Definir nomalumne Como Caracter;
	Definir parcial Como Entero;
	Definir assignatura Como Entero;
	Definir semestra Como Entero;
	Definir parcial Como Entero;
	Definir comptadoralumne Como Entero;
	Definir numalmunes Como Entero;
	Definir comptadornotes Como Entero;
	Definir numnparcials Como Entero;
	Definir sumaparcials Como Entero;
	Definir nomalumnemesnota Como Caracter;
	Definir notamitjamesalta Como Entero;
	Definir comptadorultimparcial Como Entero;
	Definir millornotasemestral Como Entero;
	Definir comptadormillornotasemestral Como Entero;
	Definir comptadorassignatures Como Entero;
	Definir comptadorsemestral Como Entero;
	
	numalmunes <- 150;
	comptadoralumne <- 0;
	numparcials <- 30;
	comptadorparcials <- 0;
	sumaparcials <- 0;
	notamitjamesalta <- 0;
	comptadorultimparcial <- 0;
	millornotasemestral <- 0;
	comptadorassignatures <- 0;
	comptadorsemestral <- 0;
	
	
	Mientras comptadoralumne < numalumnes Hacer
		
		Mostrar "Escriu el teu nom";
		Leer nomalumne;
		
		Mientras comptadorparcials < numparcials Hacer
			
			Mostrar "Escriu la nota del teu parcial";
			
			Leer parcial;
			
			//comptadorultimparcial <- comptadorultimparcial + 1;
			
			//Si comptadorultimparcial = 2 Entonces
			//	
			//		parcial <- parcial * 1.20;
			//		comptadorultimparcial <- 0;
			//		
			//	FinSi
				
				sumaparcials <- sumaparcials + parcial;
			
		FinMientras
		
		Si sumaparcials > notamitjamesalta Entonces
			nomalumnemesnota <- nomalumne;
		FinSi
		
		comptadoralumne <- comptadoralumne + 1;
		
	FinMientras
	
FinProceso
