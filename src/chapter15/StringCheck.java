package chapter15;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck check = new StringCheck();

        String address[] = new String[] {
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동",
        };
        check.checkAddress(address);
    }

    public void checkAddress(String[] addresses) {
        int startCount=0, endCount = 0, containCount = 0;
        String startText = "서울시";
        String endText = "동";
        String containText = "구로";
        for(String address : addresses){
            if(address.startsWith(startText)) {
                startCount++;
            }
            if(address.endsWith(endText)) {
                endCount++;
            }
            if(address.contains(containText)) {
                containCount++;
            }
        }

        System.out.printf("""
                     Starts with %s
                     count is %d
                    %n""", startText, startCount);

        System.out.printf("""
                     Ends with %s
                     count is %d
                    %n""", endText, endCount);

        System.out.printf("""
                    Contains %s 
                    count is %d
                    """, containText, containCount);
    }
}
