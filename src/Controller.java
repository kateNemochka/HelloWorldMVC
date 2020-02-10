import java.util.Scanner;


public class Controller {

    private View view;
    private Model model;


    public Controller(View cView, Model cModel) {
        view = cView;
        model = cModel;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(view.INSTRUCTIONS);

        model.setFirstWord(inputWord(sc, view.REQUEST1, "Hello"));
        model.setSecondWord(inputWord(sc, view.REQUEST2, "Java!"));

        view.printResult(model.getFirstWord(), model.getSecondWord());

    }

    public String inputWord(Scanner sc, String request, String pattern) {
        view.printMessage("\n".concat(request));
        while (!sc.hasNext(pattern)) {
            view.printMessage(view.ERROR_MESSAGE);
            sc.next();
        }
        return sc.next();
    }

}
