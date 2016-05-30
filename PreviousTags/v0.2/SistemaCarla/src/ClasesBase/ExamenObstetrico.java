/*
 Clase Base dedicada a los datos de un examen obstetrico;
 */
package ClasesBase;

/**
 *
 * @author Fran
 */
public class ExamenObstetrico {

    private int talla;
    private int peso;
    private float imc;
    private int au;//altura uterina (cm)
    private int pa;//presion arterial (mm/hg)    
    private int lcf;//latidos cardio fetales
    private char maf;//movimientos activos fetales (+ o -) options!
    private String observaciones;

    public ExamenObstetrico() {
    }

    public ExamenObstetrico(int talla, int peso, float imc, int au, int pa, int lcf, char maf, String observaciones) {
        this.talla = talla;
        this.peso = peso;
        this.imc = imc;
        this.au = au;
        this.pa = pa;
        this.lcf = lcf;
        this.maf = maf;
        this.observaciones = observaciones;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public int getAu() {
        return au;
    }

    public void setAu(int au) {
        this.au = au;
    }

    public int getLcf() {
        return lcf;
    }

    public void setLcf(int lcf) {
        this.lcf = lcf;
    }

    public char getMaf() {
        return maf;
    }

    public void setMaf(char maf) {
        this.maf = maf;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    
    
}
