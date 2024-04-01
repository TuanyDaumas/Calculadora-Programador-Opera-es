/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularodaprogramador;
/**
 *
 * @author Tuany
 */
public class CalculadoraProgramador {
    
    private int valor1; // Atributo para armazenar o primeiro valor da operação
    private int valor2; // Atributo para armazenar o segundo valor da operação
    
    // Métodos set e get para o atributo valor1
    public void setValor1(int valor) {
        this.valor1 = valor;
    }

    public int getValor1() {
        return valor1;
    }

    // Métodos set e get para o atributo valor2
    public void setValor2(int valor) {
        this.valor2 = valor;
    }

    public int getValor2() {
        return valor2;
    }


    // Métodos para as operações matemáticas
    public int adicao(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public int subtracao(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public int multiplicacao(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public int divisao(int valor1, int valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return (int) valor1 / valor2;
    }
    
    // Método para converter de binário para decimal
    public int BinToDec(String valor) {
        return Integer.parseInt(valor, 2);
    }

    // Método para converter de octal para decimal
    public int OctalToDec(String valor) {
        return Integer.parseInt(valor, 8);
    }

    // Método para converter de hexadecimal para decimal
    public int HexToDec(String valor) {
        return Integer.parseInt(valor, 16);
    }

    // Método para converter de decimal para binário
    public String DecToBin(int valor) {
        return Integer.toBinaryString(valor);
    }

    // Método para converter de decimal para octal
    public String DecToOctal(int valor) {
        return Integer.toOctalString(valor);
    }

    // Método para converter de decimal para hexadecimal
    public String DecToHex(int valor) {
        return Integer.toHexString(valor);
    }

    // Método para converter de octal para hexadecimal
    public String OctalToHex(String valor) {
        int decValue = Integer.parseInt(valor, 8);
        return Integer.toHexString(decValue).toUpperCase();
    }

    // Método para converter entre bases (numero: o número a ser convertido, baseInicial: a base numérica inicial do número e novaBase: a base para a qual o número será convertido). 
    public String convertBetweenBases(String numero, String baseInicial, String novaBase) {
        int numDecimal; //armazena o número convertido para a base decimal.
        numDecimal = switch (baseInicial.toLowerCase()) {
            case "bin" -> Integer.parseInt(numero, 2);
            case "oct" -> Integer.parseInt(numero, 8);
            case "hex" -> Integer.parseInt(numero, 16);
            default -> Integer.parseInt(numero);
        }; //O método retorna uma String, que é o número convertido para a nova base.

        return switch (novaBase.toLowerCase()) {
            case "bin" -> Integer.toBinaryString(numDecimal);
            case "oct" -> Integer.toOctalString(numDecimal);
            case "hex" -> Integer.toHexString(numDecimal);
            default -> String.valueOf(numDecimal);//se não houver a escolha da base retorna o número convertido na base decimal.
        }; 
    }
}