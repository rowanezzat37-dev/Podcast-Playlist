public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1:\n");

        playlist p1 = new playlist();

        p1.AddEpisode("Business Basics", 1, 30, "bis");
        p1.AddEpisode("Intro to IT", 2, 20, "it");
        p1.AddEpisode("HR Skills", 3, 40, "hr");
        p1.traverse();
        p1.DeleteEpisode(2);
        p1.traverse();
        p1.searchCategory("bis");
        p1.getTotalListeningTime();
        p1.playNextEpisode();
        p1.playNextEpisode();

        System.out.println("\n\nTest 2:\n");

        playlist p2 = new playlist();

        p2.AddEpisode("AI Intro", 1, 25, "ai");
        p2.AddEpisode("Data Science", 2, 35, "data");
        p2.insert("Machine Learning", 3, 45, "ai", 2);
        p2.traverse();
        p2.DeleteEpisode(10);
        p2.searchCategory("security");
        p2.getTotalListeningTime();
        p2.playNextEpisode();
        p2.playNextEpisode();
        p2.playNextEpisode();
    }
}