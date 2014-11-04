package com.example.android.softkeyboard;

import java.util.ArrayList;


public class Proc4 extends CombinationState {

	public Proc4() {
		repeat = true;
	}

	@Override
	public int[] combine(ArrayList<Integer> phoArr, KoreanAutomata ka) {
		combPhon = new int[1];

		combPhon[0] = calcPhoneme(phoArr.get(0), phoArr.get(1), phoArr.get(2));

		Buffer tmpBuffer = ka.getBuffer();

		tmpBuffer.appendLetter(combPhon);
		tmpBuffer.commitTyped();

		tmpBuffer.handingPhoArrAt(3);

		ka.setKoreanAutomataState(KoreanAutomata.ST_FIRST_VOWEL,KoreanAutomata.ST_FIRST);
		ka.setEnter(false);

		return null;
	}

}