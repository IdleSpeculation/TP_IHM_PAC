package com.tableau;


import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class Presentation {
	   	private TableView tableView;
	   	private Button button;
	   	private Button cacher;
		public Presentation() {
			this.button = new Button("Afficher Tableau");
			this.cacher = new Button("Cacher Tableau");

	        this.tableView = new TableView();
	        
	        TableColumn<Integer, com.pere.Abstraction> column = new TableColumn<Integer, com.pere.Abstraction>("Temperature");
	        column.setCellValueFactory(new PropertyValueFactory<>("temperature"));
	        this.tableView.getColumns().add(column);	        
	        this.tableView.getItems().add(new com.pere.Abstraction());

		}
		public TableView getTableView() {
			return tableView;
		}
		public void setTableView(TableView tableView) {
			this.tableView = tableView;
		}
		public Button getButton() {
			return button;
		}
		public void setButton(Button button) {
			this.button = button;
		}
		public Button getCacher() {
			return cacher;
		}
		public void setCacher(Button cacher) {
			this.cacher = cacher;
		}
		
		
}
