package com.banco;
public class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
        numeroConsignaciones++;
    }
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            numeroRetiros++;
        }
    }
    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12 / 100;
        float interesMensual = saldo * tasaMensual;
        saldo = saldo + interesMensual;
    }
    public void extractoMensual() {
        saldo = saldo - comisionMensual;
        calcularInteres();
    }
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Consignaciones: " + numeroConsignaciones);
        System.out.println("Retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comision mensual: " + comisionMensual);
    }
}