Proceso act23
	Definir opcio, nom Como Caracter;
	Definir opcio1, opcio2, opcio3, opcio4, hectarees Como Entero;
	Definir resultat Como Real;
	Definir resultatfinal, descompte Como Real;
	Definir grangers Como Entero;
	Definir comptadorgrangers Como Entero;
	comptadorgrangers <- 0;
	grangers <- 50;
	opcio1 <- 50;
	opcio2 <- 70;
	opcio3 <- 80;
	opcio4 <- 190;
	Leer nom;
	Leer opcio;
	Leer hectarees;
	
	Repetir
	Si opcio = herbes Entonces
		Si hectarees > 100 Entonces
			resultat <- (opcio1 * hectarees) - (hectarees * 0.05);
		SiNo
			resultat <- opcio1 * hectarees;
		FinSi
	SiNo
		Si opcio = mosques
			Si hectarees > 100 Entonces
				resultat <- (opcio2 * hectarees) - (hectarees * 0.05);
			SiNo
				resultat <- opcio2 * hectarees;
			FinSi
		SiNo
			Si opcio = cucs Entonces
				Si hectarees > 100 Entonces
					resultat <- (opcio3 * hectarees) - (hectarees * 0.05);
				SiNo
					resultat <- opcio3 * hectarees;
				FinSi
			SiNo
				Si opcio = tot Entonces
					Si hectarees > 100 Entonces
						resultat <- (opcio4 * hectarees) - (hectarees * 0.05);
					SiNo
						resultat <- opcio4 * hectarees;
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	Si resultat > 10000 Entonces
		descompte <- resultat - 10000;
		descompte <- descompte * 0.1;
		resultatfinal <- resultat - descompte;
	FinSi
	
	Mostrar "El compte del granger " nom "es de" resultatfinal;
	comptadorgrangers <- comptadorgrangers + 1;
Hasta Que comptadorgrangers = 50;
FinProceso
