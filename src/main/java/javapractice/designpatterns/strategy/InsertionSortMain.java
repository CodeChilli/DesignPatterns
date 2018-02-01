package javapractice.designpatterns.strategy;

public class InsertionSortMain {
    public static void main(String[] args) {

        int[] numbers = {8, 98, 45, 23, 0, 1, 89, 900};

        SortingContext sortingContext=new SortingContext(new InsertionSort());
        sortingContext.sortNumbers(numbers);

        sortingContext.setSortingStrategy(new SelectionSort());
        sortingContext.sortNumbers(numbers);
    }
}
