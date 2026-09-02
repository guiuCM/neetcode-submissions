/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        
        Map <Integer, Integer> events = new TreeMap<>();
        for (int i = 0; i < intervals.size(); ++i){
            if(events.containsKey(intervals.get(i).start)) return false;
            events.put(intervals.get(i).start, intervals.get(i).end);
        }
        int prev = -1;
        for(Map.Entry<Integer,Integer> entry: events.entrySet()){
            if(prev > entry.getKey()) return false;
            prev = entry.getValue();
        }
        return true;
    }
}
