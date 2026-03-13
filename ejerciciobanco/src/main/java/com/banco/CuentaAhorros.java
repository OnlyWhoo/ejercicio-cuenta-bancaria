package com.banco;
public class CuentaAhorros extends Cuenta {

    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        activa = saldo >= 10000;
    }
    private void actualizarEstado() {
        activa = saldo >= 10000;
    }
    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
            actualizarEstado();
        } else {
            System.out.println("La cuenta esta inactiva, no se puede consignar.");
        }
    }
    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
            actualizarEstado();
        } else {
            System.out.println("La cuenta esta inactiva, no se puede retirar.");
        }
    }
    @Override
    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        actualizarEstado();
    }
    @Override
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Numero de transacciones: " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Cuenta activa: " + activa);
    }
}