package main.core;

/**
 * Representa los posibles estados de una casilla en el tablero.
 */
public enum EstadoCasillaEnum {
    // Estado          Símbolo Emoji   Símbolo ASCII
    AGUA("🔵", "~"),           
    AGUA_DISPARADA("⚪", "o"), 
    BARCO("🚢", "B"),          
    TOCADO("💥", "X"),         
    HUNDIDO("💀", "#");        

    private final String emoji;
    private final String ascii;

    EstadoCasillaEnum(String emoji, String ascii) {
        this.emoji = emoji;
        this.ascii = ascii;
    }

    /**
     * Devuelve el símbolo visual de la casilla.
     * @param usarEmojis true para ver emojis, false para caracteres clásicos.
     */
    public String getSimbolo(boolean usarEmojis) {
        return usarEmojis ? emoji : ascii;
    }
}
