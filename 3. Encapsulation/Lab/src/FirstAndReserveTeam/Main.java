package FirstAndReserveTeam;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Black Eagles");

        for (Person player : team.getFirstTeam()) {
            team.addPlayer(player);
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
