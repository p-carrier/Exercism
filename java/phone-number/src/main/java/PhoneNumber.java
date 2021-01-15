public class PhoneNumber {

    private static String phoneNumber;
    private static String wrongLengthExceptionMessage = "Number must be 10 or 11 digits";
    private static String numberIs11DigitsButDoesNotStartWith1ExceptionMessage =
            "Can only have 11 digits if number starts with '1'";
    private static String illegalCharacterExceptionMessage =
            "Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.";
    private static String illegalAreaOrExchangeCodeMessage =
            "Illegal Area Or Exchange Code. Only 2-9 are valid digits";

    PhoneNumber(String phoneNumber)  {
        try {
            String phone = phoneNumber.replaceAll("[().\\-\\s+]", "");
            if(phone.matches(".*[\\D]+.*")) throw new IllegalArgumentException(illegalCharacterExceptionMessage);
            switch (phone.length()) {
                case 10:
                    break;
                case 11:
                    if (Character.getNumericValue(phone.charAt(0)) == 1) {
                        phone = phone.substring(1);
                        break;
                    } else throw new IllegalArgumentException(numberIs11DigitsButDoesNotStartWith1ExceptionMessage);
                default:
                    throw new IllegalArgumentException(wrongLengthExceptionMessage);
            }
            if(Character.getNumericValue(phone.charAt(0)) < 2 || Character.getNumericValue(phone.charAt(3)) < 2 )
                throw new IllegalArgumentException(illegalAreaOrExchangeCodeMessage);
            this.phoneNumber = phone;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public String getNumber() {
        return this.phoneNumber;
    }

}
