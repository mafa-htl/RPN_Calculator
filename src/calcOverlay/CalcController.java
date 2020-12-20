/**class CalcController
 * @author Matteo Falkenberg
 * @version 1.10, 20.12.2020
 */

package calcOverlay;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import rpn.RPN;

public class CalcController {

    private RPN rpn = new RPN();

    @FXML private TextField inputField;
    @FXML private TextArea displayArea;
    @FXML private Label errorLabel;

    @FXML
    private void enter(){
        String text = inputField.getText();

        try {
            if (text.isEmpty() == false) {
                double formattedNum = Double.parseDouble(text);
                rpn.pushToStack(formattedNum);
                displayArea.setText(rpn.getStackList());
                inputField.setText("");
                errorLabel.setText("");
            }
            else {
                errorLabel.setText("text field is empty");
            }
        }
        catch (Exception ex){
            this.errorLabel.setText("input is invalid");
        }
    }

    @FXML
    private void clearInput(){
        inputField.setText("");
        errorLabel.setText("");
    }

    @FXML
    private void clearAll(){
        rpn.clearStack();
        inputField.setText("");
        displayArea.setText("");
        errorLabel.setText("");
    }

    @FXML
    private void add(){
        enter();
        if(rpn.addLastTwo() == true) {
            displayArea.setText(rpn.getStackList());
            errorLabel.setText("");
        }
        else errorLabel.setText("not enough elements");
    }

    @FXML
    private void subtract(){
        enter();
        if(rpn.subtractLastTwo() == true) {
            displayArea.setText(rpn.getStackList());
            errorLabel.setText("");
        }
        else errorLabel.setText("not enough elements");
    }

    @FXML
    private void multiply(){
        enter();
        if(rpn.multiplyLastTwo() == true) {
            displayArea.setText(rpn.getStackList());
            errorLabel.setText("");
        }
        else errorLabel.setText("not enough elements");
    }

    @FXML
    private void divide(){
        enter();
        if(rpn.divideLastTwo() == true) {
            displayArea.setText(rpn.getStackList());
            errorLabel.setText("");
        }
        else errorLabel.setText("not enough elements");
    }

    @FXML
    private void reverse(){
        enter();
        if(rpn.reverseLast() == true) {
            displayArea.setText(rpn.getStackList());
            errorLabel.setText("");
        }
        else errorLabel.setText("not element entered");
    }

    @FXML
    private void switchPos(){
        enter();
        if(rpn.switchLastTwo() == true) {
            displayArea.setText(rpn.getStackList());
            errorLabel.setText("");
        }
        else errorLabel.setText("not enough elements");
    }

    @FXML
    private void addZero(){
        inputField.setText(inputField.getText() + "0");
    }

    @FXML
    private void addOne(){
        inputField.setText(inputField.getText() + "1");
    }

    @FXML
    private void addTwo(){
        inputField.setText(inputField.getText() + "2");
    }

    @FXML
    private void addThree(){
        inputField.setText(inputField.getText() + "3");
    }

    @FXML
    private void addFour(){
        inputField.setText(inputField.getText() + "4");
    }

    @FXML
    private void addFive(){
        inputField.setText(inputField.getText() + "5");
    }

    @FXML
    private void addSix(){
        inputField.setText(inputField.getText() + "6");
    }

    @FXML
    private void addSeven(){
        inputField.setText(inputField.getText() + "7");
    }

    @FXML
    private void addEight(){
        inputField.setText(inputField.getText() + "8");
    }

    @FXML
    private void addNine(){
        inputField.setText(inputField.getText() + "9");
    }

    @FXML
    private void addDot(){
        inputField.setText(inputField.getText() + ".");
    }

    @FXML
    private void addMinus(){
        inputField.setText(inputField.getText() + "-");
    }

}