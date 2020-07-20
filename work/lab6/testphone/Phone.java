package testphone;

public class Phone {

    final String[] two = {"a", "b", "c"};
    final String[] three = {"d", "e", "f"};
    final String[] four = {"g", "h", "i"};
    final String[] five = {"j", "k", "l"};
    final String[] six = {"m", "n", "o"};
    final String[] seven = {"p", "q", "r", "s"};
    final String[] eight = {"t", "u", "v"};
    final String[] nine = {"w", "x", "y", "z"};

    public String findAllWords(String phoneNumber) {
        String allWords = "";

        String[][] tempArray = new String[phoneNumber.length()][];

        for (int i = 0; i < phoneNumber.length(); i++) {
            switch (phoneNumber.charAt(i)) {
                case '2':
                    tempArray[i] = two;
                    break;

                case '3':
                    tempArray[i] = three;
                    break;

                case '4':
                    tempArray[i] = four;
                    break;

                case '5':
                    tempArray[i] = five;
                    break;

                case '6':
                    tempArray[i] = six;
                    break;

                case '7':
                    tempArray[i] = seven;
                    break;

                case '8':
                    tempArray[i] = eight;
                    break;

                case '9':
                    tempArray[i] = nine;
                    break;
            }
        }
        int count = 0;
        for (int i1 = 0; i1 < tempArray[0].length; i1++) {
            for (int i2 = 0; i2 < tempArray[1].length; i2++) {
                for (int i3 = 0; i3 < tempArray[2].length; i3++) {
                    for (int i4 = 0; i4 < tempArray[3].length; i4++) {
                        for (int i5 = 0; i5 < tempArray[4].length; i5++) {
                            for (int i6 = 0; i6 < tempArray[5].length; i6++) {
                                for (int i7 = 0; i7 < tempArray[6].length; i7++) {
                                    ++count;
                                    allWords
                                            += count + ")"
                                            + tempArray[0][i1]
                                            + tempArray[1][i2]
                                            + tempArray[2][i3]
                                            + tempArray[3][i4]
                                            + tempArray[4][i5]
                                            + tempArray[5][i6]
                                            + tempArray[6][i7]
                                            + "  ";
                                }
                            }
                        }
                    }
                }
            }
        }

        return allWords;

    }
}
