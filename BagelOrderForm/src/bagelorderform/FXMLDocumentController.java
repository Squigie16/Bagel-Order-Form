/*
 * Luigi Agostino
 * Student#: 991451048
 * JAVA
 */
package bagelorderform;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.print.*;
import javax.print.attribute.*;
import java.io.*;

public class FXMLDocumentController {

    private double bagelPrice;
    private double coffeePrice;
    private double toppingPrice;
    private double gTotal;
    private double sTotal;
    private double tax;

    @FXML
    private TextField frenchQty;

    @FXML
    private ToggleGroup BagelGroup;

    @FXML
    private RadioButton frenchRadio;

    @FXML
    private Label taxTotal;

    @FXML
    private ToggleGroup CoffeeGroup;

    @FXML
    private TextField blackQty;

    @FXML
    private Button btnCalculate;

    @FXML
    private MenuItem getReceipt;

    @FXML
    private CheckBox butterCheck;

    @FXML
    private TextField cheddarQty;

    @FXML
    private MenuItem printReceipt;

    @FXML
    private CheckBox strawCheck;

    @FXML
    private TextField wheatQty;

    @FXML
    private TextField cappQty;

    @FXML
    private RadioButton cheddarRadio;

    @FXML
    private MenuItem pricesMenu;

    @FXML
    private Button btnExit;

    @FXML
    private TextField strawQty;

    @FXML
    private TextField raspQty;

    @FXML
    private RadioButton regularRadio;

    @FXML
    private RadioButton blackRadio;

    @FXML
    private Label saleTotal;

    @FXML
    private TextField poppyQty;

    @FXML
    private Label grandTotal;

    @FXML
    private TextField regularQty;

    @FXML
    private TextField creamQty;

    @FXML
    private CheckBox blueCheck;

    @FXML
    private CheckBox raspCheck;

    @FXML
    private RadioButton cappRadio;

    @FXML
    private TextField blueQty;

    @FXML
    private CheckBox creamCheck;

    @FXML
    private RadioButton wheatRadio;

    @FXML
    private TextField butterQty;

    @FXML
    private RadioButton poppyRadio;

    @FXML
    private RadioButton whiteRadio;

    @FXML
    private Button btnReset;

    @FXML
    private TextField whiteQty;

    @FXML
    public void DisplayTextField() {
        if (whiteRadio.isSelected()) {
            whiteQty.setDisable(false);
        } else {
            whiteQty.setDisable(true);
            whiteQty.setText("");
        }

        if (wheatRadio.isSelected()) {
            wheatQty.setDisable(false);
        } else {
            wheatQty.setDisable(true);
            wheatQty.setText("");
        }

        if (cheddarRadio.isSelected()) {
            cheddarQty.setDisable(false);
        } else {
            cheddarQty.setDisable(true);
            cheddarQty.setText("");
        }

        if (poppyRadio.isSelected()) {
            poppyQty.setDisable(false);
        } else {
            poppyQty.setDisable(true);
            poppyQty.setText("");
        }

        if (blackRadio.isSelected()) {
            blackQty.setDisable(false);
        } else {
            blackQty.setDisable(true);
            blackQty.setText("");
        }

        if (regularRadio.isSelected()) {
            regularQty.setDisable(false);
        } else {
            regularQty.setDisable(true);
            regularQty.setText("");
        }

        if (cappRadio.isSelected()) {
            cappQty.setDisable(false);
        } else {
            cappQty.setDisable(true);
            cappQty.setText("");
        }

        if (frenchRadio.isSelected()) {
            frenchQty.setDisable(false);
        } else {
            frenchQty.setDisable(true);
            frenchQty.setText("");
        }

        if (creamCheck.isSelected()) {
            creamQty.setDisable(false);
        } else {
            creamQty.setDisable(true);
            creamQty.setText("");
        }

        if (butterCheck.isSelected()) {
            butterQty.setDisable(false);
        } else {
            butterQty.setDisable(true);
            butterQty.setText("");
        }

        if (strawCheck.isSelected()) {
            strawQty.setDisable(false);
        } else {
            strawQty.setDisable(true);
            strawQty.setText("");
        }

        if (raspCheck.isSelected()) {
            raspQty.setDisable(false);
        } else {
            raspQty.setDisable(true);
            raspQty.setText("");
        }

        if (blueCheck.isSelected()) {
            blueQty.setDisable(false);
        } else {
            blueQty.setDisable(true);
        }
    }

    @FXML
    public void Exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    public void Reset(ActionEvent event) {
        bagelPrice = 0;
        toppingPrice = 0;
        coffeePrice = 0;
        sTotal = 0;
        gTotal = 0;
        tax = 0;

        saleTotal.setText("$" + String.format("%.2f", sTotal));
        taxTotal.setText("$" + String.format("%.2f", tax));
        grandTotal.setText("$" + String.format("%.2f", gTotal));

        whiteRadio.setSelected(false);
        wheatRadio.setSelected(false);
        cheddarRadio.setSelected(false);
        poppyRadio.setSelected(false);

        blackRadio.setSelected(false);
        regularRadio.setSelected(false);
        cappRadio.setSelected(false);
        frenchRadio.setSelected(false);

        creamCheck.setSelected(false);
        butterCheck.setSelected(false);
        raspCheck.setSelected(false);
        strawCheck.setSelected(false);
        blueCheck.setSelected(false);

        whiteQty.setDisable(true);
        wheatQty.setDisable(true);
        cheddarQty.setDisable(true);
        poppyQty.setDisable(true);

        blackQty.setDisable(true);
        regularQty.setDisable(true);
        cappQty.setDisable(true);
        frenchQty.setDisable(true);

        creamQty.setDisable(true);
        butterQty.setDisable(true);
        raspQty.setDisable(true);
        strawQty.setDisable(true);
        blueQty.setDisable(true);

        whiteQty.setText("");
        wheatQty.setText("");
        cheddarQty.setText("");
        poppyQty.setText("");

        blackQty.setText("");
        regularQty.setText("");
        cappQty.setText("");
        frenchQty.setText("");

        creamQty.setText("");
        butterQty.setText("");
        raspQty.setText("");
        strawQty.setText("");
        blueQty.setText("");

    }

    @FXML
    public void Calculate(ActionEvent event) {
        bagelPrice = 0;
        toppingPrice = 0;
        coffeePrice = 0;
        sTotal = 0;
        gTotal = 0;
        tax = 0;

        //Bagel Group
        if (whiteRadio.isSelected()) {
            double whiteQ = (double) Double.parseDouble(whiteQty.getText());
            bagelPrice = 1.25 * whiteQ;
        }
        if (wheatRadio.isSelected()) {
            double wheatQ = (double) Double.parseDouble(wheatQty.getText());
            bagelPrice = 1.50 * wheatQ;
        }
        if (cheddarRadio.isSelected()) {
            double cheddarQ = (double) Double.parseDouble(cheddarQty.getText());
            bagelPrice = 2.00 * cheddarQ;
        }
        if (poppyRadio.isSelected()) {
            double poppyQ = (double) Double.parseDouble(poppyQty.getText());
            bagelPrice = 2.50 * poppyQ;
        }

        //CoffeePrice
        if (blackRadio.isSelected()) {
            double blackQ = (double) Double.parseDouble(blackQty.getText());
            coffeePrice = 1.50 * blackQ;
        }
        if (regularRadio.isSelected()) {
            double regularQ = (double) Double.parseDouble(regularQty.getText());
            coffeePrice = 1.25 * regularQ;
        }
        if (cappRadio.isSelected()) {
            double cappQ = (double) Double.parseDouble(cappQty.getText());
            coffeePrice = 2.00 * cappQ;
        }
        if (frenchRadio.isSelected()) {
            double frenchQ = (double) Double.parseDouble(frenchQty.getText());
            coffeePrice = 2.50 * frenchQ;
        }

        //Toppings
        if (creamCheck.isSelected()) {
            double creamQ = (double) Double.parseDouble(creamQty.getText());
            toppingPrice += 0.50 * creamQ;
        }
        if (butterCheck.isSelected()) {
            double creamQ = (double) Double.parseDouble(butterQty.getText());
            toppingPrice += 0.25 * creamQ;
        }
        if (raspCheck.isSelected()) {
            double raspQ = (double) Double.parseDouble(raspQty.getText());
            toppingPrice += 0.75 * raspQ;
        }
        if (strawCheck.isSelected()) {
            double strawQ = (double) Double.parseDouble(strawQty.getText());
            toppingPrice += 0.75 * strawQ;
        }
        if (blueCheck.isSelected()) {
            double blueQ = (double) Double.parseDouble(blueQty.getText());
            toppingPrice += 0.75 * blueQ;
        }

        sTotal = bagelPrice + coffeePrice + toppingPrice;
        saleTotal.setText("$" + String.format("%.2f", sTotal));

        tax = 0.13 * sTotal;
        taxTotal.setText("$" + String.format("%.2f", tax));

        gTotal = sTotal * 1.13;
        grandTotal.setText("$" + String.format("%.2f", gTotal));
    }

    @FXML
    public void WritetoFile(ActionEvent event) throws IOException {
        File receipt = new File("receipt.txt");
        FileWriter receiptWriter;
        receiptWriter = new FileWriter(receipt);

        if (receipt.exists()) {
            receipt.delete();
            receiptWriter.write("----------Sheridan Bagel House Receipt-------------\n");
            receiptWriter.write("\n");
            receiptWriter.write("----------------Your Items-------------------------\n");
            receiptWriter.write("\n");
            if (whiteRadio.isSelected()) {
                receiptWriter.write("Bagel                                      Quantity\n");
                receiptWriter.write("White........................................  " + whiteQty.getText() + "\n");
            }
            if (wheatRadio.isSelected()) {
                receiptWriter.write("Bagel                                      Quantity\n");
                receiptWriter.write("Whole Wheat..................................  " + wheatQty.getText() + "\n");
            }
            if (cheddarRadio.isSelected()) {
                receiptWriter.write("Bagel                                      Quantity\n");
                receiptWriter.write("Cheddar......................................  " + cheddarQty.getText() + "\n");
            }
            if (poppyRadio.isSelected()) {
                receiptWriter.write("Bagel                                      Quantity\n");
                receiptWriter.write("Poppy Seed...................................  " + poppyQty.getText() + "\n");
            }
            if (blackRadio.isSelected()) {
                receiptWriter.write("Coffee                                     Quantity\n");
                receiptWriter.write("Black........................................  " + blackQty.getText() + "\n");
            }
            if (regularRadio.isSelected()) {
                receiptWriter.write("Coffee                                     Quantity\n");
                receiptWriter.write("Regular......................................  " + regularQty.getText() + "\n");
            }
            if (cappRadio.isSelected()) {
                receiptWriter.write("Coffee                                     Quantity\n");
                receiptWriter.write("Cappaccino...................................  " + cappQty.getText() + "\n");
            }
            if (frenchRadio.isSelected()) {
                receiptWriter.write("Coffee                                     Quantity\n");
                receiptWriter.write("French Vanilla...............................  " + blackQty.getText() + "\n");
            }
            if (toppingPrice > 0) {
                receiptWriter.write("Toppings                                   Quantity\n");
                if (creamCheck.isSelected()) {
                    receiptWriter.write("Cream Cheese.................................  " + creamQty.getText() + "\n");
                }
                if (butterCheck.isSelected()) {
                    receiptWriter.write("Butter.......................................  " + butterQty.getText() + "\n");
                }
                if (strawCheck.isSelected()) {
                    receiptWriter.write("Strawberry Jam...............................  " + strawQty.getText() + "\n");
                }
                if (raspCheck.isSelected()) {
                    receiptWriter.write("Raspberry Jam................................  " + raspQty.getText() + "\n");
                }
                if (blueCheck.isSelected()) {
                    receiptWriter.write("Blueberry Jam................................  " + blueQty.getText() + "\n");
                }
            }

            receiptWriter.write("---------------------------------------------------\n");
            receiptWriter.write("      Total:                                  $" + 
                    String.format("%.2f", sTotal) + "\n");
            receiptWriter.write("        Tax:                                  $" + 
                    String.format("%.2f", tax) + "\n");
            receiptWriter.write("Grand Total:                                  $" + 
                    String.format("%.2f", gTotal) + "\n");
            receiptWriter.write("---------------------------------------------------\n");
            receiptWriter.write("\n");
            receiptWriter.write("-----------------Thank You-------------------------\n");

            receiptWriter.close();

            Alert noticeAlert = new Alert(Alert.AlertType.INFORMATION);
            noticeAlert.setTitle("File made");
            noticeAlert.setHeaderText("Reciept Made");
            noticeAlert.setContentText("Your Reciept has been made.");
            noticeAlert.setResult(ButtonType.OK);
            noticeAlert.showAndWait();
        }
    }

    @FXML
    public void MenuItems(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Item Prices");
        alert.setHeaderText("Prices for Each Item");
        alert.setContentText("Bagel Prices \nWhite..........$1.25\n"
                + "Whole Wheat..........$1.50\nCheddar..........$2.00\n"
                + "Poppy..........$2.50\n\n"
                + "Coffee Prices\nBlack..........$1.50\nRegular..........$1.25\nCappuccino..........$2.00\n"
                + "French Vanilla..........$2.50\n\n"
                + "Topping Prices\nCream Cheese..........$0.50\n"
                + "Butter..........$0.25\nRaspberry Jam..........$0.75\n"
                + "Strawberry Jam..........$0.75\nBlueberry Jam..........$0.75");
        alert.showAndWait();
    }

    @FXML
    public void PrintReceipt(ActionEvent event) throws FileNotFoundException, PrintException, 
            InterruptedException {
        String filename = ("receipt.txt");
        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        DocFlavor text = DocFlavor.INPUT_STREAM.AUTOSENSE;
        PrintService printerService[] = PrintServiceLookup.lookupPrintServices(text, pras);
        PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();
        PrintService service = ServiceUI.printDialog(null, 200, 200, printerService, defaultService, text, pras);
        if (service != null) {
            DocPrintJob job = service.createPrintJob();
            FileInputStream fis = new FileInputStream(filename);
            DocAttributeSet das = new HashDocAttributeSet();
            Doc doc = new SimpleDoc(fis, text, das);
            job.print(doc, pras);
            Thread.sleep(10000);
        }
    }

}