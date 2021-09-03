package calculator;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	// Вся логика калькулятора
	// Если вводят арабские цифры (1 2 3 ...), то мы делаем с ними операции
	// Если вводят римские цифры, то мы их сначала переводим в арабские
	// С помощью метода convertToArabic()
	// И делаем с ними операции
	// Получаем ответ в арабских числах
	// И этот ответ переводим в римские цифры с помощью метода ConvertToArabic()
	// Где используем HashMap, через которые находим key, который ровняется ответу в арабских числах
	// И уже на основании этого через key переводим в римские цифры
	// И выводим в консоль

	public static void main(String[] args) {
		
		HashMap<Integer, String> numbers = new HashMap<Integer, String>();
		
		numbers.put(1, "I");
		numbers.put(2, "II");
		numbers.put(3, "III");
		numbers.put(4, "IV");
		numbers.put(5, "V");
		numbers.put(6, "VI");
		numbers.put(7, "VII");
		numbers.put(8, "VIII");
		numbers.put(9, "IX");
		numbers.put(10, "X");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		String[] arrayInput = input.split(" ");
		
		if (arrayInput.length > 3) {
			System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
			System.exit(0);
		}
		
		int local = 0;
		int local2 = 0;
		int result2 = 0;
		String result3 = "";
		
		for (int i = 0; i < numbers.size() + 1; i++) {
			if (arrayInput[0].equals(numbers.get(i))) {
				for(int j = 0; j < numbers.size() + 1; j++) {
					if(arrayInput[2].equals(numbers.get(j))) {
						if(numbers.get(i) == "I") {
							local = 1;
						}
						if(numbers.get(i) == "II") {
							local = 2;
						}
						if(numbers.get(i) == "III") {
							local = 3;
						}
						if(numbers.get(i) == "IV") {
							local = 4;
						}
						if(numbers.get(i) == "V") {
							local = 5;
						}
						if(numbers.get(i) == "VI") {
							local = 6;
						}
						if(numbers.get(i) == "VII") {
							local = 7;
						}
						if(numbers.get(i) == "VIII") {
							local = 8;
						}
						if(numbers.get(i) == "IX") {
							local = 9;
						}
						if(numbers.get(i) == "X") {
							local = 10;
						}
						
						//вторая число
						if(numbers.get(j) == "I") {
							local2 = 1;
						}
						if(numbers.get(j) == "II") {
							local2 = 2;
						}
						if(numbers.get(j) == "III") {
							local2 = 3;
						}
						if(numbers.get(j) == "IV") {
							local2 = 4;
						}
						if(numbers.get(j) == "V") {
							local2 = 5;
						}
						if(numbers.get(j) == "VI") {
							local2 = 6;
						}
						if(numbers.get(j) == "VII") {
							local2 = 7;
						}
						if(numbers.get(j) == "VIII") {
							local2 = 8;
						}
						if(numbers.get(j) == "IX") {
							local2 = 9;
						}
						if(numbers.get(j) == "X") {
							local2 = 10;
						}
						
						if (arrayInput[1].equals("+")) {
							result2 = local + local2;
						}
						if (arrayInput[1].equals("-")) {
							result2 = local - local2;
						}
						if (arrayInput[1].equals("*")) {
							result2 = local * local2;
						}
						if (arrayInput[1].equals("/")) {
							result2 = local / local2;
						}
						
						
						
						if (result2 < 0) {
							System.out.println("В римской системе нет отрицательных чисел");
						}
						
						if (result2 == 1) {
							result3 = "I";
						}
						if (result2 == 2) {
							result3 = "II";
						}
						if (result2 == 3) {
							result3 = "III";
						}
						if (result2 == 4) {
							result3 = "IV";
						}
						if (result2 == 5) {
							result3 = "V";
						}
						if (result2 == 6) {
							result3 = "VI";
						}
						if (result2 == 7) {
							result3 = "VII";
						}
						if (result2 == 8) {
							result3 = "VIII";
						}
						if (result2 == 9) {
							result3 = "IX";
						}
						if (result2 == 10) {
							result3 = "X";
						}
						if (result2 == 11) {
							result3 = "XI";
						}
						if (result2 == 12) {
							result3 = "XII";
						}
						if (result2 == 13) {
							result3 = "XIII";
						}
						if (result2 == 14) {
							result3 = "XIV";
						}
						if (result2 == 15) {
							result3 = "XV";
						}
						if (result2 == 16) {
							result3 = "XVI";
						}
						if (result2 == 17) {
							result3 = "XVII";
						}
						if (result2 == 18) {
							result3 = "XVIII";
						}
						if (result2 == 19) {
							result3 = "XIX";
						}
						if (result2 == 20) {
							result3 = "XX";
						}
						if (result2 == 21) {
							result3 = "XXI";
						}
						if (result2 == 22) {
							result3 = "XXII";
						}
						if (result2 == 23) {
							result3 = "XXIII";
						}
						if (result2 == 24) {
							result3 = "XXIV";
						}
						if (result2 == 25) {
							result3 = "XXV";
						}
						if (result2 == 26) {
							result3 = "XXVI";
						}
						if (result2 == 27) {
							result3 = "XXVII";
						}
						if (result2 == 28) {
							result3 = "XXVIII";
						}
						if (result2 == 29) {
							result3 = "XXIX";
						}
						if (result2 == 30) {
							result3 = "XXX";
						}
						if (result2 == 31) {
							result3 = "XXXI";
						}
						if (result2 == 32) {
							result3 = "XXXII";
						}
						if (result2 == 33) {
							result3 = "XXXIII";
						}
						if (result2 == 34) {
							result3 = "XXXIV";
						}
						if (result2 == 35) {
							result3 = "XXXV";
						}
						if (result2 == 36) {
							result3 = "XXXVI";
						}
						if (result2 == 37) {
							result3 = "XXXVII";
						}
						if (result2 == 38) {
							result3 = "XXXVIII";
						}
						if (result2 == 39) {
							result3 = "XXXIX";
						}
						if (result2 == 40) {
							result3 = "XL";
						}
						if (result2 == 41) {
							result3 = "XLI";
						}
						if (result2 == 42) {
							result3 = "XLII";
						}
						if (result2 == 43) {
							result3 = "XLIII";
						}
						if (result2 == 44) {
							result3 = "XLIV";
						}
						if (result2 == 45) {
							result3 = "XLV";
						}
						if (result2 == 46) {
							result3 = "XLVI";
						}
						if (result2 == 47) {
							result3 = "XLVII";
						}
						if (result2 == 48) {
							result3 = "XLVIII";
						}
						if (result2 == 49) {
							result3 = "XLIX";
						}
						if (result2 == 50) {
							result3 = "L";
						}
						if (result2 == 51) {
							result3 = "LI";
						}
						if (result2 == 52) {
							result3 = "LII";
						}
						if (result2 == 53) {
							result3 = "LIII";
						}
						if (result2 == 54) {
							result3 = "LIV";
						}
						if (result2 == 55) {
							result3 = "LV";
						}
						if (result2 == 56) {
							result3 = "LVI";
						}
						if (result2 == 57) {
							result3 = "LVII";
						}
						if (result2 == 58) {
							result3 = "LVIII";
						}
						if (result2 == 59) {
							result3 = "LIX";
						}
						if (result2 == 60) {
							result3 = "LX";
						}
						if (result2 == 61) {
							result3 = "LXI";
						}
						if (result2 == 62) {
							result3 = "LXII";
						}
						if (result2 == 63) {
							result3 = "LXIII";
						}
						if (result2 == 64) {
							result3 = "LXIV";
						}
						if (result2 == 65) {
							result3 = "LXV";
						}
						if (result2 == 66) {
							result3 = "LXVI";
						}
						if (result2 == 67) {
							result3 = "LXVII";
						}
						if (result2 == 68) {
							result3 = "LXVIII";
						}
						if (result2 == 69) {
							result3 = "LXIX";
						}
						if (result2 == 70) {
							result3 = "LXX";
						}
						if (result2 == 71) {
							result3 = "LXXI";
						}
						if (result2 == 72) {
							result3 = "LXXII";
						}
						if (result2 == 73) {
							result3 = "LXXIII";
						}
						if (result2 == 74) {
							result3 = "LXXIV";
						}
						if (result2 == 75) {
							result3 = "LXXV";
						}
						if (result2 == 76) {
							result3 = "LXXVI";
						}
						if (result2 == 77) {
							result3 = "LXXVII";
						}
						if (result2 == 78) {
							result3 = "LXXVIII";
						}
						if (result2 == 79) {
							result3 = "LXXIX";
						}
						if (result2 == 80) {
							result3 = "LXXX";
						}
						if (result2 == 81) {
							result3 = "LXXXI";
						}
						if (result2 == 82) {
							result3 = "LXXXII";
						}
						if (result2 == 83) {
							result3 = "LXXXIII";
						}
						if (result2 == 84) {
							result3 = "LXXXIV";
						}
						if (result2 == 85) {
							result3 = "LXXXV";
						}
						if (result2 == 86) {
							result3 = "LXXXVI";
						}
						if (result2 == 87) {
							result3 = "LXXXVII";
						}
						if (result2 == 88) {
							result3 = "LXXXVIII";
						}
						if (result2 == 89) {
							result3 = "LXXXIX";
						}
						if (result2 == 90) {
							result3 = "XC";
						}
						if (result2 == 91) {
							result3 = "XCI";
						}
						if (result2 == 92) {
							result3 = "XCII";
						}
						if (result2 == 93) {
							result3 = "XCIII";
						}
						if (result2 == 94) {
							result3 = "XCIV";
						}
						if (result2 == 95) {
							result3 = "XCV";
						}
						if (result2 == 96) {
							result3 = "XCVI";
						}
						if (result2 == 97) {
							result3 = "XCVII";
						}
						if (result2 == 98) {
							result3 = "XCVIII";
						}
						if (result2 == 99) {
							result3 = "XCIX";
						}
						if (result2 == 100) {
							result3 = "C";
						}
						if (result2 == 101) {
							result3 = "CI";
						}
						
						System.out.println(result3);
					}
				}
			}
		}
		
		
		Calculate.calculate(arrayInput[0], arrayInput[1], arrayInput[2]);
		
	}
	
	
	
	

}
