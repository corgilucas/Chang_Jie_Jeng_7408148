package com.example.chut.assignment1;

public class Questions {
    //Create an array to store questions.
    public String mQuestions[] = {
            "1+1=",
            "1-1=",
            "1*1=",
            "1/1="
    };

    //Create an array to store available answer for each question.
    private String mChoices[][] = {
            {"0","1","2","3"},
            {"0","1","2","3"},
            {"0","1","2","3"},
            {"0","1","2","3"},
    };

    //Create an array to store the correct answer for each questions.
    private String mCorrectAnswers[] = {"2","0","1","1"};

    public String getQuestions(int a){
        String question = mQuestions[a];
        return question;
    }

    public  String getChoice1(int a){
        String choice = mChoices[a][0];
        return  choice;
    }

    public  String getChoice2(int a){
        String choice = mChoices[a][1];
        return  choice;
    }

    public  String getChoice3(int a){
        String choice = mChoices[a][2];
        return  choice;
    }

    public  String getChoice4(int a){
        String choice = mChoices[a][3];
        return  choice;
    }

    public  String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return  answer;
    }
}
