package prj5;

import CS2114.Button;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros

/**
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 * @version 2019.12.3
 */
public interface ButtonInterface {
    /**
     * The process the happens when the button is clicked on
     * 
     * @param b
     *            button
     */
    public void onClicked(Button b);
}
