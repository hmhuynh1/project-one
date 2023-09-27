package model;

public class StringStatistics {
	private String reversed = "";
	private int whiteSpaces = 0;
	private int vowels = 0;
	private int punctuation = 0;
	
	
	public StringStatistics(String string){
		genStats(string.toLowerCase());	
	}
	
	private void genStats(String string) {
		for(int i = 0; i < string.length(); i++) {
			String analysisChar = string.substring(i, i +1);
			if (analysisChar.contains(" ")) {
				whiteSpaces++;
			} else if (analysisChar.contains("a") || analysisChar.contains("e") || analysisChar.contains("i")
					|| analysisChar.contains("o") || analysisChar.contains("u") || analysisChar.contains("y")) {
				vowels++;
			} else if (analysisChar.contains(".") || analysisChar.contains("'") || analysisChar.contains(",")
					|| analysisChar.contains("?") || analysisChar.contains("!")) {
				punctuation++;
			}
		}
	}
	
	public String getReversed() {
		return reversed;
	}

	public void setReversed(String reversed) {
		this.reversed = reversed;
	}

	public int getWhterSpaces() {
		return whiteSpaces;
	}

	public void setWhterSpaces(int whterSpaces) {
		this.whiteSpaces = whterSpaces;
	}

	public int getVowels() {
		return vowels;
	}

	public void setVowels(int vowels) {
		this.vowels = vowels;
	}

	public int getPunctuation() {
		return punctuation;
	}

	public void setPunctuation(int punctuation) {
		this.punctuation = punctuation;
	}
}
