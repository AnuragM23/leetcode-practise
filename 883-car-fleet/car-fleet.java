class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<position.length; i++) {
            map.put(position[i], speed[i]);
        }

        Arrays.sort(position);
        double ref_time = -1.0;
        int fleet_counter = 0;

        for(int i=position.length-1; i>=0; i--) {
            double time = (double) (target-position[i]) / map.get(position[i]);
            if(time > ref_time) {
                fleet_counter++;
                ref_time = time;
            }
        }

        return fleet_counter;
    }
}
