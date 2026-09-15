class StockSpanner {
    private ArrayList<int[]> arr;

    public StockSpanner() {
        arr = new ArrayList<>();    
    }
    
    public int next(int price) {
        int count=1;
        int index=arr.size()-1;
        while(index>=0 && arr.get(index)[0]<=price){
            count+=arr.get(index)[1];
            index = index-arr.get(index)[1];
        }
        arr.add(new int[] {price, count});
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */