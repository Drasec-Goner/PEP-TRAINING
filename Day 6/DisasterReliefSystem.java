import java.util.*;

class Region{
    private int regionId;
    private int severityScore;
    private int resourcesRequired;

    public Region(int regionId, int severityScore, int resourcesRequired) {
        this.regionId = regionId;
        this.severityScore = severityScore;
        this.resourcesRequired = resourcesRequired;
    }
    
    @Override
    public String toString() {
        return "[" + regionId +", "+ severityScore+", " + resourcesRequired + "]";
    }
}

public class DisasterReliefSystem
{
    private PriorityQueue<Region> severityPQ;
    private PriorityQueue<Region> resourcesPQ;
    private List<Region> regions;

    Comparator<Region> severityComparator = new Comparator<Region>() {
        @Override
        public int compare(Region o1, Region o2) {
            return Integer.compare(o1.severityScore, o2.severityScore);
        }
    };

    Comparator<Region> resourcesComparator = new Comparator<Region>() {
        @Override
        public int compare(Region o1, Region o2) {
            return Integer.compare(o2.resourcesRequired(), o1.resourcesRequired());
        }
    };
    public DisasterReliefSystem() {
        severityPQ = new PriorityQueue<>(severityComparator);
        resourcesPQ = new PriorityQueue<>(resourcesComparator);
        regions = new ArrayList<>();
    }

    public void addRegionRequest(int regionId, int severityScore, int resourcesRequired) {
        Region region = new Region(regionId, severityScore, resourcesRequired);
        regions.add(region);
        severityPQ.offer(region);
        resourcesPQ.offer(region);
        System.out.println("Region added successfully");
    }

    public void allocateResources() {
        if(severityPQ.isEmpty() || resourcesPQ.isEmpty()) {
           System.out.println("No regions to allocate resources");
           return;
       }
        Region allocatedRegion = severityPQ.poll();
        resourcesPQ.remove(allocatedRegion);

        System.out.println("Allocated Region"+ allocatedRegion);
    }

    public void topMaximumResourcesRequest() {
        if(resourcesPQ.isEmpty()) {
            System.out.println("No regions to allocate resources");
            return;
        }
        System.out.println("Region with maximum resources request: "+ resourcesPQ.peek());
    }

    public void printRegions() {
        System.out.println("Regions: ");
        for(Region region: regions) {
            System.out.println(region);
        }
    }
    public static void main(String[] args) {
        System.out.println("Disaster Relief System");
        DisasterReliefSystem disaster = new DisasterReliefSystem();

        disaster.addRegionRequest(1, 5, 50);
        disaster.addRegionRequest(2, 3, 20);
        disaster.addRegionRequest(3, 7, 70);
        disaster.printRegions();
        disaster.allocateResources();
        disaster.topMaximumResourcesRequest();
        disaster.printRegions();
    }
}