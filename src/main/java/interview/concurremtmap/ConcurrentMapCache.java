package interview.concurremtmap;

import java.util.Map;

import java.util.Objects;

import java.util.concurrent.ForkJoinPool;

import java.util.concurrent.Callable;

import java.util.concurrent.ConcurrentHashMap;

import java.util.concurrent.ConcurrentMap;



public class ConcurrentMapCache<T> {


    private final Map<Object, Object> store;


//    public ConcurrentMapCache() {
//        this(new ConcurrentHashMap<>());
//    }

    //Regular constructor syntax
    public ConcurrentMapCache() {
        this.store = new ConcurrentHashMap<>();
    }


    public ConcurrentMapCache(Map<Object, Object> store) {
        Objects.requireNonNull(store, "Store must not be null");
        this.store = store;
    }


    public final Map<Object, Object> getNativeCache() {
        return store;
    }


    protected Object lookup(Object key) {
        return store.get(key);
    }


//    public T get(Object key, Callable<T> supplier) {
//        return (T) store.computeIfAbsent(key, r -> {
//            try {
//                return supplier.call();
//            } catch (Throwable ex) {
//                throw new RuntimeException("Exception loading value from provided supplier", ex);
//            }
//
//        });
//    }

    //safe typecast get method
    public T get(Object key, Callable<T> supplier, Class<T> t) {

        T O;
        try {
            O = t.cast(store.computeIfAbsent(key, (Object r) -> {
                try {
                    return supplier.call();
                } catch (Exception ex) {
                    throw new RuntimeException("Exception loading value from provided supplier", ex);
                }
            }));
        } catch (ClassCastException ex) {
            throw new RuntimeException("Alarm !!!!!!!", ex);
        }
        return O;
    }

    public void put(Object key, Object value) {
        store.put(key, value);
    }



//safe typecast putIfAbsent method
    public T putIfAbsent(Object key, Object value, Class<T> t) {
        T O;
        try {
            O = t.cast(store.putIfAbsent(key, value));
        }
         catch (ClassCastException ex) {
            throw new RuntimeException("Alarm !!!!!!!", ex);
        }
        return O ;
    }
//    public T putIfAbsent(Object key, Object value) {
//        return (T) store.putIfAbsent(key, value);
//    }


    public void evict(Object key) {
        store.remove(key);
    }


    public void clear() {
        store.clear();
    }

}