/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.problem_java;

import java.util.Random;


public class RandomNum {
    public String RndNum() {
        String nums = "0123456789";
        String words = "АБВГДЕЖЗИКЛМНОПРСТУФХЦШЩЭЮЯ";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        char[] randnum = new char[4];
        sb.append(randnum[0] = words.charAt(rnd.nextInt(words.length())));
        for(int i = 1; i < randnum.length; i++)
        {
            sb.append(randnum[i] = nums.charAt(rnd.nextInt(nums.length())));
        }
        return sb.toString();
    }
}
