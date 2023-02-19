package com.example.animequiz

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"
fun getQuestions():ArrayList<Question>{
    val questionsList=ArrayList<Question>()

    val que1=Question(
        1,"What was Dio Exact line on this pannel?",R.drawable.dio,
        "Kaizoku ou ni ore wa naru",
       "Hō… mukatte kuru no kaHō… mukatte kuru no kanigezu ni kono DIO ni chikadzuite kuru no ka",
         "kono ore wa izure hokage no na o uketsuide, sendai no dono hokage o mo koete yarun da.",
     "Nandemo wa shiranaiwa yo. Shitteru koto dake"
    ,2
    )
    questionsList.add(que1)
    val que2=Question(
        2,"How many servants did Shinobu have before Araragi?",R.drawable.vamp,
        "1",
        "2",
        "3",
        "4"
        ,1
    )
    questionsList.add(que2)
    val que3=Question(
        3,"Where is Goku when he transforms into a Super Saiyan for the first time?",R.drawable.goku,
        "Planet Namek",
        "Planet Earth",
        "King Kai's Planet",
        "Planet Vegeta"
        ,1
    )
    questionsList.add(que3)
    val que4=Question(
        4,"How many buildings are there in Blue lock?",R.drawable.bluelock,
        "1",
        "2",
        "3",
        "5"
        ,4
    )
    questionsList.add(que4)
    val que5=Question(
        5,"What is samehada?",R.drawable.samehada,
        "A giant Possum",
        "A talking hat",
        "A mystical sword",
        "Naruto's dad"
        ,3
    )
    questionsList.add(que5)
    val que6=Question(
        6,"What did he say here?",R.drawable.one,
        "Luffy ja nega",
        "People's dream don't ever end",
        "Bite me",
        "Fight me right now"
        ,2
    )
    questionsList.add(que6)
    val que7=Question(
        7,"Which military branch protects the King?",R.drawable.aot,
        "Garrison Regiment",
        "Scout Regiment",
        "Military Police Regiment",
        "Royal Service Regiment"
        ,3
    )
    questionsList.add(que7)
    val que8=Question(
        8,"What should you do here?",R.drawable.pc,
        "Take the potato chips and eat",
        "What is this",
        "Watch tv",
        "Study"
        ,1
    )
    questionsList.add(que8)
    val que9=Question(
        9,"Which song was she listening to ?",R.drawable.jump,
        "Krsna - Lil Bunty",
        "Emiway - Jump kar",
        "MC Stan - Ek din Pyar",
        "Chen k - Kon"
        ,2
    )
    questionsList.add(que9)
    val que10=Question(
        10,"But can he beat goku tho?",R.drawable.g,
        "Yes",
        "NO",
        "In his dream",
        "Goku will beat him in his dream as well"
        ,4
    )
    questionsList.add(que10)
    return questionsList
}
}