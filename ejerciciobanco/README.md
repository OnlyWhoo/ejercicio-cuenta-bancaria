## Diagrama de clases (Mermaid)

```mermaid
classDiagram

class Cuenta {
    #float saldo
    #int numeroConsignaciones
    #int numeroRetiros
    #float tasaAnual
    #float comisionMensual
    +Cuenta(float saldo, float tasaAnual)
    +void consignar(float cantidad)
    +void retirar(float cantidad)
    +void calcularInteres()
    +void extractoMensual()
    +void imprimir()
}

class CuentaAhorros {
    -boolean activa
    +CuentaAhorros(float saldo, float tasaAnual)
    +void consignar(float cantidad)
    +void retirar(float cantidad)
    +void extractoMensual()
    +void imprimir()
}

class CuentaCorriente {
    -float sobregiro
    +CuentaCorriente(float saldo, float tasaAnual)
    +void consignar(float cantidad)
    +void retirar(float cantidad)
    +void extractoMensual()
    +void imprimir()
}

Cuenta <|-- CuentaAhorros
Cuenta <|-- CuentaCorriente
```