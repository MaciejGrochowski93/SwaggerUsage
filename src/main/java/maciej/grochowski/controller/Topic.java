package maciej.grochowski.controller;

import io.swagger.annotations.ApiModelProperty;

public class Topic {

    @ApiModelProperty(notes = "ID is a unique number of every topic. There cannot be several instances with the same ID.")
    private String ID;
    @ApiModelProperty(notes = "This is the actual name of the topic, in example Maths topic")
    private String name;
    @ApiModelProperty(notes = "You can provide a brief description of the topic")
    private String description;

    public Topic(){

    }

    public Topic(String ID, String name, String description) {
        super(); // dodałem sam
        this.ID = ID;
        this.name = name;
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
