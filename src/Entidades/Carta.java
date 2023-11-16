
package Entidades;


public class Carta {
    private int id;
    private int numero;
    private int tipo;

    public Carta(int id, int numero, int tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "id_carta:" + id + "/,/N" + numero + " /tipo=" + tipo ;
    }
    
    
}
