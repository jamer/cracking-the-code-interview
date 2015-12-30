boolean escape(String s) {
	short[] cs = new char[65536];
	for (char c : s)
		if (!Character.isWhitespace(c))
			cs[c]++;
	int odds = 0;
	for (short s : cs)
		if (s % 2 == 1)
			odds++;
	return odds < 2;
}
