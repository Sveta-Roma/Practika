package org.itstep.qa.lesson;

public class Task06_1 {
    public static void main(String[] args) {
        String start = "12:45:25";
        String finish = "17:25:32";
        String [] arrStart = start.split (":");
        String [] arrFinish = finish.split (":");
        int [] arrResult = new int[arrStart.length];
        int startTemp, finishTemp;
        for(int i = 0; i < arrStart.length; i++){
            startTemp = Integer.parseInt(arrStart[i]);
            finishTemp = Integer.parseInt(arrFinish[i]);
            if (finishTemp - startTemp >= 0){
                arrResult[i] = finishTemp - startTemp;
            } else {
                if (i != 0){
                    arrResult[i] = finishTemp + 60 - startTemp;
                } else {
                    arrResult[i] = finishTemp + 24 - startTemp;
                }
            }
        }
        System.out.println("Промежуток: " + arrResult[0] + ":" + arrResult[1] + ":" + arrResult[2]);
    }
}
