package com.team;

import java.util.Scanner;

/**
 * TestTeam class demonstrates the Team class functionality.
 * Creates three Team objects using user input via setTeamData method.
 * Displays all team details including the motto.
 */
public class TestTeam {
    
    /**
     * Prompts user for team data using Scanner and returns a new Team object.
     * @param scanner The Scanner object for input
     * @return A new Team object with user-provided data
     */
    public static Team setTeamData(Scanner scanner) {
        System.out.println("Enter high school name:");
        String highSchoolName = scanner.nextLine();
        
        System.out.println("Enter sport:");
        String sport = scanner.nextLine();
        
        System.out.println("Enter team name:");
        String teamName = scanner.nextLine();
        
        // Create and return temporary Team object
        return new Team(highSchoolName, sport, teamName);
    }
    
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare three Team objects
        Team team1, team2, team3;
        
        System.out.println("=== Team 1 Input ===");
        team1 = setTeamData(scanner);
        
        System.out.println("\n=== Team 2 Input ===");
        team2 = setTeamData(scanner);
        
        System.out.println("\n=== Team 3 Input ===");
        team3 = setTeamData(scanner);
        
        // Display all team details
        System.out.println("\n=== TEAM DETAILS ===");
        displayTeamDetails(team1);
        displayTeamDetails(team2);
        displayTeamDetails(team3);
        
        scanner.close();
    }
    
    /**
     * Displays complete details for a given team.
     * @param team The Team object to display
     */
    private static void displayTeamDetails(Team team) {
        System.out.println("High School: " + team.getHighSchoolName());
        System.out.println("Sport: " + team.getSport());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Motto: " + Team.MOTTO);
        System.out.println("-------------------");
    }
}
