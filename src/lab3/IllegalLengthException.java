/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author knyghtspup
 */
public class IllegalLengthException extends IllegalArgumentException {

    private static final String MSG = "Illegal Name: Please enter your full name";

    public IllegalLengthException() {
        super(MSG);
    }

    public IllegalLengthException(String s) {
        super(MSG);
    }

    public IllegalLengthException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public IllegalLengthException(Throwable cause) {
        super(cause);
    }
    
}
