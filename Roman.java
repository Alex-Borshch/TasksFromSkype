public class Roman {

    private String[] i = {"I", "X", "C", "M"};
    private String[] v = {"V", "L", "D"};
    private String[] x = {"X", "C", "M"};
    private String regex = "^(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$";

    StringBuilder rez = new StringBuilder();

    public String toRoman(int number) {
        if (number < 0 || number >= 4000) {
            throw new NumberFormatException("Enter a correct number");
        }
        StringBuilder rez = new StringBuilder();
        int countDigit = 0;
        while (number > 0) {
            rez.append(toRomanHelper(number % 10, countDigit++));
            number /= 10;
        }
        return rez.reverse().toString();
    }

    private String toRomanHelper(int number, int digit) {

        rez.delete(0, rez.length());
        if (number >= 0 && number <= 3) {
            for (int j = 0; j < number; j++) {
                rez.append(i[digit]);
            }
        } else if (number == 4) {
            if (digit == 3) {
                for (int j = 0; j < 3; j++) {
                    rez.append(i[digit]);
                }
            }
            rez.append(i[digit]).append(v[digit]);
        } else if (number >= 5 && number <= 8) {
            rez.append(v[digit]);
            for (int j = 0; j < (number - 5); j++) {
                rez.append(i[digit]);
            }
        } else if (number == 9) {
            rez.append(i[digit]).append(x[digit]);
        }
        return rez.reverse().toString();
    }



    public static void main(String[] args) {
        Roman roman = new Roman();
        System.out.println(roman.toRoman(3982));
    }

}
