package com.banco;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== CUENTA DE AHORROS ===");
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 5);

        cuentaAhorros.consignar(2000);
        cuentaAhorros.retirar(3000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(500);
        cuentaAhorros.retirar(200);
        cuentaAhorros.retirar(100);

        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

        System.out.println("\n=== CUENTA CORRIENTE ===");
        CuentaCorriente cuentaCorriente = new CuentaCorriente(10000, 5);

        cuentaCorriente.retirar(12000);
        cuentaCorriente.consignar(3000);
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();
    }
}