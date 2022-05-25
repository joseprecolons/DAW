Proceso enunciat14a
	Definir NF Como Entero;
	Definir PD Como Entero;
	Definir NUM Como Entero;
	Definir COM Como Entero;
	NUM <- 1;
	Mientras NUM >= 0
		PD<-1;
		NF<-0;
		Leer NUM;
		Repetir
			COM <- PD;
			Repetir
				COM <- COM + PD;
			Hasta Que COM >= PD
			Si COM = PD Entonces
				NF <- NF + PD;
			FinSi
		Hasta Que COM <= 0
	Fin Mientras
Fin Proceso