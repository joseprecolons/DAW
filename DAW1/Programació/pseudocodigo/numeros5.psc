Proceso inici
	NUM enter
	Leer NUM;
		Mientras NUM <> 1 Hacer
			Si NUM%6=0 Entonces
				mostrar NUM;
			Fin Si
		NUM<-NUM - 1;
		Fin Mientras
FinProceso

Proceso Inici
	NG enter
	COM enter
	NUM enter
	NG<-0;
	COM<-(-1);
	Repetir
		Leer NUM;
		Si NUM > NG Entonces
			NG<-NUM;
		Fin Si
		COM<-COM + 1;
	Hasta Que NUM < 0
	Mostrar NG;
	Mostrar COM;
FinProceso
	