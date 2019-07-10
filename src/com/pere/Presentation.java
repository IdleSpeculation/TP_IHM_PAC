package com.pere;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class Presentation {
	    private LineChart<Number,Number>  lineChart;
	    private XYChart.Series series;
		public Presentation() {

	        this.lineChart = new LineChart<Number,Number>(new NumberAxis(),new NumberAxis());

	        this.series = new XYChart.Series();
	        series.setName("My portfolio");
	        //populating the series with data
	        series.getData().add(new XYChart.Data(0, 0));
	        lineChart.getData().add(series);

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

		
}
