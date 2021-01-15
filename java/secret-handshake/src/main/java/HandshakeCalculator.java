import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String num = Integer.toBinaryString(number);
        List<Signal> answer = new ArrayList<>();
        int score = 1;

        for(int i = num.length() - 1; i >= 0; i--) {
           int subNum = Character.getNumericValue(num.charAt(i));
           if(subNum  == 1) {
               switch (score) {
                   case 1:
                       answer.add(Signal.WINK);
                       break;
                   case 10:
                       answer.add(Signal.DOUBLE_BLINK);
                       break;
                   case 100:
                       answer.add(Signal.CLOSE_YOUR_EYES);
                       break;
                   case 1000:
                       answer.add(Signal.JUMP);
                       break;
                   case 10000:
                       Collections.reverse(answer);
               }
           }
           score *= 10;
        }
        return answer;
    }

}
