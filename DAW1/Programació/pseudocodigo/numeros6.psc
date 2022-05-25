Proceso enunciat14
	definir NF Como Entero;
	definir COM Como Entero;
	definir NUM Como Entero;
	COM<-1;
	NF<-0;
	Leer NUM;
	Repetir
		Si NUM%COM=0 Entonces
			NF<-NF + COM;
		Fin Si
	COM<-COM + 1;
	Hasta Que NUM = COM + 1
	Mostrar NF;
FinProceso