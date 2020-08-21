//package org.pianopractice.solfège;

package TCG;


import java.util.Random;

public class NoteHarmonique {

	//SH: Z3 support in JR is not supporting MOD operation. I can try it out later, when I use Z3BitVector.
	public static void main(String[] args) {
		NoteHarmonique.createFrom(1);
	}
	public static Object createFrom(int key) {
		int octave = key / 12;

		int q = key / 12;	//finding quotient (integer part only)
		int p = q * 12;	//finding product
		int m = key - p;	//finding modulus


		int semiton = m; //key % 12;
		if (semiton == 1 || semiton == 3 || semiton == 6 || semiton == 8
				|| semiton == 10) {
			semiton--;
		} else {
		}
		// note value (0 to 6)
		if (semiton == 2 || semiton == 4) {
			semiton /= 2;
		} else if (semiton == 5 || semiton == 7 || semiton == 9 || semiton == 11) {
			semiton = (semiton + 1) / 2;
		}
		return new Object();
	}

}