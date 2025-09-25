class Solution {
    public int dayOfYear(String date) {
        int[] mon={31,28,31,30,31,30,31,31,30,31,30,31};
        String s[]=date.split("\\-");
        int year=Integer.parseInt(s[0]);
        System.out.println(year);
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            mon[1]=29;
        }
        int days=0;
        int month=Integer.parseInt(s[1]);
        System.out.println(month+""+mon[1]);

        for(int i=1;i<month;i++){
            days+=mon[i-1];
            System.out.println(days);
        }
        int d=Integer.parseInt(s[2]);
        days+=d;
        return days;

        
    }
}