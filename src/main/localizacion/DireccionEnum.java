package main.localizacion;

/**
 * Representa las 4 direcciones posibles para colocar un barco o moverse.
 */
public enum DireccionEnum {
    NORTE(-1, 0), SUR(1, 0), ESTE(0, 1), OESTE(0, -1);

    private final int df;
    private final int dc;

    DireccionEnum(int df, int dc) {
        this.df = df;
        this.dc = dc;
    }

    public int getDeltaFila() {
        return df;
    }

    public int getDeltaColumna() {
        return dc;
    }
}