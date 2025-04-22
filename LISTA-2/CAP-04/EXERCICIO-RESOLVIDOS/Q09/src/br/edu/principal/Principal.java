package br.edu.principal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
    
        Date dataHoraAtual = new Date();

    
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatoData.format(dataHoraAtual);


        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        String horaFormatada = formatoHora.format(dataHoraAtual);

       
        int dia = Integer.parseInt(dataFormatada.substring(0, 2));
        int mes = Integer.parseInt(dataFormatada.substring(3, 5));
        int ano = Integer.parseInt(dataFormatada.substring(6));

     
        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

       
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

    
        System.out.println("Hora Atual: " + horaFormatada);
    }
}
