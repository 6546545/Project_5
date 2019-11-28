
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros

package prj5;

/**
 * @author Andy Gould, Dwarakh Nayam, and Kevin Kapros
 * @version 2019.12.03
 */
public enum Position {
    /**
     * Button Position Enums
     */

    TOP_LEFT(120, 50),
    MID_LEFT(120, 150),
    BTM_LEFT(120, 250),
    TOP_CNTR(420, 50),
    MID_CNTR(420, 150),
    BTM_CNTR(420, 250),
    TOP_RIGHT(720, 50),
    MID_RIGHT(720, 150),
    BTM_RIGHT(720, 250);
/**
 * The X Position
 */
    private final int posX;
    /**
     * The Y Position
     */
    private final int posY;

/**
 * The Position Constructor
 * @param posX the X Position
 * @param posY the Y Position
 */
    Position(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

/**
 * Gets the X Position
 * @return returns the X Position as an int
 */
    public int getPosX() {
        return posX;
    }

/**
 * Gets the Y Position
 * @return returns the Y Position as an int
 */
    public int getPosY() {
        return posY;
    }

}
