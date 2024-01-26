package gfgPotd;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value;
    int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class Fraction_knapsack {

    public static double fractionalKnapsack(Item[] arr, int W) {
        int n = arr.length;

        // Sorting the array based on value-to-weight ratio in descending order
        Arrays.sort(arr, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());

        double totalValue = 0.0;
        int currentWeight = 0;

        for (int i = 0; i < n; i++) {
            if (currentWeight + arr[i].weight <= W) {
                // Include the whole item in the knapsack
                currentWeight += arr[i].weight;
                totalValue += arr[i].value;
            } else {
                // Include a fraction of the item to fill the remaining capacity
                double remainingWeight = W - currentWeight;
                totalValue += (arr[i].value * remainingWeight) / arr[i].weight;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        // Example usage
        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        int knapsackCapacity = 50;

        double maxValue = fractionalKnapsack(items, knapsackCapacity);

        System.out.println("Maximum value in knapsack: " + maxValue);
    }
}
