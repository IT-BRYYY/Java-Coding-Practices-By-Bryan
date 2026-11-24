package OOP;

abstract class CacheStorage {
    private String cacheName;
    private int capacity;
    private int usedSpace;

    public CacheStorage(String cacheName, int capacity, int usedSpace) {
        this.cacheName = cacheName;
        this.capacity = capacity;
        this.usedSpace = usedSpace;
    }

    public String getCacheName() {
        return cacheName;
    }

    public int capacity() {
        return capacity;
    }

    public int usedSpace() {
        return usedSpace;
    }

    protected void setUsedSpace(int usedSpace) {
        this.usedSpace = usedSpace;
    }

    public abstract void clearCache();

    public void displayInfo() {

        System.out.println("Cache: " + cacheName);
        System.out.println("Capacity: " + capacity + " MB");
        System.out.println("Used Space: " + usedSpace + " MB");
    }
}

interface CacheRefreshable {
    void refreshCache();
}

class MemoryCache extends CacheStorage implements CacheRefreshable {
    public MemoryCache(String cacheName, int capacity, int usedSpace){
        super(cacheName, capacity, usedSpace);
    }

    @Override
    public void clearCache (){
        setUsedSpace(0);
        System.out.println("Memory cache cleared.");
    }

    @Override
    public void refreshCache(){
        setUsedSpace(20);
        System.out.println("Memory cache refreshed.");
    }
}

class DiskCache extends CacheStorage implements CacheRefreshable {
    public DiskCache(String cacheName, int capacity, int usedSpace){
        super(cacheName,capacity,usedSpace);
    }

    @Override
    public void clearCache() {
        setUsedSpace(0);
        System.out.println("Disk cache cleared");
    }

    @Override
    public void refreshCache(){
        setUsedSpace(50);
        System.out.println("Disk cache refreshed");
    }
}

public class CacheManagementDemo {
    public static void main (String [] args) {

        CacheStorage[] caches = {
                new MemoryCache("Session Cache", 100, 75),
                new DiskCache("Image Cache", 500, 320)
        };

        for(CacheStorage cache : caches) {
            cache.displayInfo();

            cache.clearCache();

            System.out.println("After Clearing:");
            cache.displayInfo();

            CacheRefreshable refreshable = (CacheRefreshable) cache;
            refreshable.refreshCache();

            System.out.println("After Refreshing:");
            cache.displayInfo();

            System.out.println();
        }
    }
}