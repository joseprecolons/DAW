Proceso Servir_comanda
	Leer comanda;
	Si te_credit Entonces
		Si hi_ha_estoc Entonces
			crear ordre produccio;
				Mientras no_ordre produccio acabada Hacer
					cal_esperar;
				Fin Mientras
					crear enviament
					enviar material al client
		SiNo
			Si hi_ha_previsio Entonces
				crear ordre produccio;
					Mientras no_ordre produccio acabada Hacer
						cal_esperar;
					Fin Mientras
						crear enviament
						enviar material al client
			SiNo
				afagirem material a la comanda del proveidor;
					Mientras no_arribi el material hacer 
						cal_esperar;
					Fin Mientras
						crear ordre produccio;
						Mientras no_ordre produccio acabada Hacer
							cal_esperar;
						Fin Mientras
							crear enviament
							enviar material al client
			Fin Si
		Fin Si
	SiNo
		rebutjar comanda;
	Fin Si
FinProceso
