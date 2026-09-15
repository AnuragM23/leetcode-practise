class StockSpanner {
    private ArrayList<Integer> arr;

    public StockSpanner() {
        arr = new ArrayList<>();    
    }
    
    public int next(int price) {
        arr.add(price);
        int count=0;
        for(int i=arr.size()-1; i>=0 && arr.get(i)<=price; i--){
            count++;
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */