class MyHashMap {
    private ArrayList<Integer> keyArr;
    private ArrayList<Integer> valueArr;
    
    public MyHashMap() {
        keyArr = new ArrayList<>();
        valueArr = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for(int i=0; i<keyArr.size(); i++) {
            if(keyArr.get(i) == key){
                valueArr.set(i, value);
                return;
            }
        }
        keyArr.add(key);
        valueArr.add(value);
    }
    
    public int get(int key) {
        for(int i=0; i<keyArr.size(); i++) {
            if(keyArr.get(i) == key) return valueArr.get(i);
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0; i<keyArr.size(); i++) {
            if(keyArr.get(i) == key) {
                keyArr.remove(i);
                valueArr.remove(i);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */