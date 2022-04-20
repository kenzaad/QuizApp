package com.addi.quizapp_C;


public class Questions {
    public String Truevalue;
    public String Falsevalue;
    public String Question;
    public String image;


    public Questions(){

    }


    public Questions(String Question,String Truevalue, String falsevalue,String image){



        this.Question=Question;
        this.Truevalue = Truevalue;
        this.Falsevalue =  falsevalue;
        this.image=image;

    }

}



