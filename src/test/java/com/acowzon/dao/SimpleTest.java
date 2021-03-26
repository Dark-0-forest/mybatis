package com.acowzon.dao;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleTest {

    @Test
    public void simple(){
        int[][] page = new int[6][4];
        page[0] = new int[]{0, 1, 2, 3};
        page[1] = new int[]{4, 5, 10, 11};
        page[2] = new int[]{6, 7, 12, 13};
        page[3] = new int[]{8, 9, 14, 15};
        page[4] = new int[]{20, 21, 22, 23};
        page[5] = new int[]{16, 17, 18, 19};
        int[] cube = new int[]{2, -3, -2, 3, 7, -6, -6, -7, 9, -5, -9, -3, -2, 1, 4, -9, -1, -10, -5, -5, -10, -4, 8, 2};
        int res1 = 0;
        for (int i = 0; i < page.length; i++) {
            int res2 = 0;
            for (int j = 0; j < page[i].length; j++) {
                res2 += cube[page[i][j]];
            }
            res1 += res2;
        }
        System.out.println(res1);
    }

    @Test
    public void test2(){
        int n = 3;
        int x = 1;
        x--;
        int[] room = new int[n];
        room[0] = 6;
        room[1] = 5;
        room[2] = 1;
        int count = 0;

        while (true){
            if (room[x] == 0){break;}
            room[x]--;
            count++;
            x = (x - 1 + n) % n;
        }
        room[x] = count;
        for (int i : room) {
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
        
    }
}
