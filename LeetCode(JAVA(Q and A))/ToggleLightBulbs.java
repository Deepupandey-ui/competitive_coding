public class ToggleLightBulbs {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : bulbs) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        return result;
    }
}

