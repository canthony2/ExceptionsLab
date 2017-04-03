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
public class EmptyNameException extends IllegalArgumentException {

    private static final String MSG = "Input Error: No name found; please enter your full name";

    public EmptyNameException() {
        super(MSG);
    }

    public EmptyNameException(String s) {
        super(MSG);
    }

    public EmptyNameException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public EmptyNameException(Throwable cause) {
        super(cause);
    }
    
}
