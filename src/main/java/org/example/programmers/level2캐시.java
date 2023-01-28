package org.example.programmers;

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        ArrayList<String> cache = new ArrayList<>();

        int answer = 0;

        if(cacheSize==0){
            answer = cities.length *5;
            return answer;
        }

        for(String city: cities){
            String str =city.toUpperCase();
            if(cache.contains(str)){
                cache.remove(str);
                cache.add(str);
                answer++; //1증가
            }

            else {
                if(cache.size() == cacheSize) {
                    cache.remove(0); //꽉차있으면 오래된캐시를 제거

                }
                cache.add(str); //새로운도시 추가
                answer+=5;//캐시미스
            }
        }
        return answer;
    }
}