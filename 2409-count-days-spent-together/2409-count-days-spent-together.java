class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        ArrayList<Integer> days = new ArrayList<>(Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
        ArrayList<Integer> daysAlice = new ArrayList<>();
        ArrayList<Integer> daysBob = new ArrayList<>();
        int startmonthBob = Integer.parseInt(arriveBob.substring(0,2)), endmonthBob = Integer.parseInt(leaveBob.substring(0,2)), startdaybob = Integer.parseInt(arriveBob.substring(3,5)), endaybob =  Integer.parseInt(leaveBob.substring(3,5));  
        int startmonthAlice = Integer.parseInt(arriveAlice.substring(0,2)), endmonthAlice = Integer.parseInt(leaveAlice.substring(0,2)), startdayalice = Integer.parseInt(arriveAlice.substring(3,5)), endayalice =  Integer.parseInt(leaveAlice.substring(3,5));  

        int startdayb = 0 ; 
        int enddayb = 0;
        for (int i = 0 ; i < days.size() ; i++){
            if ( i == (startmonthBob-1)){
                break;
            }
            startdayb += days.get(i);
        }
        startdayb += startdaybob;

        for (int i = 0 ; i < days.size() ; i++){
            if ( i == (endmonthBob-1)){
                break;
            }
            enddayb += days.get(i);
        }
        enddayb += endaybob;


        int startdaya = 0 ; 
        int enddaya = 0;

        for (int i = 0 ; i < days.size() ; i++){
            if ( i == (startmonthAlice-1)){
                break;
            }
            startdaya += days.get(i);
        }
        startdaya += startdayalice;

        for (int i = 0 ; i < days.size() ; i++){
            if ( i == (endmonthAlice-1)){
                break;
            }
            enddaya += days.get(i);
        }
        enddaya += endayalice;

        for (int i = startdayb ; i <= enddayb ; i++){
            daysBob.add(i);
        }
        for (int i = startdaya ; i <= enddaya ; i++){
            daysAlice.add(i);
        }
        

        daysBob.retainAll(daysAlice);
        return daysBob.size();
    }
}