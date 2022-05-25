Proceso Inici
	Preu Real
	PreIva Real
	PreuTotal real
	Descompte real
	Iva real
	Leer Preu;
	Si Preu > 200 Entonces
		Descompte<-15%Preu;
		PreIva<-Descompte-Preu;
	SiNo
		PreIva<-Preu;
	Fin Si
	Iva<-21%PreIva;
	PreuTotal<-Iva-PreIva;
	Mostrar PreuTotal;
FinProceso

Proceso Inici
	Leer NUM1;
	Leer NUM2;
	Si (NUM1+NUM2) = 0 Entonces
		Mostrar "el resultat de la suma es 0";
	SiNo
		Si (NUM1+NUM2) > 0 Entonces
			Mostrar "el resultat de la suma es positiu";
		SiNo
			Mostrar "el resultat de la suma es negatiu";
		Fin Si
	Fin Si
	
	Si (NUM1-NUM2) = 0 Entonces
		Mostrar "el resultat de la resta es 0";
	SiNo
		Si (NUM1-NUM2) > 0 Entonces
			Mostrar "el resultat de la resta es positiu";
		SiNo
			Mostrar "el resultat de la resta es negatiu";
		Fin Si
	Fin Si
	
	Si (NUM1/NUM2) > 0 Entonces
			Mostrar "el resultat de la divisió es positiu";
	SiNo
			Mostrar "el resultat de la divisió es negatiu";
		
		Fin Si
	Si (NUM1*NUM2) = 0 Entonces
		Mostrar "el resultat de la multiplicació es 0";
	SiNo
		Si (NUM1*NUM2) > 0 Entonces
				Mostrar "el resultat de la multiplicació es positiu";
		SiNo
				Mostrar "el resultat de la multiplicació es negatiu";
		Fin Si
	Fin Si
FinProceso

Proceso Inici
	NUM1 entero;
	NUM2 entero;
	NUM3 entero;
	NUM4 entero;
	NUM5 entero;
	SUMA entero;
	NG<-0;
	NP<-0;
	Leer NUM1;
	Leer NUM2;
	Si NUM1 > NUM2 entonces
		NG<-NUM1;
		NP<-NUM2;
	SiNo
		NG<-NUM2;
		NP<-NUM1;
	FinSi
	Leer NUM3;
	Si NUM3 > NG Entonces
		NG<-NUM3;
	SiNo
		Si NUM3 < NP Entonces
			NP<-NUM3;
		Fin Si
	Fin Si
	Leer NUM4;
	Si NUM4 > NG Entonces
		NG<-NUM4;
	SiNo
		Si NUM4 < NP Entonces
			NP<-NUM4;
		Fin Si
	Fin Si
	Leer NUM5;
	Si NUM5 > NG Entonces
		NG<-NUM5;
	SiNo
		Si NUM5 < NP Entonces
			NP<-NUM5;
		Fin Si
	Fin Si
	SUMA<-((NUM1+NUM2+NUM3+NUM4+NUM5-NP-NG)/3);
	Mostrar SUMA;
FinProceso

Proceso Inici
	NUM1 entero;
	NUM2 entero;
	NUMX entero;
	COMPTADOR entero;
	SUMASIMPLE entero;
	SUMA entero;
	NG<-0;
	NP<-0;
	SUMASIMPLE<-0;
	COMPTADOR<-0;
	Leer NUM1;
	Leer NUM2;
	Si NUM1 > NUM2 entonces
		NG<-NUM1;
		NP<-NUM2;
	SiNo
		NG<-NUM2;
		NP<-NUM1;
	FinSi
	Mientras COMPTADOR < 3 Hacer
	leer NUMX;
	Si NUMX > NG Entonces
		NG<-NUMX;
	SiNo
		Si NUMX < NP Entonces
			NP<-NUMX;
		Fin Si
	Fin Si
	COMPTADOR<-(COMPTADOR + 1);
	SUMASIMPLE<-(SUMASIMPLE + NUMX);
FinMientras
SUMA<-((NUM1+NUM2+SUMASIMPLE-NP-NG)/3);
Mostrar SUMA;
FinProceso
	