package interview.immutableSet;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

/**
 * Memory and lookup efficient immutable Set.
 */
public final class ImmutableSet<T extends Comparable<? super T>> extends AbstractSet<T> {

private final T[] uniqueNonNullElements;

private ImmutableSet(T[] uniqueNonNullElements) {
        Arrays.parallelSort(uniqueNonNullElements);
        this.uniqueNonNullElements = uniqueNonNullElements;
        }

@Override
public int size() {
        return uniqueNonNullElements.length;
        }

@Override
public boolean contains(Object o) {
        return (o instanceof Comparable)?Arrays.binarySearch(uniqueNonNullElements, o) > -1:false;
        }

@Override
public Iterator<T> iterator() {
        return Arrays.stream(uniqueNonNullElements).iterator();
        }

@Override
public void forEach(Consumer<? super T> action) {
        for (T element : uniqueNonNullElements) {
        action.accept(element);
        }
        }

@Override
public Spliterator<T> spliterator() {
        return Spliterators.spliterator(uniqueNonNullElements,
        Spliterator.ORDERED
        | Spliterator.DISTINCT
        | Spliterator.SORTED
        | Spliterator.SIZED
        | Spliterator.SUBSIZED
        | Spliterator.NONNULL
        | Spliterator.IMMUTABLE

        );
        }





// @Override
//public int hashCode() {
//        int hashCode = 0;
//
//        for (T element : uniqueNonNullElements) {
//        hashCode += element.hashCode();
//
//        }
//        return hashCode;
//        }



//@Override
//public boolean equals(Object o) {
//
//
//        if (o == this) {
//        return true;
//        }
//
//        if (!(o instanceof Set)) {
//        return false;
//        }
//
//        Set<?> set = (Set<?>) o;
//
//        return (set.size() == size()) && containsAll(set);
//        }

@SuppressWarnings("unchecked")
public static <T extends Comparable<? super T>> ImmutableSet<T> fromCollection(Collection<T> collection) {
        Set<T> temporarySet = new HashSet<>(collection);
        temporarySet.remove(null);
        return new ImmutableSet<>(temporarySet.toArray((T[]) new Comparable[temporarySet.size()]));
        }
        }