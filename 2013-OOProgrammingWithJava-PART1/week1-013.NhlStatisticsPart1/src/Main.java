
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        NHLStatistics.sortByGoals();
        System.out.println("Top ten players based on goals:");
        NHLStatistics.top(10);
        
        NHLStatistics.sortByPenalties();
        System.out.println("\nTop 25 players based on penalty ammounts");
        NHLStatistics.top(25);
        
        System.out.println("\nStatistics for Sidney Crosby: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("\nStatistics for Philadelphia Flyers: ");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("\nPlayers in Ducks, ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
