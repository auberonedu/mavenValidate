package io.github.auberonedu.mavenValidate;

import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.TimeSeriesCollection;
import java.time.LocalDate;
import java.util.Random;



/**
 * Entry point: builds some example data, creates the chart, and displays it.
 */
public class App {

    public static void main(String[] args) {
        // Build the data model
        DataModel model = new DataModel();
        LocalDate start = LocalDate.now();
        Random rand = new Random();
        double value = rand.nextDouble() * 10;  // Start somewhere between 0 and 10

        // Generate 10 points that mostly increase over time
        for (int i = 0; i < 10; i++) {
            model.addDataPoint(new DataPoint(start.plusDays(i), value));
            // Mostly positive changes: random in [+0.2, +2.0]
            value += 0.2 + rand.nextDouble() * 1.8;
        }

        // Create chart
        TimeSeriesCollection dataset = model.getDataset();
        ChartGenerator generator = new ChartGenerator();
        JFreeChart chart = generator.createChart(dataset);

        // Display
        displayChart(chart);
    }

    private static void displayChart(JFreeChart chart) {
        JFrame frame = new JFrame("Maven Understanding Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
