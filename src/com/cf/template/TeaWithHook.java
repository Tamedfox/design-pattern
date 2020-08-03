package com.cf.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cf
 * @version 1.0
 * @date 2020/8/3 20:52
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
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

        System.out.println("Would you like Lemon with your tea (y/n)？ ");

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
