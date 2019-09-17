package com.example.mytodo

import com.example.mytodo.models.ToDo

class DataSource {

    companion object{
        fun createDataSet(): ArrayList<ToDo>{
            val list = ArrayList<ToDo>()
            list.add(
                ToDo(
                    "Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!"
                )
            )
            list.add(
                ToDo(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/."
                )
            )

            list.add(
                ToDo(
                    "Interviewing a Web Developer and YouTuber",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years."
                )
            )
            list.add(
                ToDo(
                    "Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!"
                )
            )
            list.add(
                ToDo(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/."
                )
            )

            list.add(
                ToDo(
                    "Interviewing a Web Developer and YouTuber",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years."
                )
            )
            list.add(
                ToDo(
                    "Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!"
                )
            )
            list.add(
                ToDo(
                    "Time to Build a Kotlin App!",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/."
                )
            )

            list.add(
                ToDo(
                    "Interviewing a Web Developer and YouTuber",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years."
                )
            )
            return list
        }
    }
}