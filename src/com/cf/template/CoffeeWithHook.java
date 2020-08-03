package com.cf.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cf
 * @version 1.0
 * @date 2020/8/3 20:45
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)？ ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
