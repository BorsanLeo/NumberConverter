////////////////////////////////////////////////////////////////////
// LEONARDO BORSAN 2101098 
// ELIA LEONETTI 2009998
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
    
        // Definisci la rappresentazione ASCII art orizzontale per ogni lettera romana
        String[][] asciiLetters = {
            {//Riga1
                " __   __",  // X
                " __      __",  // V
                "  _____ " // I
            },

            {//Riga2
                " \\ \\ / /",  // X
                " \\ \\    / /",  // V
                " |_   _|" // I
            },

            {//Riga3
                "  \\ V / ",  // X
                "  \\ \\  / / ",  // V
                "   | |  " // I
            },

            {//Riga4
                "   > <  ", // X
                "   \\ \\/ /  ", // V
                "   | |  " // I
            },
                
            {//Riga5
                "  / . \\ ", // X
                "    \\  /   ", // V
                "  _| |_ " // I
            },
                
            {//Riga6
                " /_/ \\_\\", // X
                "     \\/    ", // V
                " |_____|" // I
            },
        };
        
        for( int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                // Aggiungi la rappresentazione ASCII art orizzontale della lettera corrente
                asciiArt.append(asciiLetters[z]["XVI".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}