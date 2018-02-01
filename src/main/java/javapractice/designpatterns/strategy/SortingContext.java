package javapractice.designpatterns.strategy;

/**
 * Created by priya on 2/1/2018.
 */
public class SortingContext {
    public SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public String sortNumbers(int[] numbers){
        return  sortingStrategy.sort(numbers);
    }
}
