/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import common.Validate;
import controller.ChangeNumber;
/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = ChangeNumber.menu();
            switch (choice) {
                case 1:
                    String binary = Validate.checkInputBinary();
                    ChangeNumber.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = Validate.checkInputDecimal();
                    ChangeNumber.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = Validate.checkInputHexaDecimal();
                    ChangeNumber.convertFromHexa(hexa);
                    break;
                case 4:
                    return;
            }
        }
    }
}
