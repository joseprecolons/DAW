Proceso Act15
	Definir jugadors Como Entero;
	Definir nomj Como Caracter;
	Definir pesj Como Entero;
	Definir pesj2 Como Entero;
	Definir pesf Como Entero;
	Definir edatj Como Entero;
	Definir edatj2 Como Entero;
	Definir edatf Como Entero;
	Definir equips Como Entero;
	Definir contador Como Entero;
	Definir equip Como Entero;
	Definir pestots Como Entero;
	Definir edattots Como Entero;
	Definir pestotsf Como Real;
	Definir edattotsf Como Real;
	Definir numpes Como Entero;
	Definir numedat Como Entero;
	Definir jedat Como Caracter;
	Definir jpes Como Caracter;
	Definir contadore Como Entero;
	Definir contadorp Como Entero;
	contadorp<-0;
	contadore<-0;
	contador<-0;
	pesj<-0;
	edatj<-0;
	equip<-0;
	equips<-10;
	jugadors<-22;
	pesj2<-0;
	edatj2<-0;
	pestots<-0;
	edattots<-0;
	numpes<-0;
	numedat<-0;
	Repetir
		Mientras jugadors>contador Hacer
			Mostrar "Escriu el nom del jugador";
			Leer nomj;
			Mostrar "Escriu el pes del jugador";
			Leer pesj;
			Mostrar "Escriu la edat del jugador";
			Leer edatj;
			Si pesj>contadorp Entonces
				contadorp<-pesj;
				jpes<-nomj;
			Fin Si
			Si edatj>contadore Entonces
				contadore<-edatj;
				jedat<-nomj;
			FinSi
			pesj2<-pesj2+pesj;
			edatj2<-edatj2+edatj;
			contador<-contador + 1;
		Fin Mientras
		contador<-0;
		pestots<- pestots + pesj2;
		edattots<- edattots + edatj2;
		pesf<-pesj2/jugadors;
		edatf<-edatj2/jugadors;
		equip<-equip+1;
	Mostrar "equip: "+ ConvertirATexto(equip);
	Mostrar "pes mitja equip: "+ ConvertirATexto(pesf);
	Mostrar "edat mitjana equip: "+ ConvertirATexto(edatf);
	Si pesf>75 Entonces
		numpes<-numpes +1;
	Fin Si
	Si edatf<20 Entonces
		numedat<-numedat +1;
	FinSi
	pesj2<-0;
	edatj2<-0;
	pesf<-0;
	edatf<-0;
Hasta que equip >= equips
pestotsf<-pestots/(jugadors*equips);
edattotsf<-edattots/(jugadors*equips);
Mostrar "pes mitja de tota la lliga: " + ConvertirATexto(pestotsf);
Mostrar "edat mitjana de tota la lliga: " + ConvertirATexto(edattotsf);
Mostrar "Nombre dequips amd un pes mitjà a 75kg: " + ConvertirATexto(numpes);
Mostrar "Nombre dequips amb una edat mitjana mes petita de 20 anys: " + ConvertirATexto(numedat);
Mostrar "El jugador amb més edat es: "+jedat;
Mostrar "El jugador amb més pes es: "+jpes;
FinProceso
