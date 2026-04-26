public class Experiment {

    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(arr);
        } else {
            sorter.advancedSort(arr);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {

        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = sorter.generateRandomArray(size);
            sorter.advancedSort(sortedArray);

            int[] copy1 = randomArray.clone();
            int[] copy2 = randomArray.clone();

            long basicTime = measureSortTime(copy1, "basic");
            long advancedTime = measureSortTime(copy2, "advanced");

            sorter.advancedSort(copy2);

            int target = copy2[size / 2];
            long searchTime = measureSearchTime(copy2, target);

            System.out.println("Size: " + size);
            System.out.println("Bubble Sort time: " + basicTime);
            System.out.println("Merge Sort time: " + advancedTime);
            System.out.println("Binary Search time: " + searchTime);
            System.out.println("----------------------------");
        }
    }
}