package br.edu.principal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Obter a data e hora atual do sistema
        Date dataHoraAtual = new Date();

        // Definindo o formato de data
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatoData.format(dataHoraAtual);

        // Definindo o formato de hora
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        String horaFormatada = formatoHora.format(dataHoraAtual);

        // Obter o dia, mês e ano da data
        int dia = Integer.parseInt(dataFormatada.substring(0, 2));
        int mes = Integer.parseInt(dataFormatada.substring(3, 5));
        int ano = Integer.parseInt(dataFormatada.substring(6));

        // Exibir a data por extenso
        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

        // Mostrar o mês por extenso
        String mesExtenso = "";
        switch (mes) {
            case 1: mesExtenso = "janeiro"; break;
            case 2: mesExtenso = "fevereiro"; break;
            case 3: mesExtenso = "março"; break;
            case 4: mesExtenso = "abril"; break;
            case 5: mesExtenso = "maio"; break;
            case 6: mesExtenso = "junho"; break;
            case 7: mesExtenso = "julho"; break;
            case 8: mesExtenso = "agosto"; break;
            case 9: mesExtenso = "setembro"; break;
            case 10: mesExtenso = "outubro"; break;
            case 11: mesExtenso = "novembro"; break;
            case 12: mesExtenso = "dezembro"; break;
        }
        System.out.println(mesExtenso);

        // Exibir a hora
        System.out.println("Hora Atual: " + horaFormatada);
    }
}
