package application.model;

import java.time.LocalDate;

/**
 * <h2> ----- Attributer ----- </h2>
 * <br>
 * <p1><b>mængdeL (double):</b><br>
 * Den nuværende væskemængde repræsenteret i Liter.</p1><br>
 * <br>
 * <p1><b>startDato (LocalDate):</b><br>
 * Datoen hvorpå {@code BundDestillat} objket laves.</p1><br>
 * <br>
 * <p1><b>kornsort (String):</b><br>
 * Sorten af korn anvendt til at lave {@code BundDestillat}.</p1><br>
 * <br>
 * <p1><b>maltBatchKG (double):</b><br>
 * Kilogram a malte anvendt i at lave {@code BundDestillat}.</p1><br>
 * <br>
 * <p1><b>rygemateriale (String):</b><br>
 * Det ekstra materiale der anvendes til at ryge destillatet.</p1><br>
 * <br>
 * <h3>--------------------------------------------</h3>
 */
public class BundDestillat extends Destillat{
    private double mængdeL;
    private LocalDate startDato;
    private String kornsort;
    private String rygemateriale;

    public BundDestillat(String navn, LocalDate startDato, String kornsort,
                         String rygemateriale, String init) {
        super(navn,null, init);
        this.startDato = startDato;
        this.kornsort = kornsort;
        this.rygemateriale = rygemateriale;

        vælgMaltBatch(navn, kornsort);
    }

    public BundDestillat(String navn, LocalDate startDato, LocalDate slutDato, String kornsort, String rygemateriale, String init,
                         double mængdeL, double alkoholProcent) {
        super(navn, slutDato, init);
        this.startDato = startDato;
        this.kornsort = kornsort;
        this.rygemateriale = rygemateriale;
        this.mængdeL = mængdeL;
        super.setAlkoholprocent(alkoholProcent);
        vælgMaltBatch(navn, kornsort);
    }

    private void vælgMaltBatch(String navn, String kornsort) {
        if(kornsort.equals("Byg")) {
            super.setMaltbatch(Maltbatch.SINGLE_CASK);
        }
        else {
            super.setMaltbatch(Maltbatch.GRAIN);
        }
    }

    //    Vi laver setter-metode for de variable, som kan tilføjes senere, således at et destillat kan oprettes i systemet
    //    Før det er færdigt

    public double getMængdeL() {
        return mængdeL;
    }

    public void setMængdeL(double mængdeL) {
        this.mængdeL = mængdeL;
    }

    @Override
    public void setFærdigDato(LocalDate færdigDato) {
        if(færdigDato.isBefore(startDato)) {
            throw new IllegalArgumentException("færdig dato er før startdato");
        }
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public String getKornsort() {
        return kornsort;
    }

    public String getRygemateriale() {
        return rygemateriale;
    }

    public void setStartDato(LocalDate startDato) {
        this.startDato = startDato;
    }

    public void setKornsort(String kornsort) {
        this.kornsort = kornsort;
    }

    public void setRygemateriale(String rygemateriale) {
        this.rygemateriale = rygemateriale;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBunddestillat";
    }
}
