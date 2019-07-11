package com.pere;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Presentation {
	    private LineChart<Number,Number>  lineChart;
	    private XYChart.Series series;
	    private HBox hbox ;
	    private TableView tableView;
		public Presentation(Stage primaryStage, com.chSaisie.Presentation presFils1, com.palette.Presentation presFils2,
				com.tableau.Presentation presFils3) {

	        this.lineChart = new LineChart<Number,Number>(new NumberAxis(),new NumberAxis());

	        this.series = new XYChart.Series();
	        this.tableView = presFils3.getTableView();
	        series.setName("Température celsus");
	        //populating the series with data
	        series.getData().add(new XYChart.Data(0, 0));
	        lineChart.getData().add(series);

	        Group root = new Group();
	        primaryStage.setTitle("Illustration du modele PAC");
	        primaryStage.setMinWidth(980);
	        primaryStage.setMinHeight(500);
	        Scene scene=new Scene(root);
	        VBox vbox1 = new VBox(presFils1.getLabel(), presFils1.getTextField(), presFils1.getButton());
	        vbox1.setPadding(new Insets(100));
	        HBox hbox1 = new HBox(presFils2.getAugmenter(), presFils2.getDiminuer(), presFils2.getRaz());
	        HBox hbox11 = new HBox(presFils3.getButton(), presFils3.getCacher());
	        VBox vbox111 =  new VBox(hbox1, hbox11);

	        vbox111.setPadding(new Insets(150));
	        HBox hbox2 = new HBox(this.getLineChart(),vbox1);
	        VBox vbox = new VBox (hbox2, vbox111);
	        this.hbox = new HBox(vbox);
	        root.getChildren().add(this.hbox);
	        primaryStage.setScene(scene);
	        primaryStage.show();
		}
		public LineChart<Number, Number> getLineChart() {
			return lineChart;
		}
		public void setLineChart(LineChart<Number, Number> lineChart) {
			this.lineChart = lineChart;
		}
		public XYChart.Series getSeries() {
			return series;
		}
		public void setSeries(XYChart.Series series) {
			this.series = series;
		}
		public HBox getHbox() {
			return hbox;
		}
		public void setHbox(HBox hbox) {
			this.hbox = hbox;
		}
		public TableView getTableView() {
			return tableView;
		}
		public void setTableView(TableView tableView) {
			this.tableView = tableView;
		}
		

		
}
