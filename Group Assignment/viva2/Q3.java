
import java.util.Scanner;

public class Q3 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameString = sc.nextLine();
        String[] nameArray = nameString.split(" , ");
        
        int n;
        while(true){
            if(sc.hasNextInt()){
                n = sc.nextInt();
                break;
            }else {
                System.out.println("Please enter integer number only!");
                sc.nextLine(); //this is to consume the invalid input
            }
        }
        sc.nextLine();//clear the input
        
        //Roman Numeral Part
        String roman_numeral_1 = ""; 
        String arithmetic_operand = "";
        String roman_numeral_2 = ""; 
        String equality_sign = "";
        String roman_numeral_3 = "";
        
        int arabic_numeral_1 = -1;
        int arabic_numeral_2 = -1;
        int arabic_numeral_3 = -1;
        
        int numberOfCorrectStatement = 0;
        
        String answerRoman;
        
        String[] romanInput = new String[n];
        String[] arabicOutput = new String[n];
        boolean isInvalid = false;
        
        for(int i = 0; i < romanInput.length; i++) {
            romanInput[i] = sc.nextLine();
        }
        
        System.out.print("Statements for the Roman numeral test are sent in by ");
        String[] initials = generateInitials(nameArray);
        for(int i = 0; i < initials.length; i++) {
            if(i == initials.length - 1)
                System.out.print(initials[i] + " ");
            else
                System.out.print(initials[i] + ", ");
        }
        System.out.print("(");
        for(int i = 0; i < nameArray.length; i++) {
            if(i == initials.length - 1)
                System.out.print(nameArray[i] + ").\n");
            else
                System.out.print(nameArray[i] + " , ");
        }
        System.out.println();
        for(int i = 0; i < romanInput.length; i ++) {
            isInvalid = false;
            String[] romanArray = romanInput[i].split(" ");
            
            if(romanArray.length != 5) {
                arabicOutput[i] = "Invalid statement.";
                continue; //invalid
            }
            
            for(int k = 0; k < 5; k++) {
                switch(k) {
                    case 0:
                        roman_numeral_1 = romanArray[k];
                        arabic_numeral_1 = convertArabics(roman_numeral_1);
                        if(arabic_numeral_1 == 0) {
                            isInvalid = true;
                        }
                        break;
                    case 1:
                        arithmetic_operand = romanArray[k];
                        break;
                    case 2:
                        roman_numeral_2 = romanArray[k];
                        arabic_numeral_2 = convertArabics(roman_numeral_2);
                        if(arabic_numeral_2 == 0) {
                            isInvalid = true;
                        }
                        break;
                    case 3:
                        equality_sign = romanArray[k];
                        if(!equality_sign.equals("=")){
                            isInvalid = true;
                        }
                        break;
                    case 4:
                        roman_numeral_3 = romanArray[k];
                        arabic_numeral_3 = convertArabics(roman_numeral_3);
                        if(arabic_numeral_3 == 0) {
                            isInvalid = true;
                        }
                        break;
                }
            }
            
            if(isInvalid) {
                arabicOutput[i] = "Invalid Statement.";
                continue;
            }
            int answerArabic;
            
            switch(arithmetic_operand) {
                case "+":
                    answerArabic = arabic_numeral_1 + arabic_numeral_2;
                    break;
                case "-":
                    answerArabic = arabic_numeral_1 - arabic_numeral_2;
                    break;
                case "*":
                    answerArabic = arabic_numeral_1 * arabic_numeral_2;
                    break;
                case "/":
                    answerArabic = arabic_numeral_1 / arabic_numeral_2;
                    break;
                case "%":
                    answerArabic = arabic_numeral_1 % arabic_numeral_2;
                    break;
                case "^":
                    answerArabic = (int)Math.pow(arabic_numeral_1, arabic_numeral_2);
                    break;
                default:
                    arabicOutput[i] = "Invalid Statement.";
                    continue;
            }
            
            arabicOutput[i] = (arabic_numeral_1 + " " + arithmetic_operand + " " + arabic_numeral_2 + " " + equality_sign + " " + arabic_numeral_3);   
            
            answerRoman = convertRomans(answerArabic);
            if(answerRoman.equals("O")) {
                arabicOutput[i] = "Invalid Statement.";
                continue;
            }
            
            if(arabic_numeral_3 == answerArabic) {
                arabicOutput[i] += " is correct.";
                numberOfCorrectStatement++;
            } else {
                arabicOutput[i] += " is wrong, as the answer should be " + answerRoman + " , which is " + answerArabic + " in Arabic numeral form.";
            }
        }
        
        for(String statement : arabicOutput) {
            System.out.println(statement);
        }
        
        System.out.println("\nNumber of Correct Statements = " + numberOfCorrectStatement);
        
        if(n == 0) n = 1;//to prevent divide by zero error
        
        System.out.printf("Percentage of Correct Statements = %2.2f%%", ((double)numberOfCorrectStatement / n) * 100);
        
    }
    
    public static String[] generateInitials(String[] nameArray) {
        String[] initials = new String[nameArray.length];
        for(int i = 0; i < initials.length; i++) {
            nameArray[i] = nameArray[i].trim(); //remove space from the name
            
            String regex = "[\\s-'_.,]+"; //look for "\s" which means space, - ' _ . , the + sign on the back is used to treat consecutive delimiters as a single delimiter  

            String[] nameWords = nameArray[i].split(regex);
            
            for(String nameWord : nameWords) {
                if(nameWord.trim().isEmpty()) {
                    continue;//To prevent empty space
                }
                if(nameWord.equalsIgnoreCase("bin") || nameWord.equalsIgnoreCase("binti") || nameWord.equalsIgnoreCase("a/l") || nameWord.equalsIgnoreCase("a/p") || nameWord.equalsIgnoreCase("al") || nameWord.equalsIgnoreCase("ap") || nameWord.equals("@")) {
                    continue;
                }
                if(initials[i] != null) {
                    initials[i] = "" + initials[i] + nameWord.charAt(0);
                }
                else {
                    initials[i] = "" + nameWord.charAt(0);
                }
                initials[i] = initials[i].toUpperCase();
            }
        }
        return initials;
    }
     
    
    public static int convertArabics(String roman) {
        int consecutiveLetter = 1;
        char lastRomanLiteral, currentRomanLiteral, nextRomanLiteral;
        int lastArabicLiteral, currentArabicLiteral, nextArabicLiteral;
        int arabicNumber = 0;
        
        lastRomanLiteral = ' ';
        lastArabicLiteral = 0;   
        
        int highestArabicLiteral = 0;
        int highestArabicIndex = 0;
        int index = 0;
        
        boolean readFromBehind = false;
        
        roman = roman.toUpperCase();
        
        for(int i = 0; i < roman.length(); i++) {
            currentRomanLiteral = roman.charAt(i);
            switch(currentRomanLiteral) {
                case 'I':
                    currentArabicLiteral = 1;
                    break;
                case 'V':
                    currentArabicLiteral = 5;
                    break;
                case 'X':
                    currentArabicLiteral = 10;
                    break;
                case 'L':
                    currentArabicLiteral = 50;
                    break;
                case 'C':
                    currentArabicLiteral = 100;
                    break;
                case 'D':
                    currentArabicLiteral = 500;
                    break;
                case 'M':
                    currentArabicLiteral = 1000;
                    break;
                default:
                    return 0;
            } 
            if(currentArabicLiteral > highestArabicLiteral) {
                highestArabicIndex = i;
                highestArabicLiteral = currentArabicLiteral;
            }else if(currentArabicLiteral == highestArabicLiteral){
                /*
                if(i - highestArabicIndex != 1) {//check if consecutive
                    return 0;//if there exist several large number that are not consecutive exp: CIIC invalid!
                }
                */
            }
        }
        
        if(highestArabicIndex == 0) {
            index = 0;
            readFromBehind = false;
        }else if(highestArabicIndex == (roman.length() - 1)) {
            index = (roman.length() - 1);
            readFromBehind = true;
        }else{
            return 0;//if the largest literal is in the midlle of the group
        }
        
        
        //Loop through every literals
        for(int i = 0; i < roman.length(); i++) {        
            currentRomanLiteral = roman.charAt(index);
            
            if(currentRomanLiteral == lastRomanLiteral) {
                consecutiveLetter++;
                if(currentRomanLiteral == 'V' || currentRomanLiteral == 'L' || currentRomanLiteral == 'D') {
                    return 0; //VLD cannot repeated
                }
            }else {
                consecutiveLetter = 1;//reset consecutive letter
            }                       
            
            //Determine whether there is nextRomanLiteral anymore
            if((i + 1) != roman.length()) {
                if(readFromBehind) {
                    nextRomanLiteral = roman.charAt(index - 1);   
                } else {
                    nextRomanLiteral = roman.charAt(index + 1);
                }
      
            }else {
                nextRomanLiteral = ' ';
            }
           
            switch(currentRomanLiteral) {
                case 'I':
                    currentArabicLiteral = 1;
                    break;
                case 'V':
                    currentArabicLiteral = 5;
                    break;
                case 'X':
                    currentArabicLiteral = 10;
                    break;
                case 'L':
                    currentArabicLiteral = 50;
                    break;
                case 'C':
                    currentArabicLiteral = 100;
                    break;
                case 'D':
                    currentArabicLiteral = 500;
                    break;
                case 'M':
                    currentArabicLiteral = 1000;
                    break;
                default:
                    return 0;
            } 
            
            switch(nextRomanLiteral) {
                case 'I':
                    nextArabicLiteral = 1;
                    break;
                case 'V':
                    nextArabicLiteral = 5;
                    break;
                case 'X':
                    nextArabicLiteral = 10;
                    break;
                case 'L':
                    nextArabicLiteral = 50;
                    break;
                case 'C':
                    nextArabicLiteral = 100;
                    break;
                case 'D':
                    nextArabicLiteral = 500;
                    break;
                case 'M':
                    nextArabicLiteral = 1000;
                    break;
                default:
                    nextArabicLiteral = 0;
            }
            
            //If the literal infront is smaller than after 
            if(lastArabicLiteral < nextArabicLiteral && i != 0) {
                return 0;
            }
            
            if(!readFromBehind){
                if(nextArabicLiteral > currentArabicLiteral) {
                    //only IXC can be subtract
                    switch (currentRomanLiteral) {
                        case 'I':
                            if(nextRomanLiteral != 'V' && nextRomanLiteral != 'X') {
                                return 0;
                            }   break;
                        case 'X':
                            if(nextRomanLiteral != 'L' && nextRomanLiteral != 'C') {
                                return 0;
                            }   break;
                        case 'C':
                            if(nextRomanLiteral != 'D' && nextRomanLiteral != 'M') {
                                return 0;
                            }   break;
                        default:
                            return 0;//"0" considered invalid
                    }

                    arabicNumber = arabicNumber + (nextArabicLiteral - currentArabicLiteral);
                    index++;
                    i++;

                } else {
                    //
                    if(lastArabicLiteral < currentArabicLiteral && i != 0) {
                        return 0;
                    }

                    arabicNumber += currentArabicLiteral;
                }
            }else{
                if (nextArabicLiteral > currentArabicLiteral) {
                    return 0;                    
                } else {
                    if (lastArabicLiteral < currentArabicLiteral && i != 0) {
                        return 0;
                    }
                    if(i == 0) {
                        arabicNumber = currentArabicLiteral;
                    }else{
                        arabicNumber -= currentArabicLiteral;
                    }
                }
            }
            
            lastRomanLiteral = currentRomanLiteral;
            lastArabicLiteral = currentArabicLiteral;
            
            if(readFromBehind) { index--; }
            else { index++; }

        }    
        
        if(arabicNumber >= 1 && arabicNumber <= 3999){
            return arabicNumber;
        }else {
            return 0;
        }
    }
    
    public static String convertRomans(int arabic) {
        if(arabic < 1 && arabic > 3999) {
            return "O";
        }
        String roman = "";
        int digits = 1;
        int arabicLiteral;
        
        while(arabic != 0) {
            arabicLiteral = arabic % 10;
                   
            String roman_1 = "IIIIVIIIIX";
            String roman_2 = "XXXXLXXXXC";
            String roman_3 = "CCCCDCCCCM";
            String roman_4 = "MMM";
            
            switch(digits) {
                case 1:
                    if(arabicLiteral < 4 ) {
                        roman += roman_1.substring(0, (arabicLiteral));
                    }else if(arabicLiteral == 4 || arabicLiteral == 9) {
                        roman += roman_1.substring((arabicLiteral - 1), (arabicLiteral + 1));
                    }else {
                        roman += roman_1.substring(4, (arabicLiteral));
                    }
                    break;
                case 10:
                    if(arabicLiteral < 4 ) {
                        roman += roman_2.substring(0, (arabicLiteral));
                    }else if(arabicLiteral == 4 || arabicLiteral == 9) {
                        roman += roman_2.substring((arabicLiteral - 1), (arabicLiteral + 1));
                    }else {
                        roman += roman_2.substring(4, (arabicLiteral));
                    }
                    break;
                case 100:
                    if(arabicLiteral < 4 ) {
                        roman += roman_3.substring(0, (arabicLiteral));
                    }else if(arabicLiteral == 4 || arabicLiteral == 9) {
                        roman += roman_3.substring((arabicLiteral - 1), (arabicLiteral + 1));
                    }else {
                        roman += roman_3.substring(4, (arabicLiteral));
                    }
                    break;
                case 1000:
                    roman += roman_4.substring(0, (arabicLiteral));
                    break;
                default:
                    roman = "O";
            }
            roman += " ";
            
            digits *= 10;
            arabic /= 10;
        }
        
        //Reverse the roman number
        String[] romanArray = roman.split(" ");
        for(int i = 0; i < romanArray.length / 2; i++) {
            String temp = romanArray[i];
            romanArray[i] = romanArray[romanArray.length - 1 - i];
            romanArray[romanArray.length - 1 - i] = temp;
        }
        roman = "";
        for(String romanLiteral : romanArray) {
            roman += romanLiteral;
        }
        
        return roman;
    }
}
