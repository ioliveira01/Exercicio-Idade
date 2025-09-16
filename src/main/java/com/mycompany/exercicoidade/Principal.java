/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicoidade;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita dados
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        // Verifica se o ano de nascimento é válido
        if (anoNascimento < anoAtual) {
            int idade = anoAtual - anoNascimento;
            System.out.println("A idade da pessoa é: " + idade + " anos.");
        } else {
            System.out.println("Ano de nascimento inválido! Deve ser menor que o ano atual.");
        }

        scanner.close();
    }
}
