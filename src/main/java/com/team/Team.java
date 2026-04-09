package com.team;

/**
 * Team class represents a school sports team with basic information.
 * Includes private fields, constructor, getters, and a team motto.
 */
public class Team {
    // Private fields for team information
    private String highSchoolName;
    private String sport;
    private String teamName;
    
    // Public static final MOTTO for the team
    public static final String MOTTO = "Sportsmanship!";
    
    /**
     * Constructor that initializes all team fields.
     * @param highSchoolName The name of the high school
     * @param sport The sport played by the team
     * @param teamName The name of the team
     */
    public Team(String highSchoolName, String sport, String teamName) {
        this.highSchoolName = highSchoolName;
        this.sport = sport;
        this.teamName = teamName;
    }
    
    /**
     * Getter for high school name.
     * @return The high school name
     */
    public String getHighSchoolName() {
        return highSchoolName;
    }
    
    /**
     * Getter for sport.
     * @return The sport name
     */
    public String getSport() {
        return sport;
    }
    
    /**
     * Getter for team name.
     * @return The team name
     */
    public String getTeamName() {
        return teamName;
    }
}
