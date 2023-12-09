import java.util.function.ToIntFunction;

public interface Comparator<T> extends java.util.Comparator<T> {
    int compare(T o1, T o2);

    @Override
    default java.util.Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor) {
        return java.util.Comparator.super.thenComparingInt(keyExtractor);
    }


}
