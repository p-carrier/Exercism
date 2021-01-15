public class RomanNumeral {

    private final int num;

    RomanNumeral(int num) {
        this.num = num;
    }

    public String getRomanNumeral() {
        String answer = "";
        for(int i = 0; i < num; i++) {
            answer += "I";
            if(i == 3) {
                return "IV";
            }
        }
        return answer;
    }
}
