/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.loxa.sna.gephi.websiteexporter.util.statistics;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author jorgaf
 */
public class StatisticsJSON {
    private String date;
    private String author;
    private String description;
    private List<GraphStatistic> graphs = new ArrayList<GraphStatistic>();

    public StatisticsJSON() {
        this.date = GregorianCalendar.getInstance().getTime().toString();
        this.author = "jorgaf";
        this.description = "File created by Web site exporter. http://loxa.ec";
    }



    public StatisticsJSON(String date, String author, String description, List<GraphStatistic> graphs) {
        this.date = date;
        this.author = author;
        this.description = description;
        this.graphs = graphs;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the graphs
     */
    public List<GraphStatistic> getGraphs() {
        return graphs;
    }

    /**
     * @param graphs the graphs to set
     */
    public void addGraph(GraphStatistic graphs) {
        this.graphs.add(graphs);
    }

    public String toJSON(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}