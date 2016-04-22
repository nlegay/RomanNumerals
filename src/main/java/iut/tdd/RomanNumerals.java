package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int nbre = Integer.parseInt(arabe);
		String r = "";
		if (arabe.length() != 1) {
			int dizaines = nbre / 10;
			if (dizaines == 1) {
				r += "X";
			} else if (dizaines == 2) {
				r += "XX";
			} else if (dizaines == 3) {
				r += "XXX";
			} else if (dizaines == 4) {
				r += "XL";
			} else if (dizaines == 5) {
				r += "L";
			}
		}
		int reste = nbre % 10;
		while (reste != 0) {
			if (reste == 4) {
				r += "IV";
				reste = reste - 4;
			} else if (reste >= 9) {
				r += "IX";
				reste = reste - 9;
			} else if (reste >= 5) {
				r += "V";
				reste = reste - 5;
			} else {
				r += "I";
				reste = reste - 1;
			}
		}

		return r;

	}

	public String convertFromRoman(String roman) {
		return "1";
	}

}
