import java.util.*;

public class Main {
    public static void main(String[] args) {
        // İhtiyaç noktaları ve kaynaklar
        List<String> locations = new ArrayList<>(Arrays.asList("Lokasyon1", "Lokasyon2", "Lokasyon3", "Lokasyon4", "Lokasyon5", "Lokasyon6", "Lokasyon7", "Lokasyon8", "Lokasyon9", "Lokasyon10"));
        List<String> sources = new ArrayList<>(Arrays.asList("A", "B", "C"));

        // İhtiyaçlar ve stoklar
        Map<String, Map<String, Integer>> needs = new HashMap<>();
        Map<String, Integer> healthNeeds = new HashMap<>();
        healthNeeds.put("A", 100);
        healthNeeds.put("B", 50);
        healthNeeds.put("C", 150);
        needs.put("Sağlık Malzemesi", healthNeeds);

        Map<String, Integer> foodNeeds = new HashMap<>();
        foodNeeds.put("A", 200);
        foodNeeds.put("B", 250);
        foodNeeds.put("C", 150);
        needs.put("Temel Gıda", foodNeeds);

        Map<String, Integer> heatingNeeds = new HashMap<>();
        heatingNeeds.put("A", 50);
        heatingNeeds.put("B", 100);
        heatingNeeds.put("C", 200);
        needs.put("Isınma Gereci", heatingNeeds);

        Map<String, Integer> clothingNeeds = new HashMap<>();
        clothingNeeds.put("A", 75);
        clothingNeeds.put("B", 50);
        clothingNeeds.put("C", 100);
        needs.put("Giyecek", clothingNeeds);

        // Graf oluşturalım
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        for (String location : locations) {
            graph.put(location, new HashMap<>());
            for (String source : sources) {
                graph.get(location).put(source, 0);
            }
        }

        // Kaynaklardan ihtiyaç noktalarına bağlantıları belirleyelim
        for (String location : locations) {
            for (String source : sources) {
                int distance = calculateDistance(location, source); // mesafeyi hesaplayalım
                int cost = calculateCost(location, source, needs); // maliyeti hesaplayalım
                graph.get(location).put(source, distance * cost); // grafı güncelleyelim
            }
        }

        // En kısa yol hesaplaması yapalım
        Map<String, Integer> shortestDistances = dijkstra(graph, "A");

        // Sonuçları yazdıralım
        for (String location : locations) {
            System.out.println(location + ": " + shortestDistances.get(location));
        }
    }

    // Mesafe hesaplama fonksiyonumuz
   private static int calculateDistance(String location, String source) {
       // mesafelerin rastgele atamasını yapalım
       Random r = new Random();
       return r.nextInt();
    
    }

    private static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, String a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static int calculateCost(String location, String source, Map<String, Map<String, Integer>> needs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
