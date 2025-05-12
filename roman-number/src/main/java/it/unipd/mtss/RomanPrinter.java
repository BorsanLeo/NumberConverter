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
                "  _____ " // I
            },

            {//Riga2
                " |_   _|" // I
            },

            {//Riga3
                "   | |  " // I
            },

            {//Riga4
                "   | |  " // I
            },
                
            {//Riga5
                "  _| |_ " // I
            },
                
            {//Riga6
                " |_____|" // I
            },
        };
        
        for( int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                // Aggiungi la rappresentazione ASCII art orizzontale della lettera corrente
                asciiArt.append(asciiLetters[z]["I".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}