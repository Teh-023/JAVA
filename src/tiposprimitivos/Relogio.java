package tiposprimitivos;

public class Relogio {

	public static void main(String[] args) {
		int horas, minutos, segundos;
		for(horas = 0; horas < 24; horas++) {
			for(minutos = 0; minutos < 60; minutos++) {
				for(segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas + "h:" + minutos + "min:" + segundos + "s");
					try {
						Thread.sleep(segundos = 1000);
						if(segundos == 125) {
							System.exit(segundos =  0);
						}
					}catch (InterruptedException erro) {
						erro.toString();
					}
				}
			}
		}


	}

}
