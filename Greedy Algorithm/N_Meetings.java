import java.util.*;

class Meeting{
    int start;
    int end;
    int position;
    
    Meeting(int start, int end, int position){
        this.start = start;
        this.end = end;
        this.position = position;
    }
}

public class N_Meetings{
    public static ArrayList<Integer> maxMeetings(int[] start, int[] end, int n){
        ArrayList<Meeting> meetings = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            meetings.add(new Meeting(start[i], end[i], i + 1));
        }
        
        Collections.sort(meetings, (a, b) -> {
            if(a.end == b.end){
                return a.end - b.end;
            }
            
            return a.end - b.end;
        });
        
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meetings.get(0).position);
        int freeTime = meetings.get(0).end;
        
        for(int i = 1; i < n; i++){
            if(meetings.get(i).start > freeTime){
                answer.add(meetings.get(i).position);
                freeTime = meetings.get(i).end;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int n = start.length;

        ArrayList<Integer> ans = maxMeetings(start, end, n);

        System.out.println("Meetings that can be performed:");

        for (int meeting : ans) {
            System.out.print(meeting + " ");
        }
    }
}