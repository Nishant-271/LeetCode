class MedianFinder {

      private  PriorityQueue<Integer> p1=new PriorityQueue<>(Collections.reverseOrder());
       private PriorityQueue<Integer> p2=new PriorityQueue<>();
   private  boolean even=true;
    public MedianFinder() {
     even=true;
    }
    
    public  void addNum(int num) {
       if(even){
        p2.add(num);
        p1.add(p2.poll());
       } else{
        p1.add(num);
        p2.add(p1.poll());
       }
     even=!even;
    }
    
    public  double findMedian() {
        if(even){
            return (p1.peek()+p2.peek())/2.0;
        }
        else{
            return p1.peek()/1.0;
        }
    }
}
 