/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class anchor{

    Question[] questions=new Question[3];
    Anchor anchor=new Anchor();

    String[] questionsdata={"Who is the best anchor?","Who is the best singer?","What is your favourite chats?"};
    String[] options1={"anushree "," aditi sagar","pizza"};
    String[] options2={"aprna","Kavya ajit","cake"};
    String[] options3={"akul alajii","anuupama","Ice-cream "};
    String[] options4={",srujan lokesh" javed ","chocolates"};
    int[] answers={2,3,4};


    public void initGame()
    {
//        created three objects
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }
//        applying values to the variables of the object
//        questions[0].question="Who is the best anchor?";
//        questions[0].option1="akul balaji ";
//        questions[0].option2="anushree ";
//        questions[0].option3="aprna";
//        questions[0].option4="srujan lokesh ";
//        questions[0].correctAnswer=2;
//
//        questions[1].question="";
//        questions[1].option1="aditi sagar ";
//        questions[1].option2="Kavya ajit";
//        questions[1].option3="jabed";
//        questions[1].correctAnswer=3;
//
//        questions[2].question="";
//        questions[2].option1="cake";
//        questions[2].option2="piza";
//        questions[2].option3="ice cream ";
//        questions[2].option4="chocolates";
//        questions[2].correctAnswer=2;

        for(int i=0;i<3;i++)
        {

            questions[i].ques
