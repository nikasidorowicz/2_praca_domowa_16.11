package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class Controller {

    public TextField imie;
    public TextField nazwisko;
    public TextField pesel;
    public TextField wiek;
    public TextField wzrost;

    public TableView<Czlowieczek> table;





    public static class Czlowieczek {

        protected String imie;
        protected String nazwisko;
        protected String pesel;
        protected String wiek;
        protected String wzrost;

        public Czlowieczek(String imie, String nazwisko, String pesel, String wiek, String wzrost) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.pesel = pesel;
            this.wiek = wiek;
            this.wzrost = wzrost;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public String getPesel() {
            return pesel;
        }

        public void setPesel(String pesel) {
            this.pesel = pesel;
        }

        public String getWiek() {
            return wiek;
        }

        public void setWiek(String wiek) {
            this.wiek = wiek;
        }

        public String getWzrost() {
            return wzrost;
        }

        public void setWzrost(String wzrost) {
            this.wzrost = wzrost;
        }
    }

    public void handleClick(ActionEvent actionEvent) {
        table.getItems().add(new Czlowieczek(imie.getText(), nazwisko.getText(), pesel.getText(), wiek.getText(), wzrost.getText() ));
    }

    public void initialize() {
        for (TableColumn<Czlowieczek, ?> column : table.getColumns()) {
            if ("kolImie".equals(column.getId())) {
                TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                textColumn.setCellValueFactory(new PropertyValueFactory<>("imie"));
            } else if ("kolNazw".equals(column.getId())) {
                TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                textColumn.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
            }
            else if ("kolPese".equals(column.getId())) {
                TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                textColumn.setCellValueFactory(new PropertyValueFactory<>("pesel"));
            }
            else if ("kolWiek".equals(column.getId())) {
                TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                textColumn.setCellValueFactory(new PropertyValueFactory<>("wiek"));
            }
            else if ("kolWzro".equals(column.getId())) {
                TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                textColumn.setCellValueFactory(new PropertyValueFactory<>("wzrost"));
            }
        }
    }
}
