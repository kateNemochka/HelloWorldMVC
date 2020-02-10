public class View {

    protected final String INSTRUCTIONS = "Enter \"Hello\" and \"Java!\" to get the result.";
    protected final String REQUEST1 = "Enter the first value: ";
    protected final String REQUEST2 = "Enter the second value: ";
    protected final String ERROR_MESSAGE = "Error! Wrong value!";


    public void printMessage(String message) {System.out.println(message);}

    public void printResult(String firstWord, String secondWord) {
        System.out.println("\n".concat(firstWord)
                .concat(" ")
                .concat(secondWord));
    }



}