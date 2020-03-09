package br.imd.ufrn.agenda;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda ag = new Agenda("dd/MM/yyyy");
        Scanner data = new Scanner(System.in);
        String data_string;
        System.out.println("Digite a data ");
        while (!ag.setDate(data.nextLine())) {
            System.out.println("Digite a data ");
        }
        Scanner anotacao = new Scanner(System.in);
        System.out.println("Digite a anotação para o dia");
        ag.setAnnotation(anotacao.nextLine());
        System.out.println("Data agendada: " + ag.getDateString() + "\nAnotação: " + ag.getAnnotation());
    }
}
