package com.banco;
public class CuentaCorriente extends Cuenta {

    private float sobregiro = 0;
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
        } else {
            sobregiro = cantidad - saldo;
            saldo = 0;
        }
        numeroRetiros++;
    }
    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                float restante = cantidad - sobregiro;
                sobregiro = 0;
                saldo = saldo + restante;
            } else {
                sobregiro = sobregiro - cantidad;
            }
        } else {
            saldo = saldo + cantidad;
        }
        numeroConsignaciones++;
    }
    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }
    @Override
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Numero de transacciones: " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sobregiro: " + sobregiro);
    }
}