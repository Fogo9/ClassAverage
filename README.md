# **CLASS AVERAGE**

# Information

* **Class average and passing grade were calculated.**

# Technologies Used

* **JAVA**

# Contents

* In this project, it is written using only int variable.

* The scanner class was used to get the lecture notes data from the student.

* If the course grades are between 0-100, it is valid, if it is not between 0-100, that course grade is considered invalid.

* Using the if structure, 55 and below are written as unsuccessful, and above 55 as successful.

<br />

```Java

        import java.util.Scanner;

        public class ClassAverage {

            public static void main(String[] args) {

                int Mathematics, Physics, Chemical, Turkish, Music, average = 0;



```

```Java

                Scanner input = new Scanner(System.in);

                System.out.print("Your Mathematics Grade : ");

                Mathematics = input.nextInt();

                System.out.print("Your Physics Grade : ");

                Physics = input.nextInt();

                System.out.print("Your Chemical Grade : ");

                Chemical = input.nextInt();

                System.out.print("Your Turkish Grade : ");

                Turkish = input.nextInt();

                System.out.print("Your Music Grade : ");

                Music = input.nextInt();



```
```Java

                if (Mathematics >= 0 && Mathematics <= 100){

                average += Mathematics;

                }

                if (Physics >= 0 && Physics <= 100){

                    average += Physics;

                }

                if (Chemical >= 0 && Chemical <= 100){

                    average += Chemical;

                }

                if (Turkish >= 0 && Turkish <= 100){

                    average += Turkish;

                }

                if (Music >= 0 && Music <= 100){

                    average += Music;

                }


            }
        }


```

```bash

        Your Mathematics Grade : 105
        Your Physics Grade : 100
        Your Chemical Grade : 80
        Your Turkish Grade : 105
        Your Music Grade : 10
        You Failed The Class. Try Again !
        Your Average : 38

```
```bash

        Your Mathematics Grade : 55
        Your Physics Grade : 55
        Your Chemical Grade : 55
        Your Turkish Grade : 55
        Your Music Grade : 55
        You Failed The Class. Try Again !
        Your Average : 55

```
```bash

        Your Mathematics Grade : 60
        Your Physics Grade : 60
        Your Chemical Grade : 90
        Your Turkish Grade : 70
        Your Music Grade : 100
        You Passed The Class. Congratulations !
        Your Average : 76

```

<br />

# LINK

* Click here https://github.com/Fogo9/ClassAverage.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
