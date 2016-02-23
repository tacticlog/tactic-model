package com.tacticlogistics.crm.model.util;

public class Util {

    public static String leftPad(String originalString, int length, char padCharacter) {
        String paddedString = originalString;
        while (paddedString.length() < length) {
            paddedString = padCharacter + paddedString;
        }
        return paddedString;
    }

}
